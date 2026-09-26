package h.burgenland.simulator.lab;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@ConditionalOnProperty("simulator.pinata.jwt")
public class PinataClient {

    private static final String PIN_FILE_URL = "https://api.pinata.cloud/pinning/pinFileToIPFS";
    private static final String BOUNDARY = "----HoneySupplyChainSimulatorBoundary";

    private final String jwt;
    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public PinataClient(@Value("${simulator.pinata.jwt}") String jwt) {
        this.jwt = jwt;
    }

    public String uploadPdf(byte[] pdfBytes, String fileName) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(PIN_FILE_URL))
                .header("Authorization", "Bearer " + jwt)
                .header("Content-Type", "multipart/form-data; boundary=" + BOUNDARY)
                .POST(HttpRequest.BodyPublishers.ofByteArray(buildMultipartBody(pdfBytes, fileName)))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("Pinata upload failed with status " + response.statusCode() + ": " + response.body());
        }
        return objectMapper.readTree(response.body()).get("IpfsHash").asText();
    }

    private byte[] buildMultipartBody(byte[] pdfBytes, String fileName) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(("--" + BOUNDARY + "\r\n").getBytes());
        out.write(("Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName + "\"\r\n").getBytes());
        out.write("Content-Type: application/pdf\r\n\r\n".getBytes());
        out.write(pdfBytes);
        out.write(("\r\n--" + BOUNDARY + "--\r\n").getBytes());
        return out.toByteArray();
    }
}

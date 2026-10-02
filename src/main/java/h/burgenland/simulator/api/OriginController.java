package h.burgenland.simulator.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import h.burgenland.simulator.lab.PinataClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/origin")
public class OriginController {

    private final PinataClient pinataClient;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public OriginController(PinataClient pinataClient) {
        this.pinataClient = pinataClient;
    }

    @PostMapping
    public OriginResponse upload(@RequestBody OriginRequest request) throws IOException, InterruptedException {
        if (request.regions() == null || request.regions().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "at least one region is required");
        }
        String json = objectMapper.writeValueAsString(Map.of("regions", request.regions()));
        String cid = pinataClient.uploadJson(json, "herkunft.json");
        return new OriginResponse(cid);
    }
}

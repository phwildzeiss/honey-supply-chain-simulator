package h.burgenland.simulator.certification;

import h.burgenland.simulator.mci.Certification;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CertificationPdfTest {

    @Test
    void rendersAValidPdf() {
        byte[] pdf = CertificationPdf.render("Max Mustermann", Certification.EU_ORGANIC);
        assertEquals("%PDF", new String(pdf, 0, 4, StandardCharsets.US_ASCII));
    }

    @Test
    void namesWithXmlSpecialCharactersDoNotBreakRendering() {
        byte[] pdf = CertificationPdf.render("Imkerei Müller & Söhne <Bio> \"Honig\"", Certification.ASSOCIATION_ORGANIC);
        assertEquals("%PDF", new String(pdf, 0, 4, StandardCharsets.US_ASCII));
    }
}

package h.burgenland.simulator.certification;

import h.burgenland.simulator.mci.Certification;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

public final class CertificationPdf {

    private CertificationPdf() {
    }

    public static byte[] render(String beekeeperName, Certification certification) {
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(buildHtml(beekeeperName, certification));
        renderer.layout();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        renderer.createPDF(out);
        return out.toByteArray();
    }

    private static String buildHtml(String beekeeperName, Certification certification) {
        return """
                <?xml version="1.0" encoding="UTF-8"?>
                <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
                <html xmlns="http://www.w3.org/1999/xhtml">
                <head>
                <style>
                    body { font-family: Helvetica, sans-serif; font-size: 12pt; }
                    h1 { font-size: 18pt; }
                    table { border-collapse: collapse; width: 100%%; margin-top: 20px; }
                    td, th { border: 1px solid #999999; padding: 6px 10px; text-align: left; }
                </style>
                </head>
                <body>
                    <h1>Zertifikat</h1>
                    <p>Imker: %s &#8212; Datum: %s</p>
                    <table>
                        <tr><th>Kriterium</th><th>Wert</th></tr>
                        <tr><td>Zertifizierungsstufe</td><td>%s</td></tr>
                    </table>
                </body>
                </html>
                """.formatted(escape(beekeeperName), LocalDate.now(), certificationLabel(certification));
    }

    private static String escape(String text) {
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;");
    }

    private static String certificationLabel(Certification certification) {
        return switch (certification) {
            case NONE -> "Keine Zertifizierung";
            case NATIONAL_QUALITY_LABEL -> "Nationales G&#252;tesiegel";
            case EU_ORGANIC -> "EU-Bio-Zertifizierung";
            case ASSOCIATION_ORGANIC -> "Verbands-Bio-Zertifizierung";
        };
    }
}

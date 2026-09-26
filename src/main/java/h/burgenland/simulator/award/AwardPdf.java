package h.burgenland.simulator.award;

import h.burgenland.simulator.mci.Award;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

public final class AwardPdf {

    private AwardPdf() {
    }

    public static byte[] render(long batchId, Award award) {
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(buildHtml(batchId, award));
        renderer.layout();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        renderer.createPDF(out);
        return out.toByteArray();
    }

    private static String buildHtml(long batchId, Award award) {
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
                    <h1>Pr&#228;mierungsurkunde</h1>
                    <p>Charge Nr. %d &#8212; Datum: %s</p>
                    <table>
                        <tr><th>Kriterium</th><th>Wert</th></tr>
                        <tr><td>Auszeichnung</td><td>%s</td></tr>
                    </table>
                </body>
                </html>
                """.formatted(batchId, LocalDate.now(), awardLabel(award));
    }

    private static String awardLabel(Award award) {
        return switch (award) {
            case NONE -> "Keine Auszeichnung";
            case BRONZE -> "Bronze";
            case SILVER -> "Silber";
            case GOLD -> "Gold";
        };
    }
}

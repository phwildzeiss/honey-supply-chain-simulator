package h.burgenland.simulator.lab;

import h.burgenland.simulator.mci.Variety;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

public final class LabReportPdf {

    private LabReportPdf() {
    }

    public static byte[] render(long batchId, LabReportData data) {
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(buildHtml(batchId, data));
        renderer.layout();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        renderer.createPDF(out);
        return out.toByteArray();
    }

    private static String buildHtml(long batchId, LabReportData data) {
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
                    <h1>Laborbefund</h1>
                    <p>Charge Nr. %d &#8212; Datum: %s</p>
                    <table>
                        <tr><th>Kriterium</th><th>Wert</th></tr>
                        <tr><td>Wassergehalt</td><td>%.2f %%</td></tr>
                        <tr><td>HMF-Gehalt</td><td>%.1f mg/kg</td></tr>
                        <tr><td>Invertase-Aktivit&#228;t</td><td>%.1f U/kg</td></tr>
                        <tr><td>Nat&#252;rlich enzymschwacher Honig</td><td>%s</td></tr>
                        <tr><td>pH-Wert</td><td>%.2f</td></tr>
                        <tr><td>Sorte</td><td>%s</td></tr>
                    </table>
                </body>
                </html>
                """.formatted(
                batchId, LocalDate.now(),
                data.waterContentPercent(), data.hmf(), data.invertaseActivity(),
                data.naturallyEnzymeWeak() ? "ja" : "nein",
                data.ph(), varietyLabel(data.variety()));
    }

    private static String varietyLabel(Variety variety) {
        return switch (variety) {
            case MIXED_BLOSSOM -> "Mischbl&#252;tenhonig";
            case LOCAL_VARIETAL -> "Lokaler Sortenhonig";
            case PREMIUM_VARIETAL -> "Premium-Sortenhonig";
        };
    }
}

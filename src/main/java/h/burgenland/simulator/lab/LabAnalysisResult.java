package h.burgenland.simulator.lab;

import java.math.BigInteger;

public record LabAnalysisResult(LabReportData reportData, String ipfsCid, String transactionHash, BigInteger gasUsed) {
}

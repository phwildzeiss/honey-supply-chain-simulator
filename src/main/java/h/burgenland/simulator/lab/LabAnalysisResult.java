package h.burgenland.simulator.lab;

import h.burgenland.simulator.common.StepTimings;

import java.math.BigInteger;

public record LabAnalysisResult(LabReportData reportData, String ipfsCid, String transactionHash, BigInteger gasUsed,
                                StepTimings timings) {
}

package h.burgenland.simulator.api;

import h.burgenland.simulator.lab.LabReportOutcome;

public record LabAnalysisRequest(Long batchId, LabReportOutcome force) {
}

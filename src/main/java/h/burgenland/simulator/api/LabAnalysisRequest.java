package h.burgenland.simulator.api;

import h.burgenland.simulator.lab.LabReportOutcome;
import h.burgenland.simulator.mci.Variety;

public record LabAnalysisRequest(Long batchId, LabReportOutcome force, Variety variety) {
}

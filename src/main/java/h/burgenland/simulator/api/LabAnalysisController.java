package h.burgenland.simulator.api;

import h.burgenland.simulator.lab.LabAnalysisResult;
import h.burgenland.simulator.lab.LabAnalysisService;
import h.burgenland.simulator.lab.LabReportOutcome;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/lab")
@ConditionalOnProperty(name = {"simulator.web3.lab-private-key", "simulator.pinata.jwt"})
public class LabAnalysisController {

    private final LabAnalysisService labAnalysisService;

    public LabAnalysisController(LabAnalysisService labAnalysisService) {
        this.labAnalysisService = labAnalysisService;
    }

    @PostMapping("/analysis")
    public LabAnalysisResult analysis(@RequestBody LabAnalysisRequest request) {
        if (request.batchId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "batchId is required");
        }
        LabReportOutcome outcome = request.force() != null ? request.force() : LabReportOutcome.NORMAL;
        try {
            return labAnalysisService.analyze(request.batchId(), outcome);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Lab analysis failed: " + e.getMessage(), e);
        }
    }
}

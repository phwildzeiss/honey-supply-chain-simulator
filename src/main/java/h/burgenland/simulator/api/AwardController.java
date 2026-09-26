package h.burgenland.simulator.api;

import h.burgenland.simulator.award.AwardResult;
import h.burgenland.simulator.award.AwardService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
@ConditionalOnProperty(name = {"simulator.web3.award-body-private-key", "simulator.pinata.jwt"})
public class AwardController {

    private final AwardService awardService;

    public AwardController(AwardService awardService) {
        this.awardService = awardService;
    }

    @PostMapping("/awards")
    public AwardResult awards(@RequestBody AwardRequest request) {
        if (request.batchId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "batchId is required");
        }
        try {
            return awardService.submitAward(request.batchId(), request.force());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Award submission failed: " + e.getMessage(), e);
        }
    }
}

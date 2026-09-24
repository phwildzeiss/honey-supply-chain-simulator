package h.burgenland.simulator.api;

import h.burgenland.simulator.common.Scaling;
import h.burgenland.simulator.mci.MciEvaluation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/mci")
public class MciController {

    @PostMapping("/origin")
    public MciOriginResponse origin(@RequestBody MciOriginRequest request) {
        if (request.variety() == null || request.region() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "variety and region are required");
        }
        return new MciOriginResponse(
                Scaling.toContractScale(MciEvaluation.evaluateVariety(request.variety())),
                Scaling.toContractScale(MciEvaluation.evaluateRegion(request.region())));
    }
}

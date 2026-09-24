package h.burgenland.simulator.api;

import h.burgenland.simulator.si.SiEvaluationService;
import h.burgenland.simulator.si.model.SensorInput;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class SiController {

    private final StationService stationService;

    public SiController(StationService stationService) {
        this.stationService = stationService;
    }

    @PostMapping("/si")
    public SiResponse si(@RequestBody SiRequest request) {
        if (request.sensorStation() == null || request.waterSourceDistanceMeters() == null
                || request.waterSourceDistanceMeters() < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "sensorStation and a non-negative waterSourceDistanceMeters are required");
        }
        SensorInput input = stationService.sensorInput(request.sensorStation())
                .withWaterSourceDistance(request.waterSourceDistanceMeters());
        return SiResponse.from(SiEvaluationService.evaluate(input));
    }
}

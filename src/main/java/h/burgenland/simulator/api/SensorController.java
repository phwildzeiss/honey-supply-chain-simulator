package h.burgenland.simulator.api;

import h.burgenland.simulator.sensors.SensorOutcome;
import h.burgenland.simulator.sensors.SensorReading;
import h.burgenland.simulator.sensors.SensorReadingGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorReadingGenerator transportGenerator;
    private final SensorReadingGenerator warehouseGenerator;
    private final SensorReadingGenerator defrostGenerator;

    public SensorController(SensorReadingGenerator transportGenerator, SensorReadingGenerator warehouseGenerator,
                             SensorReadingGenerator defrostGenerator) {
        this.transportGenerator = transportGenerator;
        this.warehouseGenerator = warehouseGenerator;
        this.defrostGenerator = defrostGenerator;
    }

    @PostMapping("/transport")
    public SensorReading transport(@RequestParam(required = false) SensorOutcome force) {
        return transportGenerator.generate(force);
    }

    @PostMapping("/warehouse")
    public SensorReading warehouse(@RequestParam(required = false) SensorOutcome force) {
        return warehouseGenerator.generate(force);
    }

    @PostMapping("/defrost")
    public SensorReading defrost(@RequestParam(required = false) SensorOutcome force) {
        return defrostGenerator.generate(force);
    }
}

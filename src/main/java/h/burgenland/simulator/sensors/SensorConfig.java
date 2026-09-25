package h.burgenland.simulator.sensors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class SensorConfig {

    @Bean
    public SensorReadingGenerator transportGenerator(
            @Value("${simulator.max-safe-temperature-celsius:40}") int maxSafeTemperature,
            @Value("${simulator.max-safe-duration-minutes:60}") int maxSafeDuration,
            @Value("${simulator.sensors.transport.violation-probability:0.1}") double violationProbability,
            @Value("${simulator.random-seed:42}") long seed) {
        return new SensorReadingGenerator(maxSafeTemperature, maxSafeDuration, violationProbability, new Random(seed));
    }

    @Bean
    public SensorReadingGenerator warehouseGenerator(
            @Value("${simulator.max-safe-temperature-celsius:40}") int maxSafeTemperature,
            @Value("${simulator.max-safe-duration-minutes:60}") int maxSafeDuration,
            @Value("${simulator.sensors.warehouse.violation-probability:0.1}") double violationProbability,
            @Value("${simulator.random-seed:42}") long seed) {
        return new SensorReadingGenerator(maxSafeTemperature, maxSafeDuration, violationProbability, new Random(seed + 1));
    }

    @Bean
    public SensorReadingGenerator defrostGenerator(
            @Value("${simulator.max-safe-temperature-celsius:40}") int maxSafeTemperature,
            @Value("${simulator.max-safe-duration-minutes:60}") int maxSafeDuration,
            @Value("${simulator.sensors.defrost.violation-probability:0.1}") double violationProbability,
            @Value("${simulator.random-seed:42}") long seed) {
        return new SensorReadingGenerator(maxSafeTemperature, maxSafeDuration, violationProbability, new Random(seed + 2));
    }
}

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
            @Value("${simulator.sensors.transport.temperature-mean:18}") double temperatureMean,
            @Value("${simulator.sensors.transport.temperature-std-dev:8}") double temperatureStdDev,
            @Value("${simulator.sensors.transport.min-temperature:-5}") int minTemperature,
            @Value("${simulator.sensors.transport.duration-mean-minutes:90}") double durationMean,
            @Value("${simulator.sensors.transport.duration-std-dev-minutes:45}") double durationStdDev,
            @Value("${simulator.sensors.transport.min-duration-minutes:10}") int minDuration,
            @Value("${simulator.sensors.transport.max-normal-duration-minutes:300}") int maxNormalDuration,
            @Value("${simulator.random-seed:42}") long seed) {
        return new SensorReadingGenerator(maxSafeTemperature, maxSafeDuration, violationProbability,
                new NormalReadingProfile(temperatureMean, temperatureStdDev, minTemperature,
                        durationMean, durationStdDev, minDuration, maxNormalDuration),
                new Random(seed));
    }

    @Bean
    public SensorReadingGenerator warehouseGenerator(
            @Value("${simulator.max-safe-temperature-celsius:40}") int maxSafeTemperature,
            @Value("${simulator.max-safe-duration-minutes:60}") int maxSafeDuration,
            @Value("${simulator.sensors.warehouse.violation-probability:0.1}") double violationProbability,
            @Value("${simulator.sensors.warehouse.temperature-mean:20}") double temperatureMean,
            @Value("${simulator.sensors.warehouse.temperature-std-dev:3}") double temperatureStdDev,
            @Value("${simulator.sensors.warehouse.min-temperature:10}") int minTemperature,
            @Value("${simulator.sensors.warehouse.duration-mean-minutes:720}") double durationMean,
            @Value("${simulator.sensors.warehouse.duration-std-dev-minutes:300}") double durationStdDev,
            @Value("${simulator.sensors.warehouse.min-duration-minutes:30}") int minDuration,
            @Value("${simulator.sensors.warehouse.max-normal-duration-minutes:2880}") int maxNormalDuration,
            @Value("${simulator.random-seed:42}") long seed) {
        return new SensorReadingGenerator(maxSafeTemperature, maxSafeDuration, violationProbability,
                new NormalReadingProfile(temperatureMean, temperatureStdDev, minTemperature,
                        durationMean, durationStdDev, minDuration, maxNormalDuration),
                new Random(seed + 1));
    }

    @Bean
    public SensorReadingGenerator defrostGenerator(
            @Value("${simulator.max-safe-temperature-celsius:40}") int maxSafeTemperature,
            @Value("${simulator.max-safe-duration-minutes:60}") int maxSafeDuration,
            @Value("${simulator.sensors.defrost.violation-probability:0.1}") double violationProbability,
            @Value("${simulator.sensors.defrost.temperature-mean:35}") double temperatureMean,
            @Value("${simulator.sensors.defrost.temperature-std-dev:3}") double temperatureStdDev,
            @Value("${simulator.sensors.defrost.min-temperature:25}") int minTemperature,
            @Value("${simulator.sensors.defrost.duration-mean-minutes:30}") double durationMean,
            @Value("${simulator.sensors.defrost.duration-std-dev-minutes:15}") double durationStdDev,
            @Value("${simulator.sensors.defrost.min-duration-minutes:10}") int minDuration,
            @Value("${simulator.sensors.defrost.max-normal-duration-minutes:120}") int maxNormalDuration,
            @Value("${simulator.random-seed:42}") long seed) {
        return new SensorReadingGenerator(maxSafeTemperature, maxSafeDuration, violationProbability,
                new NormalReadingProfile(temperatureMean, temperatureStdDev, minTemperature,
                        durationMean, durationStdDev, minDuration, maxNormalDuration),
                new Random(seed + 2));
    }
}

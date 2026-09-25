package h.burgenland.simulator.sensors;

import java.util.Random;

public class SensorReadingGenerator {

    private final int maxSafeTemperatureCelsius;
    private final int maxSafeDurationMinutes;
    private final double violationProbability;
    private final Random random;

    public SensorReadingGenerator(int maxSafeTemperatureCelsius, int maxSafeDurationMinutes,
                                   double violationProbability, Random random) {
        this.maxSafeTemperatureCelsius = maxSafeTemperatureCelsius;
        this.maxSafeDurationMinutes = maxSafeDurationMinutes;
        this.violationProbability = violationProbability;
        this.random = random;
    }

    public SensorReading generate(SensorOutcome force) {
        boolean violate = force != null ? force == SensorOutcome.VIOLATION : random.nextDouble() < violationProbability;
        return violate ? violationReading() : normalReading();
    }

    private SensorReading violationReading() {
        int temperature = maxSafeTemperatureCelsius + 1 + random.nextInt(10);
        int duration = maxSafeDurationMinutes + random.nextInt(30);
        return new SensorReading(temperature, duration, true);
    }

    private SensorReading normalReading() {
        int temperature = 10 + random.nextInt(maxSafeTemperatureCelsius - 10);
        int duration = random.nextInt(maxSafeDurationMinutes);
        return new SensorReading(temperature, duration, false);
    }
}

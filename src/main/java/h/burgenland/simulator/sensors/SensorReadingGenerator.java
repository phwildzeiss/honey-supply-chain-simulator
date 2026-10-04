package h.burgenland.simulator.sensors;

import java.util.Random;

public class SensorReadingGenerator {

    private final int maxSafeTemperatureCelsius;
    private final int maxSafeDurationMinutes;
    private final double violationProbability;
    private final NormalReadingProfile normalProfile;
    private final Random random;

    public SensorReadingGenerator(int maxSafeTemperatureCelsius, int maxSafeDurationMinutes,
                                   double violationProbability, NormalReadingProfile normalProfile, Random random) {
        this.maxSafeTemperatureCelsius = maxSafeTemperatureCelsius;
        this.maxSafeDurationMinutes = maxSafeDurationMinutes;
        this.violationProbability = violationProbability;
        this.normalProfile = normalProfile;
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
        int temperature = clamp(
                gaussian(normalProfile.temperatureMean(), normalProfile.temperatureStdDev()),
                normalProfile.minTemperature(), maxSafeTemperatureCelsius - 1);
        int duration = clamp(
                gaussian(normalProfile.durationMean(), normalProfile.durationStdDev()),
                normalProfile.minDurationMinutes(), normalProfile.maxDurationMinutes());
        return new SensorReading(temperature, duration, false);
    }

    private int gaussian(double mean, double stdDev) {
        return (int) Math.round(mean + stdDev * random.nextGaussian());
    }

    private int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }
}

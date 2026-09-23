package h.burgenland.simulator.si;

import h.burgenland.simulator.si.model.SensorInput;
import h.burgenland.simulator.si.repository.SensorDataRepository;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.OptionalDouble;

public final class SensorAggregationService {

    private final SensorDataRepository repository;

    public SensorAggregationService(SensorDataRepository repository) {
        this.repository = repository;
    }

    public SensorInput aggregate(String station, int year, double waterSourceDistance) throws SQLException {
        LocalDateTime summerStart = LocalDateTime.of(year, 5, 1, 0, 0);
        LocalDateTime summerEnd = LocalDateTime.of(year, 8, 31, 0, 0);
        LocalDateTime yearStart = LocalDateTime.of(year, 1, 1, 0, 0);
        LocalDateTime yearEnd = LocalDateTime.of(year, 12, 31, 0, 0);
        LocalDateTime winterStart = LocalDateTime.of(year, 10, 1, 0, 0);
        LocalDateTime winterEnd = LocalDateTime.of(year + 1, 3, 1, 0, 0);
        LocalDateTime forageStart = LocalDateTime.of(year, 4, 1, 0, 0);
        LocalDateTime forageEnd = LocalDateTime.of(year, 8, 1, 0, 0);

        return new SensorInput(
                repository.averageOfDailyMaxTemperature(station, summerStart, summerEnd),
                repository.averageOfDailyAverageTemperature(station, winterStart, winterEnd),
                repository.averageOfDailyAverageHumidity(station, yearStart, yearEnd),
                repository.totalPrecipitation(station, yearStart, yearEnd),
                longestDryPeriod(repository.dailyRainSums(station, yearStart, yearEnd)),
                repository.windCategoryDays(station, yearStart, yearEnd),
                waterSourceDistance,
                repository.averageLightIntensity(station, summerStart, summerEnd, 6, 11, 6, 8).orElse(0.0),
                repository.averageLightIntensity(station, summerStart, summerEnd, 12, 15, 6, 8).orElse(0.0),
                averageWinterLightIntensity(station, year),
                (int) calculateHoneyHarvest(repository.weights(station, forageStart, forageEnd)));
    }

    static int longestDryPeriod(List<Double> dailyRainSums) {
        int longest = 0;
        int current = 0;
        for (double rain : dailyRainSums) {
            if (rain < 0.1) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }
        return longest;
    }

    static double calculateHoneyHarvest(List<Double> weights) {
        if (weights.isEmpty()) {
            return 0.0;
        }
        double totalHarvest = 0.0;
        double lastWeight = weights.get(0);
        for (int i = 1; i < weights.size(); i++) {
            double currentWeight = weights.get(i);
            double difference = currentWeight - lastWeight;
            if (difference > 3) {
                totalHarvest -= difference;
            } else if (difference < -5.0) {
                totalHarvest += -difference;
            }
            lastWeight = currentWeight;
        }
        return totalHarvest;
    }

    private double averageWinterLightIntensity(String station, int year) throws SQLException {
        OptionalDouble januaryToMarch = repository.averageLightIntensity(station,
                LocalDateTime.of(year, 1, 1, 0, 0), LocalDateTime.of(year, 3, 31, 23, 59, 59), 0, 23, 1, 12);
        OptionalDouble octoberToDecember = repository.averageLightIntensity(station,
                LocalDateTime.of(year, 10, 1, 0, 0), LocalDateTime.of(year, 12, 31, 23, 59, 59), 0, 23, 1, 12);

        if (januaryToMarch.isPresent() && octoberToDecember.isPresent()) {
            return (januaryToMarch.getAsDouble() + octoberToDecember.getAsDouble()) / 2.0;
        }
        if (januaryToMarch.isPresent()) {
            return januaryToMarch.getAsDouble();
        }
        return octoberToDecember.orElse(0.0);
    }
}

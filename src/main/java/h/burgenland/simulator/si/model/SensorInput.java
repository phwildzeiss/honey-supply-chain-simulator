package h.burgenland.simulator.si.model;

import java.util.Map;

public record SensorInput(
        double summerTemperature,
        double winterTemperature,
        double humidity,
        double precipitationMm,
        int dryDays,
        Map<String, Double> windCategoryDays,
        double waterSourceDistance,
        double luxMorningSummer,
        double luxMiddaySummer,
        double luxWinter,
        int honeyYieldKg) {

    public SensorInput withWaterSourceDistance(double distanceMeters) {
        return new SensorInput(summerTemperature, winterTemperature, humidity, precipitationMm, dryDays,
                windCategoryDays, distanceMeters, luxMorningSummer, luxMiddaySummer, luxWinter, honeyYieldKg);
    }
}

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
}

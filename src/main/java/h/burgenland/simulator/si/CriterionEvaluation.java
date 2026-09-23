package h.burgenland.simulator.si;

import h.burgenland.simulator.common.Suitability;

import java.util.Map;

public final class CriterionEvaluation {

    private CriterionEvaluation() {
    }

    public static Suitability evaluateSummerTemperature(double temperature) {
        if (temperature > 38) return Suitability.UNSUITABLE;
        if (temperature >= 25 && temperature <= 38) return Suitability.MORE_SUITABLE;
        return Suitability.SUITABLE;
    }

    public static Suitability evaluateWinterTemperature(double temperature) {
        if (temperature >= 3 && temperature <= 10) return Suitability.MORE_SUITABLE;
        if ((temperature >= 0 && temperature < 3) || (temperature > 10 && temperature <= 12)) return Suitability.SUITABLE;
        return Suitability.LESS_SUITABLE;
    }

    public static Suitability evaluateRelativeHumidity(double relativeHumidity) {
        if (relativeHumidity < 15) return Suitability.UNSUITABLE;
        if (relativeHumidity <= 40) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    public static Suitability evaluatePrecipitationConditions(double precipitationMm, int dryDays) {
        Suitability precipitationScore = evaluatePrecipitation(precipitationMm);
        Suitability droughtScore = evaluateDroughtPeriod(dryDays);
        double combinedScore = 0.5 * precipitationScore.getScore() + 0.5 * droughtScore.getScore();
        return mapNumericToSuitability(combinedScore);
    }

    public static Suitability evaluatePrecipitation(double precipitationMm) {
        if (precipitationMm < 900 || precipitationMm > 1600) return Suitability.UNSUITABLE;
        if ((precipitationMm >= 900 && precipitationMm < 1100) || (precipitationMm > 1400 && precipitationMm <= 1600)) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    public static Suitability evaluateDroughtPeriod(int dryDays) {
        if (dryDays > 45) return Suitability.UNSUITABLE;
        if (dryDays >= 31) return Suitability.LESS_SUITABLE;
        if (dryDays >= 16) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    public static Suitability evaluateWindSpeed(Map<String, Double> categoryCounts) {
        double totalDays = categoryCounts.values().stream().mapToDouble(Double::doubleValue).sum();
        if (totalDays == 0) return Suitability.LESS_SUITABLE;

        double score = categoryCounts.getOrDefault("OC", 0.0) * 9.0
                + categoryCounts.getOrDefault("PO", 0.0) * 5.0
                + categoryCounts.getOrDefault("AC15_30", 0.0) * 3.0
                + categoryCounts.getOrDefault("AC30", 0.0) * 1.0;
        score /= totalDays;

        return mapNumericToSuitability(score);
    }

    public static Suitability evaluateForage(int honeyYieldKg) {
        if (honeyYieldKg < 20) return Suitability.UNSUITABLE;
        if (honeyYieldKg < 30) return Suitability.LESS_SUITABLE;
        if (honeyYieldKg <= 40) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    public static Suitability evaluateLux(double avgMorningSummerLux, double avgMiddaySummerLux, double avgWinterLux) {
        double normMorning = normalizeLux(avgMorningSummerLux);
        double normMidday = 1.0 - normalizeLux(avgMiddaySummerLux);
        double normWinter = normalizeLux(avgWinterLux);

        double summerScore = normMorning * 0.4 + normMidday * 0.6;
        double combinedScore = summerScore * 0.5 + normWinter * 0.5;

        return mapToAhpScore(combinedScore);
    }

    public static Suitability evaluateWaterSource(double distanceMeters) {
        if (distanceMeters > 700) return Suitability.UNSUITABLE;
        if (distanceMeters >= 500) return Suitability.LESS_SUITABLE;
        if (distanceMeters >= 200) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    private static Suitability mapNumericToSuitability(double score) {
        if (score >= 7.0) return Suitability.MORE_SUITABLE;
        if (score >= 4.0) return Suitability.SUITABLE;
        if (score >= 2.0) return Suitability.LESS_SUITABLE;
        return Suitability.UNSUITABLE;
    }

    private static double normalizeLux(double lux) {
        double minLux = 0.0;
        double maxLux = 100_000.0;
        return Math.min(1.0, Math.max(0.0, (lux - minLux) / (maxLux - minLux)));
    }

    private static Suitability mapToAhpScore(double normScore) {
        if (normScore >= 0.75) return Suitability.MORE_SUITABLE;
        if (normScore >= 0.5) return Suitability.SUITABLE;
        if (normScore >= 0.3) return Suitability.LESS_SUITABLE;
        return Suitability.UNSUITABLE;
    }
}

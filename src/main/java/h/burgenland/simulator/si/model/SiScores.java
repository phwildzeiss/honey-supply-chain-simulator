package h.burgenland.simulator.si.model;

import h.burgenland.simulator.si.SiWeights;

public record SiScores(
        double forage,
        double summerTemperature,
        double winterTemperature,
        double lightIntensity,
        double windSpeed,
        double humidity,
        double precipitation,
        double waterSource) {

    /** Same order as {@link SiWeights#CRITERIA}. */
    public double[] asArray() {
        return new double[]{forage, summerTemperature, winterTemperature, lightIntensity,
                windSpeed, humidity, precipitation, waterSource};
    }

    public double weightedSum() {
        double[] values = asArray();
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i] * SiWeights.WEIGHTS[i];
        }
        return sum;
    }
}

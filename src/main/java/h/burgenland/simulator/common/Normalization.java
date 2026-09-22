package h.burgenland.simulator.common;

public final class Normalization {

    private static final double MIN_SCORE = 1.0;
    private static final double MAX_SCORE = 9.0;

    private Normalization() {
    }

    /**
     * Normalizes a Saaty suitability score from the range 1-9
     * to the range 0-1 using Min-Max normalization.
     * 1 -> 0.0, 3 -> 0.25, 5 -> 0.5, 9 -> 1.0
     */
    public static double normalizeSaatyScore(double score) {
        double normalized = (score - MIN_SCORE) / (MAX_SCORE - MIN_SCORE);
        return Math.max(0.0, Math.min(1.0, normalized));
    }
}

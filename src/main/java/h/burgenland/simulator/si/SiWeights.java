package h.burgenland.simulator.si;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Fixed AHP pairwise-comparison matrix for the eight SI criteria (thesis
 * appendix D). Weights and the consistency ratio are derived from the matrix at
 * class load via Ahp, not hardcoded, so they stay traceable to the source data.
 */
public final class SiWeights {

    public static final String[] CRITERIA = {
            "honey_harvest",
            "summer_temperature",
            "winter_temperature",
            "lightintensity",
            "wind_speed",
            "humidity",
            "precipitation",
            "water_source"
    };

    private static final double[][] PAIRWISE_COMPARISON_MATRIX = {
            {1, 5, 6, 3, 7, 7, 8, 3},
            {1.0 / 5, 1, 2, 1.0 / 2, 3, 4, 5, 1.0 / 2},
            {1.0 / 6, 1.0 / 2, 1, 1.0 / 3, 2, 3, 4, 1.0 / 2},
            {1.0 / 3, 2, 3, 1, 4, 5, 6, 1},
            {1.0 / 7, 1.0 / 3, 1.0 / 2, 1.0 / 4, 1, 2, 3, 1.0 / 3},
            {1.0 / 7, 1.0 / 4, 1.0 / 3, 1.0 / 5, 1.0 / 2, 1, 2, 1.0 / 4},
            {1.0 / 8, 1.0 / 5, 1.0 / 4, 1.0 / 6, 1.0 / 3, 1.0 / 2, 1, 1.0 / 5},
            {1.0 / 3, 2, 2, 1, 3, 4, 5, 1}
    };

    public static final double[] WEIGHTS;
    public static final double CONSISTENCY_RATIO;

    static {
        double[][] normalized = Ahp.normalizeMatrix(PAIRWISE_COMPARISON_MATRIX);
        WEIGHTS = Ahp.calculateWeights(normalized);
        CONSISTENCY_RATIO = Ahp.computeConsistencyRatio(PAIRWISE_COMPARISON_MATRIX, WEIGHTS);
    }

    private SiWeights() {
    }

    public static Map<String, Double> asMap() {
        Map<String, Double> weights = new LinkedHashMap<>();
        for (int i = 0; i < CRITERIA.length; i++) {
            weights.put(CRITERIA[i], WEIGHTS[i]);
        }
        return weights;
    }

    public static double weightOf(String criterion) {
        for (int i = 0; i < CRITERIA.length; i++) {
            if (CRITERIA[i].equals(criterion)) {
                return WEIGHTS[i];
            }
        }
        throw new IllegalArgumentException("Unknown SI criterion: " + criterion);
    }
}

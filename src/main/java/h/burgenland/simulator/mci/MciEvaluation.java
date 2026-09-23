package h.burgenland.simulator.mci;

import h.burgenland.simulator.common.Normalization;
import h.burgenland.simulator.common.Suitability;
import h.burgenland.simulator.mci.model.MciInput;
import h.burgenland.simulator.mci.model.MciScores;

public final class MciEvaluation {

    private MciEvaluation() {
    }

    public static MciScores evaluate(MciInput input) {
        return new MciScores(
                score(input.variety().suitability()),
                score(input.region().suitability()),
                score(input.certification().suitability()),
                score(input.award().suitability()));
    }

    private static double score(Suitability suitability) {
        return Normalization.normalizeSaatyScore(suitability.getScore());
    }
}

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
                evaluateVariety(input.variety()),
                evaluateRegion(input.region()),
                evaluateCertification(input.certification()),
                evaluateAward(input.award()));
    }

    public static double evaluateVariety(Variety variety) {
        return score(variety.suitability());
    }

    public static double evaluateRegion(Region region) {
        return score(region.suitability());
    }

    public static double evaluateCertification(Certification certification) {
        return score(certification.suitability());
    }

    public static double evaluateAward(Award award) {
        return score(award.suitability());
    }

    private static double score(Suitability suitability) {
        return Normalization.normalizeSaatyScore(suitability.getScore());
    }
}

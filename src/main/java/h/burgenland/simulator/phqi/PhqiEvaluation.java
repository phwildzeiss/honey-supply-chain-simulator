package h.burgenland.simulator.phqi;

import h.burgenland.simulator.common.Normalization;
import h.burgenland.simulator.common.Suitability;
import h.burgenland.simulator.phqi.model.PhqiInput;
import h.burgenland.simulator.phqi.model.PhqiScores;

public final class PhqiEvaluation {

    private PhqiEvaluation() {
    }

    public static PhqiScores evaluate(PhqiInput input) {
        return new PhqiScores(
                score(evaluateWaterContent(input.waterContentPercent())),
                score(evaluateHmf(input.hmf())),
                score(evaluateInvertase(input.invertaseActivity(), input.naturallyEnzymeWeak())),
                input.waterContentPercent());
    }

    public static Suitability evaluateWaterContent(double waterContentPercent) {
        if (waterContentPercent > 20) return Suitability.UNSUITABLE;
        if (waterContentPercent > 18) return Suitability.LESS_SUITABLE;
        if (waterContentPercent >= 16.8) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    public static Suitability evaluateHmf(double hmf) {
        if (hmf > 40) return Suitability.UNSUITABLE;
        if (hmf > 15) return Suitability.LESS_SUITABLE;
        if (hmf > 10) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    public static Suitability evaluateInvertase(double invertaseActivity, boolean naturallyEnzymeWeak) {
        if (naturallyEnzymeWeak) {
            return invertaseActivity < 45 ? Suitability.UNSUITABLE : Suitability.MORE_SUITABLE;
        }
        if (invertaseActivity < 64) return Suitability.UNSUITABLE;
        if (invertaseActivity < 85) return Suitability.SUITABLE;
        return Suitability.MORE_SUITABLE;
    }

    private static double score(Suitability suitability) {
        return Normalization.normalizeSaatyScore(suitability.getScore());
    }
}

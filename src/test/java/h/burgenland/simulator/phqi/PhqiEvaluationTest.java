package h.burgenland.simulator.phqi;

import h.burgenland.simulator.common.Suitability;
import h.burgenland.simulator.phqi.model.PhqiInput;
import h.burgenland.simulator.phqi.model.PhqiScores;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhqiEvaluationTest {

    @Test
    void typicalGoodHoneyGetsExpectedScores() {
        PhqiScores scores = PhqiEvaluation.evaluate(new PhqiInput(16.5, 8, 70, false));
        assertEquals(1.0, scores.waterContent());
        assertEquals(1.0, scores.hmf());
        assertEquals(0.5, scores.invertase());
        assertEquals(16.5, scores.waterContentPercent());
    }

    @Test
    void waterContentAboveTwentyPercentScoresZero() {
        assertEquals(0.0, PhqiEvaluation.evaluate(new PhqiInput(20.1, 8, 90, false)).waterContent());
    }

    @Test
    void hmfAboveFortyScoresZero() {
        assertEquals(0.0, PhqiEvaluation.evaluate(new PhqiInput(16.5, 41, 90, false)).hmf());
    }

    @Test
    void lowInvertaseScoresZero() {
        assertEquals(0.0, PhqiEvaluation.evaluate(new PhqiInput(16.5, 8, 63, false)).invertase());
    }

    @Test
    void naturallyEnzymeWeakHoneyHasLowerInvertaseLimit() {
        assertEquals(Suitability.MORE_SUITABLE, PhqiEvaluation.evaluateInvertase(45, true));
        assertEquals(Suitability.UNSUITABLE, PhqiEvaluation.evaluateInvertase(44, true));
    }

    @Test
    void waterContentBoundariesFollowThesisTable() {
        assertEquals(Suitability.LESS_SUITABLE, PhqiEvaluation.evaluateWaterContent(20));
        assertEquals(Suitability.SUITABLE, PhqiEvaluation.evaluateWaterContent(18));
        assertEquals(Suitability.SUITABLE, PhqiEvaluation.evaluateWaterContent(16.8));
        assertEquals(Suitability.MORE_SUITABLE, PhqiEvaluation.evaluateWaterContent(16.79));
    }
}

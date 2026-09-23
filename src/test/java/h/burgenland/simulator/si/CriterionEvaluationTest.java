package h.burgenland.simulator.si;

import h.burgenland.simulator.common.Suitability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CriterionEvaluationTest {

    @Test
    void summerTemperatureAtUpperBoundIsMoreSuitable() {
        assertEquals(Suitability.MORE_SUITABLE, CriterionEvaluation.evaluateSummerTemperature(38));
    }

    @Test
    void summerTemperatureAboveBoundIsUnsuitable() {
        assertEquals(Suitability.UNSUITABLE, CriterionEvaluation.evaluateSummerTemperature(39));
    }

    @Test
    void waterSourceCloseByIsMoreSuitable() {
        assertEquals(Suitability.MORE_SUITABLE, CriterionEvaluation.evaluateWaterSource(150));
    }

    @Test
    void waterSourceFarAwayIsUnsuitable() {
        assertEquals(Suitability.UNSUITABLE, CriterionEvaluation.evaluateWaterSource(750));
    }
}

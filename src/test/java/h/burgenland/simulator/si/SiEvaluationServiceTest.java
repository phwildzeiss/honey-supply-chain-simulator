package h.burgenland.simulator.si;

import h.burgenland.simulator.si.model.SensorInput;
import h.burgenland.simulator.si.model.SiScores;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiEvaluationServiceTest {

    @Test
    void bestPossibleInputGivesAllScoresOfOne() {
        SensorInput best = new SensorInput(30, 5, 50, 1200, 10, Map.of("OC", 100.0), 100, 100_000, 0, 100_000, 45);
        SiScores scores = SiEvaluationService.evaluate(best);
        assertEquals(1.0, scores.weightedSum(), 0.0001);
    }

    @Test
    void distantWaterSourceScoresZero() {
        SensorInput input = new SensorInput(30, 5, 50, 1200, 10, Map.of("OC", 100.0), 800, 100_000, 0, 100_000, 45);
        assertEquals(0.0, SiEvaluationService.evaluate(input).waterSource());
    }
}

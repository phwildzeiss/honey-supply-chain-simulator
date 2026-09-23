package h.burgenland.simulator.si.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiScoresTest {

    @Test
    void allCriteriaAtMaximumGiveOne() {
        SiScores scores = new SiScores(1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(1.0, scores.weightedSum(), 0.0001);
    }

    @Test
    void onlyForageAtMaximumGivesForageWeight() {
        SiScores scores = new SiScores(1, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(0.3741, scores.weightedSum(), 0.0001);
    }
}

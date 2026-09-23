package h.burgenland.simulator.mci;

import h.burgenland.simulator.mci.model.MciInput;
import h.burgenland.simulator.mci.model.MciScores;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MciEvaluationTest {

    @Test
    void bestCaseGivesAllScoresOfOne() {
        MciScores scores = MciEvaluation.evaluate(new MciInput(
                Variety.PREMIUM_VARIETAL, Region.REGIONAL_GPS_VERIFIED, Certification.ASSOCIATION_ORGANIC, Award.GOLD));
        assertEquals(1.0, scores.variety());
        assertEquals(1.0, scores.region());
        assertEquals(1.0, scores.organic());
        assertEquals(1.0, scores.award());
    }

    @Test
    void worstCaseGivesAllScoresOfZero() {
        MciScores scores = MciEvaluation.evaluate(new MciInput(
                Variety.MIXED_BLOSSOM, Region.EU_NON_EU_MIX, Certification.NONE, Award.NONE));
        assertEquals(0.0, scores.variety());
        assertEquals(0.0, scores.region());
        assertEquals(0.0, scores.organic());
        assertEquals(0.0, scores.award());
    }

    @Test
    void intermediateStepsMapToSaatyValues() {
        MciScores scores = MciEvaluation.evaluate(new MciInput(
                Variety.LOCAL_VARIETAL, Region.EU_MIX, Certification.EU_ORGANIC, Award.BRONZE));
        assertEquals(0.5, scores.variety());
        assertEquals(0.25, scores.region());
        assertEquals(0.5, scores.organic());
        assertEquals(0.25, scores.award());
    }
}

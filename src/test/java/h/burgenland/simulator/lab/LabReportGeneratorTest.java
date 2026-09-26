package h.burgenland.simulator.lab;

import h.burgenland.simulator.mci.Variety;
import h.burgenland.simulator.phqi.PhqiEvaluation;
import h.burgenland.simulator.phqi.model.PhqiInput;
import h.burgenland.simulator.phqi.model.PhqiScores;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LabReportGeneratorTest {

    private LabReportGenerator generator() {
        return new LabReportGenerator(15.0, 19.5, 1, 30, 55, 130, 3.2, 4.5, 0.1, 0.1, 0.4, new Random(1));
    }

    @Test
    void normalStaysUnderTheGatekeeperThreshold() {
        for (int i = 0; i < 50; i++) {
            assertTrue(generator().generate(LabReportOutcome.NORMAL).waterContentPercent() <= 23.0);
        }
    }

    @Test
    void gatekeeperExceedsTwentyThreePercent() {
        assertTrue(generator().generate(LabReportOutcome.GATEKEEPER).waterContentPercent() > 23.0);
    }

    @Test
    void premiumHitsTheBestTierOfEveryCriterion() {
        LabReportGenerator generator = generator();
        for (int i = 0; i < 50; i++) {
            LabReportData data = generator.generate(LabReportOutcome.PREMIUM);
            PhqiScores scores = PhqiEvaluation.evaluate(new PhqiInput(
                    data.waterContentPercent(), data.hmf(), data.invertaseActivity(), data.naturallyEnzymeWeak()));
            assertEquals(1.0, scores.waterContent());
            assertEquals(1.0, scores.hmf());
            assertEquals(1.0, scores.invertase());
            assertEquals(Variety.PREMIUM_VARIETAL, data.variety());
        }
    }

    @Test
    void standardHitsTheMiddleTierOfEveryCriterion() {
        LabReportGenerator generator = generator();
        for (int i = 0; i < 50; i++) {
            LabReportData data = generator.generate(LabReportOutcome.STANDARD);
            PhqiScores scores = PhqiEvaluation.evaluate(new PhqiInput(
                    data.waterContentPercent(), data.hmf(), data.invertaseActivity(), data.naturallyEnzymeWeak()));
            assertEquals(0.5, scores.waterContent());
            assertEquals(0.5, scores.hmf());
            assertEquals(0.5, scores.invertase());
        }
    }

    @Test
    void varietyOverrideReplacesTheGeneratedVariety() {
        LabReportGenerator generator = generator();
        for (LabReportOutcome outcome : LabReportOutcome.values()) {
            assertEquals(Variety.MIXED_BLOSSOM, generator.generate(outcome, Variety.MIXED_BLOSSOM).variety());
        }
    }

    @Test
    void phqiExcludedZeroesAtLeastOneCriterion() {
        LabReportGenerator generator = generator();
        for (int i = 0; i < 50; i++) {
            LabReportData data = generator.generate(LabReportOutcome.PHQI_EXCLUDED);
            boolean waterExcludes = data.waterContentPercent() > 20 && data.waterContentPercent() <= 23;
            boolean hmfExcludes = data.hmf() > 40;
            boolean invertaseExcludes = data.invertaseActivity() < (data.naturallyEnzymeWeak() ? 45 : 64);
            assertTrue(waterExcludes || hmfExcludes || invertaseExcludes);
        }
    }
}

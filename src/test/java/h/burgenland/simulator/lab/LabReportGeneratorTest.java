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
        return new LabReportGenerator(15.0, 19.5, 1, 30, 55, 130, 3.2, 4.5, 0.1, 0.1, 0.4, new Random(1), false);
    }

    private LabReportGenerator caseStudyGenerator() {
        return new LabReportGenerator(15.0, 19.5, 1, 30, 55, 130, 3.2, 4.5, 0.1, 0.1, 0.4, new Random(1), true);
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

    @Test
    void caseStudyModeUsesFixedValuesMatchingThePythonReference() {
        LabReportGenerator generator = caseStudyGenerator();

        LabReportData premium = generator.generate(LabReportOutcome.PREMIUM);
        assertEquals(15.0, premium.waterContentPercent());
        assertEquals(5.0, premium.hmf());
        assertEquals(100.0, premium.invertaseActivity());
        assertEquals(false, premium.naturallyEnzymeWeak());

        LabReportData standard = generator.generate(LabReportOutcome.STANDARD);
        assertEquals(17.5, standard.waterContentPercent());
        assertEquals(12.0, standard.hmf());
        assertEquals(75.0, standard.invertaseActivity());
        assertEquals(false, standard.naturallyEnzymeWeak());

        LabReportData gatekeeper = generator.generate(LabReportOutcome.GATEKEEPER);
        assertEquals(24.0, gatekeeper.waterContentPercent());
        assertEquals(12.0, gatekeeper.hmf());
        assertEquals(75.0, gatekeeper.invertaseActivity());
        assertEquals(false, gatekeeper.naturallyEnzymeWeak());

        LabReportData phqiExcluded = generator.generate(LabReportOutcome.PHQI_EXCLUDED);
        assertEquals(21.0, phqiExcluded.waterContentPercent());
        assertEquals(12.0, phqiExcluded.hmf());
        assertEquals(75.0, phqiExcluded.invertaseActivity());
        assertEquals(false, phqiExcluded.naturallyEnzymeWeak());
    }

    @Test
    void caseStudyModeLeavesNormalRandom() {
        LabReportGenerator generator = caseStudyGenerator();
        boolean sawDifferentValues = false;
        double first = generator.generate(LabReportOutcome.NORMAL).waterContentPercent();
        for (int i = 0; i < 20; i++) {
            if (generator.generate(LabReportOutcome.NORMAL).waterContentPercent() != first) {
                sawDifferentValues = true;
                break;
            }
        }
        assertTrue(sawDifferentValues);
    }

    @Test
    void caseStudyStandardSurvivesTheRetestDegradationWithoutTriggeringTheGatekeeper() {
        LabReportGenerator generator = caseStudyGenerator();
        LabReportData standard = generator.generate(LabReportOutcome.STANDARD);
        LabReportData degraded = generator.degrade(standard);

        assertTrue(degraded.hmf() <= 40, "HMF darf nach der Verschlechterung nicht UNSUITABLE werden (>40)");
        assertTrue(degraded.invertaseActivity() >= 64,
                "Invertase darf nach der Verschlechterung nicht UNSUITABLE werden (<64)");
    }
}

package h.burgenland.simulator.lab;

import org.junit.jupiter.api.Test;

import java.util.Random;

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

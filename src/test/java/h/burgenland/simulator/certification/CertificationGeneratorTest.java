package h.burgenland.simulator.certification;

import h.burgenland.simulator.mci.Certification;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CertificationGeneratorTest {

    @Test
    void forcedValueIsReturnedDirectly() {
        CertificationGenerator generator = new CertificationGenerator(0.05, 0.10, 0.15, new Random(1));
        assertEquals(Certification.ASSOCIATION_ORGANIC, generator.generate(Certification.ASSOCIATION_ORGANIC));
    }

    @Test
    void zeroProbabilitiesAlwaysReturnNone() {
        CertificationGenerator generator = new CertificationGenerator(0.0, 0.0, 0.0, new Random(2));
        for (int i = 0; i < 50; i++) {
            assertEquals(Certification.NONE, generator.generate(null));
        }
    }
}

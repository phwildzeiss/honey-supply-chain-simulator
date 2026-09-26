package h.burgenland.simulator.award;

import h.burgenland.simulator.mci.Award;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AwardGeneratorTest {

    @Test
    void forcedValueIsReturnedDirectly() {
        AwardGenerator generator = new AwardGenerator(0.15, 0.10, 0.05, new Random(1));
        assertEquals(Award.GOLD, generator.generate(Award.GOLD));
    }

    @Test
    void zeroProbabilitiesAlwaysReturnNone() {
        AwardGenerator generator = new AwardGenerator(0.0, 0.0, 0.0, new Random(2));
        for (int i = 0; i < 50; i++) {
            assertEquals(Award.NONE, generator.generate(null));
        }
    }

    @Test
    void certaintyOfGoldWhenProbabilityIsOne() {
        AwardGenerator generator = new AwardGenerator(0.0, 0.0, 1.0, new Random(3));
        assertEquals(Award.GOLD, generator.generate(null));
    }
}

package h.burgenland.simulator.si;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SiWeightsTest {

    @Test
    void weightsSumToApproximatelyOne() {
        double sum = 0;
        for (double weight : SiWeights.WEIGHTS) {
            sum += weight;
        }
        assertEquals(1.0, sum, 0.0001);
    }

    @Test
    void matrixIsConsistentEnough() {
        assertTrue(SiWeights.CONSISTENCY_RATIO < 0.1, "CR = " + SiWeights.CONSISTENCY_RATIO);
    }

    @Test
    void honeyHarvestHasTheHighestWeight() {
        double maxWeight = SiWeights.WEIGHTS[0];
        for (double weight : SiWeights.WEIGHTS) {
            assertTrue(weight <= maxWeight);
        }
    }
}

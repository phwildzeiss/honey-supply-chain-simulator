package h.burgenland.simulator.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScalingTest {

    @Test
    void mapsNormalizedValuesToContractScale() {
        assertEquals(0, Scaling.toContractScale(0.0));
        assertEquals(2500, Scaling.toContractScale(0.25));
        assertEquals(5000, Scaling.toContractScale(0.5));
        assertEquals(10000, Scaling.toContractScale(1.0));
    }
}

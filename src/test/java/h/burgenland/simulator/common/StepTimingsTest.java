package h.burgenland.simulator.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StepTimingsTest {

    @Test
    void splitsTheMarksIntoThreeMillisecondPhases() {
        StepTimings timings = StepTimings.of(0, 5_000_000, 25_000_000, 125_000_000);

        assertEquals(5, timings.renderMs());
        assertEquals(20, timings.uploadMs());
        assertEquals(100, timings.chainMs());
    }

    @Test
    void aPhaseThatDoesNotRunIsZero() {
        StepTimings timings = StepTimings.of(1_000, 1_000, 1_000, 41_000_000);

        assertEquals(0, timings.renderMs());
        assertEquals(0, timings.uploadMs());
        assertEquals(40, timings.chainMs());
    }
}

package h.burgenland.simulator.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalizationTest {

    @Test
    void normalizesUnsuitableToZero() {
        assertEquals(0.0, Normalization.normalizeSaatyScore(Suitability.UNSUITABLE.getScore()));
    }

    @Test
    void normalizesLessSuitableToQuarter() {
        assertEquals(0.25, Normalization.normalizeSaatyScore(Suitability.LESS_SUITABLE.getScore()));
    }

    @Test
    void normalizesSuitableToHalf() {
        assertEquals(0.5, Normalization.normalizeSaatyScore(Suitability.SUITABLE.getScore()));
    }

    @Test
    void normalizesMoreSuitableToOne() {
        assertEquals(1.0, Normalization.normalizeSaatyScore(Suitability.MORE_SUITABLE.getScore()));
    }

    @Test
    void clampsBelowMinimumToZero() {
        assertEquals(0.0, Normalization.normalizeSaatyScore(0));
    }

    @Test
    void clampsAboveMaximumToOne() {
        assertEquals(1.0, Normalization.normalizeSaatyScore(10));
    }
}

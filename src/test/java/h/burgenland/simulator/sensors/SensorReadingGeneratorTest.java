package h.burgenland.simulator.sensors;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SensorReadingGeneratorTest {

    @Test
    void forcedViolationExceedsBothThresholds() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 1.0, new Random(1));
        SensorReading reading = generator.generate(SensorOutcome.VIOLATION);
        assertTrue(reading.temperatureCelsius() > 40);
        assertTrue(reading.durationMinutes() >= 60);
        assertTrue(reading.violation());
    }

    @Test
    void forcedNormalStaysUnderBothThresholds() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, new Random(1));
        SensorReading reading = generator.generate(SensorOutcome.NORMAL);
        assertTrue(reading.temperatureCelsius() <= 40);
        assertTrue(reading.durationMinutes() < 60);
        assertFalse(reading.violation());
    }

    @Test
    void sameSeedIsReproducible() {
        SensorReadingGenerator first = new SensorReadingGenerator(40, 60, 0.5, new Random(7));
        SensorReadingGenerator second = new SensorReadingGenerator(40, 60, 0.5, new Random(7));
        for (int i = 0; i < 20; i++) {
            assertEquals(first.generate(null), second.generate(null));
        }
    }

    @Test
    void zeroProbabilityNeverViolatesWithoutForce() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, new Random(3));
        for (int i = 0; i < 50; i++) {
            assertFalse(generator.generate(null).violation());
        }
    }
}

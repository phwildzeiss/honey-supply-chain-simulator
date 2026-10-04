package h.burgenland.simulator.sensors;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SensorReadingGeneratorTest {

    private static final NormalReadingProfile PROFILE = new NormalReadingProfile(18, 8, -5, 90, 45, 10, 300);

    @Test
    void forcedViolationExceedsBothThresholds() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 1.0, PROFILE, new Random(1));
        SensorReading reading = generator.generate(SensorOutcome.VIOLATION);
        assertTrue(reading.temperatureCelsius() > 40);
        assertTrue(reading.durationMinutes() >= 60);
        assertTrue(reading.violation());
    }

    @Test
    void forcedNormalStaysUnderTheTemperatureThreshold() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, PROFILE, new Random(1));
        SensorReading reading = generator.generate(SensorOutcome.NORMAL);
        assertTrue(reading.temperatureCelsius() <= 40);
        assertFalse(reading.violation());
    }

    @Test
    void normalDurationCanExceedTheViolationThresholdWithoutBeingAViolation() {
        // A warehouse-style profile: realistically long (mean 12h), far past the 60-minute
        // violation threshold — fine, since a violation also needs a too-high temperature.
        NormalReadingProfile warehouseProfile = new NormalReadingProfile(20, 3, 10, 720, 300, 30, 2880);
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, warehouseProfile, new Random(5));
        boolean sawDurationPastThreshold = false;
        for (int i = 0; i < 50; i++) {
            SensorReading reading = generator.generate(SensorOutcome.NORMAL);
            assertFalse(reading.violation());
            sawDurationPastThreshold |= reading.durationMinutes() >= 60;
        }
        assertTrue(sawDurationPastThreshold, "expected at least one reading past the 60-minute threshold");
    }

    @Test
    void normalReadingNeverGoesBelowTheConfiguredMinimums() {
        // Wide spread (std-dev 15 against a mean of 10) would often go to/below zero without
        // the minimum — defrosting in 0 minutes at sub-zero degrees makes no sense.
        NormalReadingProfile tightProfile = new NormalReadingProfile(10, 15, 3, 10, 15, 5, 120);
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, tightProfile, new Random(9));
        for (int i = 0; i < 50; i++) {
            SensorReading reading = generator.generate(SensorOutcome.NORMAL);
            assertTrue(reading.temperatureCelsius() >= 3);
            assertTrue(reading.durationMinutes() >= 5);
        }
    }

    @Test
    void sameSeedIsReproducible() {
        SensorReadingGenerator first = new SensorReadingGenerator(40, 60, 0.5, PROFILE, new Random(7));
        SensorReadingGenerator second = new SensorReadingGenerator(40, 60, 0.5, PROFILE, new Random(7));
        for (int i = 0; i < 20; i++) {
            assertEquals(first.generate(null), second.generate(null));
        }
    }

    @Test
    void zeroProbabilityNeverViolatesWithoutForce() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, PROFILE, new Random(3));
        for (int i = 0; i < 50; i++) {
            assertFalse(generator.generate(null).violation());
        }
    }
}

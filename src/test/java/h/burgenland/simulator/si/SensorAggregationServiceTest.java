package h.burgenland.simulator.si;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SensorAggregationServiceTest {

    @Test
    void longestDryPeriodCountsLongestStreak() {
        assertEquals(3, SensorAggregationService.longestDryPeriod(List.of(0.0, 0.0, 5.0, 0.0, 0.0, 0.0, 2.0)));
    }

    @Test
    void longestDryPeriodOfNoDataIsZero() {
        assertEquals(0, SensorAggregationService.longestDryPeriod(List.of()));
    }

    @Test
    void weightDropCountsAsHarvest() {
        assertEquals(6.0, SensorAggregationService.calculateHoneyHarvest(List.of(50.0, 50.0, 44.0)), 0.0001);
    }

    @Test
    void addedSuperIsSubtractedFromHarvest() {
        assertEquals(-4.0, SensorAggregationService.calculateHoneyHarvest(List.of(50.0, 54.0)), 0.0001);
    }

    @Test
    void smallWeightFluctuationsAreIgnored() {
        assertEquals(0.0, SensorAggregationService.calculateHoneyHarvest(List.of(50.0, 52.0, 48.0)), 0.0001);
    }
}

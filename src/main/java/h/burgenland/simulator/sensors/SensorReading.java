package h.burgenland.simulator.sensors;

public record SensorReading(int temperatureCelsius, int durationMinutes, boolean violation) {
}

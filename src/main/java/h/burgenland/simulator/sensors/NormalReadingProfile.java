package h.burgenland.simulator.sensors;

/**
 * Describes a "normal" (non-violation) reading for one scenario (transport/warehouse/defrost):
 * a typical temperature and duration (as a mean + standard deviation, so readings cluster around
 * a realistic value instead of being spread evenly across the whole safe range), each with its
 * own sane minimum (e.g. defrosting never realistically takes 0 minutes) and duration a maximum,
 * since a normal reading's duration isn't otherwise bounded by the violation threshold (that only
 * triggers when temperature AND duration are both exceeded at once).
 */
public record NormalReadingProfile(double temperatureMean, double temperatureStdDev, int minTemperature,
                                    double durationMean, double durationStdDev,
                                    int minDurationMinutes, int maxDurationMinutes) {
}

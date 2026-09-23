package h.burgenland.simulator.phqi.model;

public record PhqiInput(
        double waterContentPercent,
        double hmf,
        double invertaseActivity,
        boolean naturallyEnzymeWeak) {
}

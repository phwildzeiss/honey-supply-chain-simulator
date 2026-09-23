package h.burgenland.simulator.mci;

import h.burgenland.simulator.common.Suitability;

public enum Award {
    NONE(Suitability.UNSUITABLE),
    BRONZE(Suitability.LESS_SUITABLE),
    SILVER(Suitability.SUITABLE),
    GOLD(Suitability.MORE_SUITABLE);

    private final Suitability suitability;

    Award(Suitability suitability) {
        this.suitability = suitability;
    }

    public Suitability suitability() {
        return suitability;
    }
}

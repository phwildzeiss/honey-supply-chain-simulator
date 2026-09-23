package h.burgenland.simulator.mci;

import h.burgenland.simulator.common.Suitability;

public enum Variety {
    MIXED_BLOSSOM(Suitability.UNSUITABLE),
    LOCAL_VARIETAL(Suitability.SUITABLE),
    PREMIUM_VARIETAL(Suitability.MORE_SUITABLE);

    private final Suitability suitability;

    Variety(Suitability suitability) {
        this.suitability = suitability;
    }

    public Suitability suitability() {
        return suitability;
    }
}

package h.burgenland.simulator.mci;

import h.burgenland.simulator.common.Suitability;

public enum Region {
    EU_NON_EU_MIX(Suitability.UNSUITABLE),
    EU_MIX(Suitability.LESS_SUITABLE),
    NATIONAL(Suitability.SUITABLE),
    REGIONAL_GPS_VERIFIED(Suitability.MORE_SUITABLE);

    private final Suitability suitability;

    Region(Suitability suitability) {
        this.suitability = suitability;
    }

    public Suitability suitability() {
        return suitability;
    }
}

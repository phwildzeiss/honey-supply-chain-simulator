package h.burgenland.simulator.mci;

import h.burgenland.simulator.common.Suitability;

public enum Certification {
    NONE(Suitability.UNSUITABLE),
    NATIONAL_QUALITY_LABEL(Suitability.LESS_SUITABLE),
    EU_ORGANIC(Suitability.SUITABLE),
    ASSOCIATION_ORGANIC(Suitability.MORE_SUITABLE);

    private final Suitability suitability;

    Certification(Suitability suitability) {
        this.suitability = suitability;
    }

    public Suitability suitability() {
        return suitability;
    }
}

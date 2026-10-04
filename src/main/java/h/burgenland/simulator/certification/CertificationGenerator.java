package h.burgenland.simulator.certification;

import h.burgenland.simulator.mci.Certification;

import java.util.Random;

public class CertificationGenerator {

    private final double associationProbability;
    private final double euOrganicProbability;
    private final double nationalQualityLabelProbability;
    private final double associationPassProbability;
    private final double euOrganicPassProbability;
    private final double nationalQualityLabelPassProbability;
    private final Random random;

    public CertificationGenerator(double associationProbability, double euOrganicProbability,
                                   double nationalQualityLabelProbability,
                                   double associationPassProbability, double euOrganicPassProbability,
                                   double nationalQualityLabelPassProbability, Random random) {
        this.associationProbability = associationProbability;
        this.euOrganicProbability = euOrganicProbability;
        this.nationalQualityLabelProbability = nationalQualityLabelProbability;
        this.associationPassProbability = associationPassProbability;
        this.euOrganicPassProbability = euOrganicPassProbability;
        this.nationalQualityLabelPassProbability = nationalQualityLabelPassProbability;
        this.random = random;
    }

    public Certification generate(Certification force) {
        if (force != null) {
            return force;
        }
        double roll = random.nextDouble();
        if (roll < associationProbability) {
            return Certification.ASSOCIATION_ORGANIC;
        }
        if (roll < associationProbability + euOrganicProbability) {
            return Certification.EU_ORGANIC;
        }
        if (roll < associationProbability + euOrganicProbability + nationalQualityLabelProbability) {
            return Certification.NATIONAL_QUALITY_LABEL;
        }
        return Certification.NONE;
    }

    /**
     * Rolls independently for exactly the requested certification, using its own dedicated pass
     * probability (deliberately not the unconstrained distribution above, since someone actively
     * applying for a certification should pass more often than not, not match the rate at which
     * it occurs across all beekeepers unconditionally).
     */
    public Certification generateFor(Certification requested) {
        double probability = switch (requested) {
            case ASSOCIATION_ORGANIC -> associationPassProbability;
            case EU_ORGANIC -> euOrganicPassProbability;
            case NATIONAL_QUALITY_LABEL -> nationalQualityLabelPassProbability;
            case NONE -> 0;
        };
        return random.nextDouble() < probability ? requested : Certification.NONE;
    }
}

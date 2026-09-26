package h.burgenland.simulator.certification;

import h.burgenland.simulator.mci.Certification;

import java.util.Random;

public class CertificationGenerator {

    private final double associationProbability;
    private final double euOrganicProbability;
    private final double nationalQualityLabelProbability;
    private final Random random;

    public CertificationGenerator(double associationProbability, double euOrganicProbability,
                                   double nationalQualityLabelProbability, Random random) {
        this.associationProbability = associationProbability;
        this.euOrganicProbability = euOrganicProbability;
        this.nationalQualityLabelProbability = nationalQualityLabelProbability;
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
}

package h.burgenland.simulator.lab;

import h.burgenland.simulator.mci.Variety;

import java.util.Random;

public class LabReportGenerator {

    private final double waterContentMinPercent;
    private final double waterContentMaxPercent;
    private final double hmfMinMgPerKg;
    private final double hmfMaxMgPerKg;
    private final double invertaseMinUPerKg;
    private final double invertaseMaxUPerKg;
    private final double phMin;
    private final double phMax;
    private final double naturallyEnzymeWeakProbability;
    private final double varietyPremiumProbability;
    private final double varietyLocalProbability;
    private final Random random;
    private final boolean caseStudyMode;

    public LabReportGenerator(double waterContentMinPercent, double waterContentMaxPercent,
            double hmfMinMgPerKg, double hmfMaxMgPerKg,
            double invertaseMinUPerKg, double invertaseMaxUPerKg,
            double phMin, double phMax,
            double naturallyEnzymeWeakProbability,
            double varietyPremiumProbability, double varietyLocalProbability,
            Random random, boolean caseStudyMode) {
        this.waterContentMinPercent = waterContentMinPercent;
        this.waterContentMaxPercent = waterContentMaxPercent;
        this.hmfMinMgPerKg = hmfMinMgPerKg;
        this.hmfMaxMgPerKg = hmfMaxMgPerKg;
        this.invertaseMinUPerKg = invertaseMinUPerKg;
        this.invertaseMaxUPerKg = invertaseMaxUPerKg;
        this.phMin = phMin;
        this.phMax = phMax;
        this.naturallyEnzymeWeakProbability = naturallyEnzymeWeakProbability;
        this.varietyPremiumProbability = varietyPremiumProbability;
        this.varietyLocalProbability = varietyLocalProbability;
        this.random = random;
        this.caseStudyMode = caseStudyMode;
    }

    private static final LabReportData CASE_STUDY_PREMIUM = new LabReportData(15.0, 5.0, 100.0, false, 4.0,
            Variety.PREMIUM_VARIETAL);
    private static final LabReportData CASE_STUDY_STANDARD = new LabReportData(17.5, 12.0, 75.0, false, 4.0,
            Variety.MIXED_BLOSSOM);
    private static final LabReportData CASE_STUDY_GATEKEEPER = new LabReportData(24.0, 12.0, 75.0, false, 4.0,
            Variety.MIXED_BLOSSOM);
    private static final LabReportData CASE_STUDY_PHQI_EXCLUDED = new LabReportData(21.0, 12.0, 75.0, false, 4.0,
            Variety.PREMIUM_VARIETAL);

    public LabReportData generate(LabReportOutcome outcome) {
        if (caseStudyMode) {
            LabReportData fixed = fixedForCaseStudy(outcome);
            if (fixed != null) {
                return fixed;
            }
        }
        return switch (outcome) {
            case NORMAL -> normal();
            case GATEKEEPER -> withWaterContent(23.01 + random.nextDouble() * 2);
            case PHQI_EXCLUDED -> phqiExcluded();
            case PREMIUM -> premium();
            case STANDARD -> standard();
        };
    }

    private LabReportData fixedForCaseStudy(LabReportOutcome outcome) {
        return switch (outcome) {
            case PREMIUM -> CASE_STUDY_PREMIUM;
            case STANDARD -> CASE_STUDY_STANDARD;
            case GATEKEEPER -> CASE_STUDY_GATEKEEPER;
            case PHQI_EXCLUDED -> CASE_STUDY_PHQI_EXCLUDED;
            case NORMAL -> null;
        };
    }

    public LabReportData generate(LabReportOutcome outcome, Variety varietyOverride) {
        LabReportData data = generate(outcome);
        return varietyOverride == null ? data : data.withVariety(varietyOverride);
    }

    private static final double TEMPERATURE_VIOLATION_HMF_INCREASE = 5.0;
    private static final double TEMPERATURE_VIOLATION_INVERTASE_DECREASE = 10.0;

    public LabReportData degrade(LabReportData previous) {
        return new LabReportData(
                previous.waterContentPercent(),
                previous.hmf() + TEMPERATURE_VIOLATION_HMF_INCREASE,
                Math.max(0, previous.invertaseActivity() - TEMPERATURE_VIOLATION_INVERTASE_DECREASE),
                previous.naturallyEnzymeWeak(),
                previous.ph(),
                previous.variety());
    }

    private LabReportData standard() {
        return new LabReportData(
                16.8 + random.nextDouble() * 1.19,
                10.01 + random.nextDouble() * 4.99,
                64 + random.nextDouble() * 20.9,
                false,
                randomInRange(phMin, phMax),
                randomVariety());
    }

    private LabReportData premium() {
        return new LabReportData(
                15.0 + random.nextDouble() * 1.7,
                1 + random.nextDouble() * 9,
                85 + random.nextDouble() * 45,
                false,
                randomInRange(phMin, phMax),
                Variety.PREMIUM_VARIETAL);
    }

    private LabReportData normal() {
        return new LabReportData(
                randomInRange(waterContentMinPercent, waterContentMaxPercent),
                randomInRange(hmfMinMgPerKg, hmfMaxMgPerKg),
                randomInRange(invertaseMinUPerKg, invertaseMaxUPerKg),
                random.nextDouble() < naturallyEnzymeWeakProbability,
                randomInRange(phMin, phMax),
                randomVariety());
    }

    private LabReportData withWaterContent(double waterContentPercent) {
        LabReportData base = normal();
        return new LabReportData(waterContentPercent, base.hmf(), base.invertaseActivity(),
                base.naturallyEnzymeWeak(), base.ph(), base.variety());
    }

    private LabReportData phqiExcluded() {
        LabReportData base = normal();
        int criterion = random.nextInt(3);
        return switch (criterion) {
            case 0 -> new LabReportData(
                    20.01 + random.nextDouble() * 2.99,
                    base.hmf(), base.invertaseActivity(), base.naturallyEnzymeWeak(), base.ph(), base.variety());
            case 1 -> new LabReportData(
                    base.waterContentPercent(), 40.01 + random.nextDouble() * 10,
                    base.invertaseActivity(), base.naturallyEnzymeWeak(), base.ph(), base.variety());
            default -> {
                double belowThreshold = base.naturallyEnzymeWeak() ? 45 : 64;
                yield new LabReportData(
                        base.waterContentPercent(), base.hmf(),
                        random.nextDouble() * (belowThreshold - 0.1),
                        base.naturallyEnzymeWeak(), base.ph(), base.variety());
            }
        };
    }

    private double randomInRange(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }

    private Variety randomVariety() {
        double roll = random.nextDouble();
        if (roll < varietyPremiumProbability) {
            return Variety.PREMIUM_VARIETAL;
        }
        if (roll < varietyPremiumProbability + varietyLocalProbability) {
            return Variety.LOCAL_VARIETAL;
        }
        return Variety.MIXED_BLOSSOM;
    }
}

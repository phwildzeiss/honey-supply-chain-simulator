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

    public LabReportGenerator(double waterContentMinPercent, double waterContentMaxPercent,
                               double hmfMinMgPerKg, double hmfMaxMgPerKg,
                               double invertaseMinUPerKg, double invertaseMaxUPerKg,
                               double phMin, double phMax,
                               double naturallyEnzymeWeakProbability,
                               double varietyPremiumProbability, double varietyLocalProbability,
                               Random random) {
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
    }

    public LabReportData generate(LabReportOutcome outcome) {
        return switch (outcome) {
            case NORMAL -> normal();
            case GATEKEEPER -> withWaterContent(23.01 + random.nextDouble() * 2);
            case PHQI_EXCLUDED -> phqiExcluded();
            case PREMIUM -> premium();
            case STANDARD -> standard();
        };
    }

    public LabReportData generate(LabReportOutcome outcome, Variety varietyOverride) {
        LabReportData data = generate(outcome);
        return varietyOverride == null ? data : data.withVariety(varietyOverride);
    }

    private LabReportData standard() {
        return new LabReportData(
                16.8 + random.nextDouble() * 1.19, // 16.8 <= water <= 18 %
                10.01 + random.nextDouble() * 4.99, // 10 < HMF <= 15 mg/kg
                64 + random.nextDouble() * 20.9, // 64 <= invertase < 85 U/kg
                false,
                randomInRange(phMin, phMax),
                randomVariety());
    }

    private LabReportData premium() {
        return new LabReportData(
                15.0 + random.nextDouble() * 1.7, // water content < 16.8 %
                1 + random.nextDouble() * 9, // HMF <= 10 mg/kg
                85 + random.nextDouble() * 45, // invertase >= 85 U/kg
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
                    20.01 + random.nextDouble() * 2.99, // >20 %, aber <=23 % - Ausschluss ohne harten Gatekeeper
                    base.hmf(), base.invertaseActivity(), base.naturallyEnzymeWeak(), base.ph(), base.variety());
            case 1 -> new LabReportData(
                    base.waterContentPercent(), 40.01 + random.nextDouble() * 10, // > 40 mg/kg
                    base.invertaseActivity(), base.naturallyEnzymeWeak(), base.ph(), base.variety());
            default -> {
                double belowThreshold = base.naturallyEnzymeWeak() ? 45 : 64;
                yield new LabReportData(
                        base.waterContentPercent(), base.hmf(),
                        random.nextDouble() * (belowThreshold - 0.1), // knapp unter der jeweiligen Invertase-Grenze
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

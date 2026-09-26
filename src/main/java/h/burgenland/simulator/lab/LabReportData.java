package h.burgenland.simulator.lab;

import h.burgenland.simulator.mci.Variety;

public record LabReportData(
        double waterContentPercent,
        double hmf,
        double invertaseActivity,
        boolean naturallyEnzymeWeak,
        double ph,
        Variety variety) {

    public LabReportData withVariety(Variety newVariety) {
        return new LabReportData(waterContentPercent, hmf, invertaseActivity, naturallyEnzymeWeak, ph, newVariety);
    }
}

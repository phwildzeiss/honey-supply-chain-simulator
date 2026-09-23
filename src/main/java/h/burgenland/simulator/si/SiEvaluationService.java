package h.burgenland.simulator.si;

import h.burgenland.simulator.common.Normalization;
import h.burgenland.simulator.common.Suitability;
import h.burgenland.simulator.common.db.DbConnectionFactory;
import h.burgenland.simulator.si.model.Apiary;
import h.burgenland.simulator.si.model.SensorInput;
import h.burgenland.simulator.si.model.SiScores;
import h.burgenland.simulator.si.repository.SensorDataRepository;
import h.burgenland.simulator.si.repository.WaterSourceRepository;

import java.sql.Connection;
import java.sql.SQLException;

public final class SiEvaluationService {

    private final WaterSourceRepository waterSourceRepository = new WaterSourceRepository();

    public SiScores evaluate(Apiary apiary, int year) throws SQLException {
        double waterSourceDistance = waterSourceRepository.findByApiary(apiary)
                .orElseThrow(() -> new IllegalStateException("No water source found for " + apiary.name()))
                .distance();
        try (Connection connection = DbConnectionFactory.connect()) {
            SensorAggregationService aggregation = new SensorAggregationService(new SensorDataRepository(connection));
            return evaluate(aggregation.aggregate(apiary.name(), year, waterSourceDistance));
        }
    }

    public static SiScores evaluate(SensorInput input) {
        return new SiScores(
                score(CriterionEvaluation.evaluateForage(input.honeyYieldKg())),
                score(CriterionEvaluation.evaluateSummerTemperature(input.summerTemperature())),
                score(CriterionEvaluation.evaluateWinterTemperature(input.winterTemperature())),
                score(CriterionEvaluation.evaluateLux(input.luxMorningSummer(), input.luxMiddaySummer(), input.luxWinter())),
                score(CriterionEvaluation.evaluateWindSpeed(input.windCategoryDays())),
                score(CriterionEvaluation.evaluateRelativeHumidity(input.humidity())),
                score(CriterionEvaluation.evaluatePrecipitationConditions(input.precipitationMm(), input.dryDays())),
                score(CriterionEvaluation.evaluateWaterSource(input.waterSourceDistance())));
    }

    private static double score(Suitability suitability) {
        return Normalization.normalizeSaatyScore(suitability.getScore());
    }
}

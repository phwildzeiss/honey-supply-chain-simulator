package h.burgenland.simulator.lab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class LabReportConfig {

    @Bean
    public LabReportGenerator labReportGenerator(
            @Value("${simulator.lab-report.water-content-min-percent:15.0}") double waterContentMinPercent,
            @Value("${simulator.lab-report.water-content-max-percent:19.5}") double waterContentMaxPercent,
            @Value("${simulator.lab-report.hmf-min-mg-per-kg:1}") double hmfMinMgPerKg,
            @Value("${simulator.lab-report.hmf-max-mg-per-kg:30}") double hmfMaxMgPerKg,
            @Value("${simulator.lab-report.invertase-min-u-per-kg:55}") double invertaseMinUPerKg,
            @Value("${simulator.lab-report.invertase-max-u-per-kg:130}") double invertaseMaxUPerKg,
            @Value("${simulator.lab-report.ph-min:3.2}") double phMin,
            @Value("${simulator.lab-report.ph-max:4.5}") double phMax,
            @Value("${simulator.lab-report.naturally-enzyme-weak-probability:0.1}") double naturallyEnzymeWeakProbability,
            @Value("${simulator.lab-report.variety-premium-probability:0.1}") double varietyPremiumProbability,
            @Value("${simulator.lab-report.variety-local-probability:0.4}") double varietyLocalProbability,
            @Value("${simulator.random-seed:42}") long seed) {
        return new LabReportGenerator(waterContentMinPercent, waterContentMaxPercent, hmfMinMgPerKg, hmfMaxMgPerKg,
                invertaseMinUPerKg, invertaseMaxUPerKg, phMin, phMax, naturallyEnzymeWeakProbability,
                varietyPremiumProbability, varietyLocalProbability, new Random(seed + 3));
    }
}

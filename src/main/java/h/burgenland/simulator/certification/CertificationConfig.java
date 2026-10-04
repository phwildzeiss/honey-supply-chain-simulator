package h.burgenland.simulator.certification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CertificationConfig {

    @Bean
    public CertificationGenerator certificationGenerator(
            @Value("${simulator.certification.association-probability:0.05}") double associationProbability,
            @Value("${simulator.certification.eu-organic-probability:0.10}") double euOrganicProbability,
            @Value("${simulator.certification.national-quality-label-probability:0.15}") double nationalQualityLabelProbability,
            @Value("${simulator.certification.association-pass-probability:0.40}") double associationPassProbability,
            @Value("${simulator.certification.eu-organic-pass-probability:0.60}") double euOrganicPassProbability,
            @Value("${simulator.certification.national-quality-label-pass-probability:0.80}") double nationalQualityLabelPassProbability,
            @Value("${simulator.random-seed:42}") long seed) {
        return new CertificationGenerator(associationProbability, euOrganicProbability,
                nationalQualityLabelProbability, associationPassProbability, euOrganicPassProbability,
                nationalQualityLabelPassProbability, new Random(seed + 5));
    }
}

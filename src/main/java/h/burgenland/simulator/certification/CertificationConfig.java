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
            @Value("${simulator.random-seed:42}") long seed) {
        return new CertificationGenerator(associationProbability, euOrganicProbability,
                nationalQualityLabelProbability, new Random(seed + 5));
    }
}

package h.burgenland.simulator.award;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AwardConfig {

    @Bean
    public AwardGenerator awardGenerator(
            @Value("${simulator.award.bronze-probability:0.15}") double bronzeProbability,
            @Value("${simulator.award.silver-probability:0.10}") double silverProbability,
            @Value("${simulator.award.gold-probability:0.05}") double goldProbability,
            @Value("${simulator.random-seed:42}") long seed) {
        return new AwardGenerator(bronzeProbability, silverProbability, goldProbability, new Random(seed + 4));
    }
}

package h.burgenland.simulator.award;

import h.burgenland.simulator.mci.Award;

import java.util.Random;

public class AwardGenerator {

    private final double bronzeProbability;
    private final double silverProbability;
    private final double goldProbability;
    private final Random random;

    public AwardGenerator(double bronzeProbability, double silverProbability, double goldProbability, Random random) {
        this.bronzeProbability = bronzeProbability;
        this.silverProbability = silverProbability;
        this.goldProbability = goldProbability;
        this.random = random;
    }

    public Award generate(Award force) {
        if (force != null) {
            return force;
        }
        double roll = random.nextDouble();
        if (roll < goldProbability) {
            return Award.GOLD;
        }
        if (roll < goldProbability + silverProbability) {
            return Award.SILVER;
        }
        if (roll < goldProbability + silverProbability + bronzeProbability) {
            return Award.BRONZE;
        }
        return Award.NONE;
    }
}

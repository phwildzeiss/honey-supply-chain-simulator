package h.burgenland.simulator.common;

public enum Suitability {
    UNSUITABLE(1),
    LESS_SUITABLE(3),
    SUITABLE(5),
    MORE_SUITABLE(9);

    private final int score;

    Suitability(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

package h.burgenland.simulator.common;

public final class Scaling {

    private static final int CONTRACT_SCALE = 10_000;

    private Scaling() {
    }

    public static int toContractScale(double normalized) {
        return (int) Math.round(normalized * CONTRACT_SCALE);
    }
}

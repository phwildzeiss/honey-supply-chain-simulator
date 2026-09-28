package h.burgenland.simulator.common;

/**
 * Wall-clock split of one simulator step into its three phases: creating the document, uploading it to IPFS and
 * sending the transaction (including waiting for its confirmation). A phase that does not run is 0.
 */
public record StepTimings(long renderMs, long uploadMs, long chainMs) {

    /** Builds the timings from four {@link System#nanoTime()} marks taken at the phase boundaries. */
    public static StepTimings of(long start, long afterRender, long afterUpload, long end) {
        return new StepTimings(
                toMillis(afterRender - start), toMillis(afterUpload - afterRender), toMillis(end - afterUpload));
    }

    private static long toMillis(long nanos) {
        return nanos / 1_000_000;
    }
}

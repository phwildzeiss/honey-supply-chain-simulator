package h.burgenland.simulator.award;

import h.burgenland.simulator.mci.Award;

import java.math.BigInteger;

public record AwardResult(Award award, String ipfsCid, String transactionHash, BigInteger gasUsed) {
}

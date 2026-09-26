package h.burgenland.simulator.certification;

import h.burgenland.simulator.mci.Certification;

import java.math.BigInteger;

public record CertificationResult(Certification certification, String ipfsCid, String transactionHash, BigInteger gasUsed) {
}

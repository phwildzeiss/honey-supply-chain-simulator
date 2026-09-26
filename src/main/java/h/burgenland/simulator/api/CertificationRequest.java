package h.burgenland.simulator.api;

import h.burgenland.simulator.mci.Certification;

public record CertificationRequest(String beekeeperAddress, Certification force) {
}

package h.burgenland.simulator.api;

import h.burgenland.simulator.mci.Award;

public record AwardRequest(Long batchId, Award force) {
}

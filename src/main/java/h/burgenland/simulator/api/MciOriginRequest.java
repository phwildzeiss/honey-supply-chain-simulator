package h.burgenland.simulator.api;

import h.burgenland.simulator.mci.Region;
import h.burgenland.simulator.mci.Variety;

public record MciOriginRequest(Variety variety, Region region) {
}

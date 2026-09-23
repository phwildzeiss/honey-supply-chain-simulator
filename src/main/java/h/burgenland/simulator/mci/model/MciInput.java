package h.burgenland.simulator.mci.model;

import h.burgenland.simulator.mci.Award;
import h.burgenland.simulator.mci.Certification;
import h.burgenland.simulator.mci.Region;
import h.burgenland.simulator.mci.Variety;

public record MciInput(Variety variety, Region region, Certification certification, Award award) {
}

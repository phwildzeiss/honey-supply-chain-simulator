package h.burgenland.simulator.api;

import h.burgenland.simulator.common.Scaling;
import h.burgenland.simulator.si.model.SiScores;

public record SiResponse(
        int forage,
        int lightIntensity,
        int waterSource,
        int summerTemperature,
        int winterTemperature,
        int windSpeed,
        int humidity,
        int precipitation) {

    public static SiResponse from(SiScores scores) {
        return new SiResponse(
                Scaling.toContractScale(scores.forage()),
                Scaling.toContractScale(scores.lightIntensity()),
                Scaling.toContractScale(scores.waterSource()),
                Scaling.toContractScale(scores.summerTemperature()),
                Scaling.toContractScale(scores.winterTemperature()),
                Scaling.toContractScale(scores.windSpeed()),
                Scaling.toContractScale(scores.humidity()),
                Scaling.toContractScale(scores.precipitation()));
    }
}

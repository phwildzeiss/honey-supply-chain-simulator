package h.burgenland.simulator.api;

import h.burgenland.simulator.si.model.SensorInput;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

class FakeStationDataSource implements StationDataSource {

    static final SensorInput BEST_INPUT =
            new SensorInput(30, 5, 50, 1200, 10, Map.of("OC", 100.0), 100, 100_000, 0, 100_000, 45);

    private final String failingStation;

    FakeStationDataSource() {
        this(null);
    }

    FakeStationDataSource(String failingStation) {
        this.failingStation = failingStation;
    }

    @Override
    public List<String> stationNames() {
        return List.of("Bienenstand_1", "Bienenstand_2");
    }

    @Override
    public SensorInput load(String station) throws SQLException {
        if (station.equals(failingStation)) {
            throw new SQLException("simulated failure");
        }
        return BEST_INPUT;
    }
}

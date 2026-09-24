package h.burgenland.simulator.api;

import h.burgenland.simulator.si.model.SensorInput;

import java.sql.SQLException;
import java.util.List;

public interface StationDataSource {

    List<String> stationNames() throws SQLException;

    SensorInput load(String station) throws SQLException;
}

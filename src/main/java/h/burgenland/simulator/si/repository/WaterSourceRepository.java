package h.burgenland.simulator.si.repository;

import h.burgenland.simulator.common.db.DbConnectionFactory;
import h.burgenland.simulator.si.model.Apiary;
import h.burgenland.simulator.si.model.WaterSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public final class WaterSourceRepository {

    public Optional<WaterSource> findByApiary(Apiary apiary) throws SQLException {
        String sql = "SELECT id, distance, apiary_mac FROM water_source WHERE apiary_mac = ?";
        try (Connection connection = DbConnectionFactory.connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, apiary.mac());
            try (ResultSet resultSet = statement.executeQuery()) {
                if (!resultSet.next()) {
                    return Optional.empty();
                }
                return Optional.of(new WaterSource(
                        resultSet.getLong("id"),
                        resultSet.getDouble("distance"),
                        resultSet.getString("apiary_mac")));
            }
        }
    }
}

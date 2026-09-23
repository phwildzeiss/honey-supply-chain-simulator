package h.burgenland.simulator.si.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public final class SensorDataRepository {

    private final Connection connection;

    public SensorDataRepository(Connection connection) {
        this.connection = connection;
    }

    public double averageOfDailyMaxTemperature(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        return averageOfDaily("MAX(temperature)", station, start, end);
    }

    public double averageOfDailyAverageTemperature(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        return averageOfDaily("AVG(temperature)", station, start, end);
    }

    public double averageOfDailyAverageHumidity(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        return averageOfDaily("AVG(humidity)", station, start, end);
    }

    public double totalPrecipitation(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        String sql = "SELECT SUM(rain) FROM sensor_data WHERE station = ? AND time BETWEEN ? AND ?";
        return queryDouble(sql, station, start, end).orElse(0.0);
    }

    public List<Double> dailyRainSums(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        String sql = "SELECT SUM(rain) FROM sensor_data WHERE station = ? AND time BETWEEN ? AND ? "
                + "GROUP BY DATE(time) ORDER BY DATE(time)";
        return queryDoubles(sql, station, start, end);
    }

    public Map<String, Double> windCategoryDays(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        String sql = """
                SELECT category, COUNT(*) AS day_count
                FROM (
                    SELECT CASE
                               WHEN max_wind_speed * 3.6 < 10 THEN 'OC'
                               WHEN max_wind_speed * 3.6 < 15 THEN 'PO'
                               WHEN max_wind_speed * 3.6 < 30 THEN 'AC15_30'
                               ELSE 'AC30'
                           END AS category
                    FROM (
                        SELECT MAX(wind_speed) AS max_wind_speed
                        FROM sensor_data
                        WHERE station = ? AND time BETWEEN ? AND ?
                        GROUP BY DATE(time)
                    ) AS daily_max
                ) AS categorized
                GROUP BY category
                """;
        Map<String, Double> counts = new HashMap<>();
        try (PreparedStatement statement = prepare(sql, station, start, end);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                counts.put(resultSet.getString("category"), resultSet.getDouble("day_count"));
            }
        }
        return counts;
    }

    public OptionalDouble averageLightIntensity(String station, LocalDateTime start, LocalDateTime end,
                                                int fromHour, int toHour, int fromMonth, int toMonth) throws SQLException {
        String sql = "SELECT AVG(light_intensity) FROM sensor_data WHERE station = ? AND time BETWEEN ? AND ? "
                + "AND HOUR(time) BETWEEN ? AND ? AND MONTH(time) BETWEEN ? AND ?";
        return queryDouble(sql, station, start, end, fromHour, toHour, fromMonth, toMonth);
    }

    public List<Double> weights(String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        String sql = "SELECT weight FROM sensor_data WHERE station = ? AND time BETWEEN ? AND ? ORDER BY time";
        return queryDoubles(sql, station, start, end);
    }

    private double averageOfDaily(String dailyExpression, String station, LocalDateTime start, LocalDateTime end) throws SQLException {
        String sql = "SELECT AVG(COALESCE(daily.daily_value, 0)) FROM (SELECT " + dailyExpression
                + " AS daily_value FROM sensor_data WHERE station = ? AND time BETWEEN ? AND ? "
                + "GROUP BY DATE(time)) daily";
        return queryDouble(sql, station, start, end).orElse(0.0);
    }

    private OptionalDouble queryDouble(String sql, Object... parameters) throws SQLException {
        try (PreparedStatement statement = prepare(sql, parameters);
             ResultSet resultSet = statement.executeQuery()) {
            resultSet.next();
            double value = resultSet.getDouble(1);
            return resultSet.wasNull() ? OptionalDouble.empty() : OptionalDouble.of(value);
        }
    }

    private List<Double> queryDoubles(String sql, Object... parameters) throws SQLException {
        List<Double> values = new ArrayList<>();
        try (PreparedStatement statement = prepare(sql, parameters);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                values.add(resultSet.getDouble(1));
            }
        }
        return values;
    }

    private PreparedStatement prepare(String sql, Object... parameters) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(sql);
        for (int i = 0; i < parameters.length; i++) {
            statement.setObject(i + 1, parameters[i]);
        }
        return statement;
    }
}

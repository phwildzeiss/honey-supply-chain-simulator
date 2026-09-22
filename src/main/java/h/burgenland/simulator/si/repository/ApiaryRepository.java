package h.burgenland.simulator.si.repository;

import h.burgenland.simulator.common.db.DbConnectionFactory;
import h.burgenland.simulator.si.model.Apiary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public final class ApiaryRepository {

    public List<Apiary> findAll() throws SQLException {
        List<Apiary> apiaries = new ArrayList<>();
        try (Connection connection = DbConnectionFactory.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT mac, name FROM apiary")) {
            while (resultSet.next()) {
                apiaries.add(new Apiary(resultSet.getString("mac"), resultSet.getString("name")));
            }
        }
        return apiaries;
    }
}

package h.burgenland.simulator.common.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConnectionFactory {

    private DbConnectionFactory() {
    }

    public static Connection connect() throws SQLException {
        DbConfig config = DbConfig.load();
        String url = "jdbc:mariadb://%s:%s/%s".formatted(config.host(), config.port(), config.database());
        return DriverManager.getConnection(url, config.user(), config.password());
    }
}

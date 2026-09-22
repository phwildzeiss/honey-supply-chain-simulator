package h.burgenland.simulator.common.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

/**
 * Manual smoke test for the DB connection - run this class directly
 * (IDE run configuration or `mvn exec:java -Dexec.mainClass=...`) to verify
 * db.local.properties is set up correctly. Not a JUnit test, since it
 * requires a reachable database.
 */
public final class DbConnectionCheck {

    private DbConnectionCheck() {
    }

    public static void main(String[] args) throws Exception {
        try (Connection connection = DbConnectionFactory.connect()) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println("Connected: " + metaData.getURL());
            System.out.println("Product:   " + metaData.getDatabaseProductName() + " " + metaData.getDatabaseProductVersion());
        }
    }
}

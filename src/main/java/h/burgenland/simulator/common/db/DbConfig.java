package h.burgenland.simulator.common.db;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Loads DB connection settings from db.local.properties (git-ignored, real
 * credentials) in the project's working directory. Copy db.properties.example
 * to db.local.properties and fill in the real values before running anything
 * that touches the database.
 */
public final class DbConfig {

    private static final Path LOCAL_PROPERTIES_PATH = Path.of("db.local.properties");

    private final Properties properties;

    private DbConfig(Properties properties) {
        this.properties = properties;
    }

    public static DbConfig load() {
        if (!Files.exists(LOCAL_PROPERTIES_PATH)) {
            throw new IllegalStateException(
                    "db.local.properties not found. Copy db.properties.example to db.local.properties and fill in the real credentials.");
        }
        Properties properties = new Properties();
        try (InputStream in = Files.newInputStream(LOCAL_PROPERTIES_PATH)) {
            properties.load(in);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read db.local.properties", e);
        }
        return new DbConfig(properties);
    }

    public String host() {
        return properties.getProperty("db.host");
    }

    public String port() {
        return properties.getProperty("db.port");
    }

    public String database() {
        return properties.getProperty("db.name");
    }

    public String user() {
        return properties.getProperty("db.user");
    }

    public String password() {
        return properties.getProperty("db.password");
    }
}

package h.burgenland.simulator.web3;

import h.burgenland.simulator.web3.generated.ActorRegistry;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.utils.Numeric;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Manual smoke test for the Web3j connection - run this class directly
 * (IDE run configuration) to verify application-local.properties is set up
 * correctly against a running node. Not a JUnit test, since it requires a
 * reachable node and deployed contracts.
 */
public final class Web3ConnectionCheck {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        try (FileInputStream in = new FileInputStream(Path.of("application-local.properties").toFile())) {
            properties.load(in);
        }
        Web3j web3j = Web3j.build(new HttpService(properties.getProperty("simulator.web3.rpc-url", "http://localhost:8545")));
        System.out.println("Chain ID: " + web3j.ethChainId().send().getChainId());

        Credentials credentials = Credentials.create(properties.getProperty("simulator.web3.lab-private-key"));
        ActorRegistry actorRegistry = ActorRegistry.load(
                properties.getProperty("simulator.web3.contracts.actor-registry"),
                web3j, credentials, new DefaultGasProvider());
        System.out.println("BEEKEEPER_ROLE: " + Numeric.toHexString(actorRegistry.BEEKEEPER_ROLE().send()));
    }
}

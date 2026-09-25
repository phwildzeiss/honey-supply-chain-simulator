package h.burgenland.simulator.web3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.crypto.Credentials;

/**
 * Each wallet bean only exists once its private key is configured in
 * application-local.properties, so the application still starts (e.g. for
 * tests) before the Web3j-signing endpoints are wired up.
 */
@Configuration
public class WalletConfig {

    @Bean
    @ConditionalOnProperty("simulator.web3.lab-private-key")
    public Credentials labCredentials(@Value("${simulator.web3.lab-private-key}") String privateKey) {
        return Credentials.create(privateKey);
    }

    @Bean
    @ConditionalOnProperty("simulator.web3.award-body-private-key")
    public Credentials awardBodyCredentials(@Value("${simulator.web3.award-body-private-key}") String privateKey) {
        return Credentials.create(privateKey);
    }

    @Bean
    @ConditionalOnProperty("simulator.web3.certification-body-private-key")
    public Credentials certificationBodyCredentials(@Value("${simulator.web3.certification-body-private-key}") String privateKey) {
        return Credentials.create(privateKey);
    }
}

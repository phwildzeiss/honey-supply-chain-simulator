package h.burgenland.simulator.web3;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "simulator.web3.contracts")
public record ContractAddresses(
        String actorRegistry,
        String honeyToken,
        String qualityIndex,
        String pricingModel,
        String supplyChain,
        String consumerGateway) {
}

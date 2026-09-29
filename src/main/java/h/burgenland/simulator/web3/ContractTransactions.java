package h.burgenland.simulator.web3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.io.IOException;
import java.math.BigInteger;

/**
 * Builds what a contract wrapper needs to send a transaction: a transaction manager per signer and the gas provider.
 * Compared to the web3j defaults it signs with the chain id (public RPC nodes reject transactions without replay
 * protection), polls for the receipt every second instead of every 15 seconds, and uses the current network gas price.
 */
@Component
public class ContractTransactions {

    private final Web3j web3j;
    private final NetworkGasProvider gasProvider;
    private final int receiptPollAttempts;
    private final long receiptPollIntervalMs;
    private Long chainId;

    public ContractTransactions(Web3j web3j,
                                @Value("${simulator.web3.gas-limit}") long gasLimit,
                                @Value("${simulator.web3.gas-price-margin-percent}") int gasPriceMarginPercent,
                                @Value("${simulator.web3.receipt-poll-interval-ms}") long receiptPollIntervalMs,
                                @Value("${simulator.web3.receipt-poll-attempts}") int receiptPollAttempts) {
        this.web3j = web3j;
        this.gasProvider = new NetworkGasProvider(
                () -> web3j.ethGasPrice().send().getGasPrice(), gasPriceMarginPercent, BigInteger.valueOf(gasLimit));
        this.receiptPollIntervalMs = receiptPollIntervalMs;
        this.receiptPollAttempts = receiptPollAttempts;
    }

    public TransactionManager managerFor(Credentials credentials) throws IOException {
        return new RawTransactionManager(web3j, credentials, chainId(), receiptPollAttempts, receiptPollIntervalMs);
    }

    public ContractGasProvider gasProvider() {
        return gasProvider;
    }

    /** The chain id is fixed for a node, so it is read once on first use. */
    private synchronized long chainId() throws IOException {
        if (chainId == null) {
            chainId = web3j.ethChainId().send().getChainId().longValueExact();
        }
        return chainId;
    }
}

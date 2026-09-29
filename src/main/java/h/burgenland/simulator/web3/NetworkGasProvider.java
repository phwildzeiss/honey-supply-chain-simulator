package h.burgenland.simulator.web3;

import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/**
 * Gas provider that asks the network for the current gas price on every transaction instead of using a fixed one.
 * The price gets a safety margin because the base fee can rise between asking and inclusion; the gas limit is a
 * fixed upper bound well above what any simulator transaction needs.
 */
public class NetworkGasProvider implements ContractGasProvider {

    private final Callable<BigInteger> priceSource;
    private final int marginPercent;
    private final BigInteger gasLimit;

    public NetworkGasProvider(Callable<BigInteger> priceSource, int marginPercent, BigInteger gasLimit) {
        this.priceSource = priceSource;
        this.marginPercent = marginPercent;
        this.gasLimit = gasLimit;
    }

    @Override
    public BigInteger getGasPrice() {
        try {
            return priceSource.call()
                    .multiply(BigInteger.valueOf(100L + marginPercent))
                    .divide(BigInteger.valueOf(100));
        } catch (Exception e) {
            throw new IllegalStateException("Could not read the gas price from the network", e);
        }
    }

    @Override
    public BigInteger getGasLimit(Transaction transaction) {
        return gasLimit;
    }

    @Override
    public BigInteger getGasLimit() {
        return gasLimit;
    }
}

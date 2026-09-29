package h.burgenland.simulator.web3;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NetworkGasProviderTest {

    private static final BigInteger LIMIT = BigInteger.valueOf(1_000_000);

    @Test
    void addsTheMarginToTheNetworkPrice() {
        NetworkGasProvider provider = new NetworkGasProvider(() -> BigInteger.valueOf(2_000_000_000L), 25, LIMIT);

        assertEquals(BigInteger.valueOf(2_500_000_000L), provider.getGasPrice());
    }

    @Test
    void asksTheNetworkAgainOnEveryCall() {
        BigInteger[] price = {BigInteger.valueOf(1_000_000_000L)};
        NetworkGasProvider provider = new NetworkGasProvider(() -> price[0], 0, LIMIT);

        assertEquals(BigInteger.valueOf(1_000_000_000L), provider.getGasPrice());
        price[0] = BigInteger.valueOf(3_000_000_000L);
        assertEquals(BigInteger.valueOf(3_000_000_000L), provider.getGasPrice());
    }

    @Test
    void usesTheFixedGasLimit() {
        NetworkGasProvider provider = new NetworkGasProvider(() -> BigInteger.ONE, 0, LIMIT);

        assertEquals(LIMIT, provider.getGasLimit());
        assertEquals(LIMIT, provider.getGasLimit(null));
    }

    @Test
    void failsClearlyWhenTheNetworkPriceIsUnavailable() {
        NetworkGasProvider provider = new NetworkGasProvider(() -> {
            throw new java.io.IOException("node down");
        }, 25, LIMIT);

        assertThrows(IllegalStateException.class, provider::getGasPrice);
    }
}

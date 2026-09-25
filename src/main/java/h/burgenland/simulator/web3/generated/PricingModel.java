package h.burgenland.simulator.web3.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/LFDT-web3j/web3j/tree/main/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 5.0.2.
 */
@SuppressWarnings("rawtypes")
@Generated("org.web3j.codegen.SolidityFunctionWrapperGenerator")
public class PricingModel extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b506040516110ce3803806110ce83398181016040528101906100319190610150565b825f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550806002819055505050506101a0565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6100ec826100c3565b9050919050565b6100fc816100e2565b8114610106575f5ffd5b50565b5f81519050610117816100f3565b92915050565b5f819050919050565b61012f8161011d565b8114610139575f5ffd5b50565b5f8151905061014a81610126565b92915050565b5f5f5f60608486031215610167576101666100bf565b5b5f61017486828701610109565b935050602061018586828701610109565b92505060406101968682870161013c565b9150509250925092565b610f21806101ad5f395ff3fe608060405234801561000f575f5ffd5b5060043610610086575f3560e01c8063d561183b11610059578063d561183b14610136578063db1d0fd514610154578063eae7b93514610172578063eb86fbdf1461019057610086565b80630c17d42c1461008a57806321b52519146100a6578063a893e326146100d6578063c413944114610106575b5f5ffd5b6100a4600480360381019061009f9190610818565b6101ac565b005b6100c060048036038101906100bb919061087c565b61031d565b6040516100cd91906108c9565b60405180910390f35b6100f060048036038101906100eb91906108e2565b610330565b6040516100fd91906108c9565b60405180910390f35b610120600480360381019061011b919061087c565b610345565b60405161012d91906108c9565b60405180910390f35b61013e610575565b60405161014b9190610987565b60405180910390f35b61015c61059a565b60405161016991906108c9565b60405180910390f35b61017a6105a0565b60405161018791906109c0565b60405180910390f35b6101aa60048036038101906101a591906109d9565b6105c4565b005b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610215573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906102399190610a4a565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610294929190610aa4565b602060405180830381865afa1580156102af573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906102d39190610b00565b610312576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161030990610b85565b60405180910390fd5b816002819055505050565b5f6103288383610345565b905092915050565b6003602052805f5260405f205f915090505481565b5f5f60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16631742108b856040518263ffffffff1660e01b81526004016103a191906108c9565b6040805180830381865afa1580156103bb573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906103df9190610bc6565b50905080610422576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161041990610c74565b60405180910390fd5b5f60035f8563ffffffff1663ffffffff1681526020019081526020015f205490505f8111610485576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161047c90610d02565b60405180910390fd5b5f60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16636c4f3f6e876040518263ffffffff1660e01b81526004016104e091906108c9565b602060405180830381865afa1580156104fb573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061051f9190610d34565b90506127108061052f9190610d8c565b8160025461053d9190610d8c565b6127108061054b9190610d8c565b6105559190610dcd565b836105609190610d8c565b61056a9190610e2d565b935050505092915050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60025481565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561062d573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106519190610a4a565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016106ac929190610aa4565b602060405180830381865afa1580156106c7573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106eb9190610b00565b61072a576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161072190610b85565b60405180910390fd5b61073383610799565b610772576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161076990610ecd565b60405180910390fd5b8160035f8563ffffffff1663ffffffff1681526020019081526020015f2081905550505050565b5f6103e863ffffffff168263ffffffff1614806107c357506101f463ffffffff168263ffffffff16145b806107da575060fa63ffffffff168263ffffffff16145b9050919050565b5f5ffd5b5f819050919050565b6107f7816107e5565b8114610801575f5ffd5b50565b5f81359050610812816107ee565b92915050565b5f6020828403121561082d5761082c6107e1565b5b5f61083a84828501610804565b91505092915050565b5f63ffffffff82169050919050565b61085b81610843565b8114610865575f5ffd5b50565b5f8135905061087681610852565b92915050565b5f5f60408385031215610892576108916107e1565b5b5f61089f85828601610804565b92505060206108b085828601610868565b9150509250929050565b6108c3816107e5565b82525050565b5f6020820190506108dc5f8301846108ba565b92915050565b5f602082840312156108f7576108f66107e1565b5b5f61090484828501610868565b91505092915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f819050919050565b5f61094f61094a6109458461090d565b61092c565b61090d565b9050919050565b5f61096082610935565b9050919050565b5f61097182610956565b9050919050565b61098181610967565b82525050565b5f60208201905061099a5f830184610978565b92915050565b5f6109aa82610956565b9050919050565b6109ba816109a0565b82525050565b5f6020820190506109d35f8301846109b1565b92915050565b5f5f604083850312156109ef576109ee6107e1565b5b5f6109fc85828601610868565b9250506020610a0d85828601610804565b9150509250929050565b5f819050919050565b610a2981610a17565b8114610a33575f5ffd5b50565b5f81519050610a4481610a20565b92915050565b5f60208284031215610a5f57610a5e6107e1565b5b5f610a6c84828501610a36565b91505092915050565b610a7e81610a17565b82525050565b5f610a8e8261090d565b9050919050565b610a9e81610a84565b82525050565b5f604082019050610ab75f830185610a75565b610ac46020830184610a95565b9392505050565b5f8115159050919050565b610adf81610acb565b8114610ae9575f5ffd5b50565b5f81519050610afa81610ad6565b92915050565b5f60208284031215610b1557610b146107e1565b5b5f610b2284828501610aec565b91505092915050565b5f82825260208201905092915050565b7f50726963696e674d6f64656c3a206d697373696e6720726f6c650000000000005f82015250565b5f610b6f601a83610b2b565b9150610b7a82610b3b565b602082019050919050565b5f6020820190508181035f830152610b9c81610b63565b9050919050565b60038110610baf575f5ffd5b50565b5f81519050610bc081610ba3565b92915050565b5f5f60408385031215610bdc57610bdb6107e1565b5b5f610be985828601610aec565b9250506020610bfa85828601610bb2565b9150509250929050565b7f50726963696e674d6f64656c3a206261746368206973206e6f742073656c6c615f8201527f626c650000000000000000000000000000000000000000000000000000000000602082015250565b5f610c5e602383610b2b565b9150610c6982610c04565b604082019050919050565b5f6020820190508181035f830152610c8b81610c52565b9050919050565b7f50726963696e674d6f64656c3a206e6f20666c6f6f72207072696365207365745f8201527f20666f722074686973206a61722073697a650000000000000000000000000000602082015250565b5f610cec603283610b2b565b9150610cf782610c92565b604082019050919050565b5f6020820190508181035f830152610d1981610ce0565b9050919050565b5f81519050610d2e816107ee565b92915050565b5f60208284031215610d4957610d486107e1565b5b5f610d5684828501610d20565b91505092915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f610d96826107e5565b9150610da1836107e5565b9250828202610daf816107e5565b91508282048414831517610dc657610dc5610d5f565b5b5092915050565b5f610dd7826107e5565b9150610de2836107e5565b9250828201905080821115610dfa57610df9610d5f565b5b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601260045260245ffd5b5f610e37826107e5565b9150610e42836107e5565b925082610e5257610e51610e00565b5b828204905092915050565b7f50726963696e674d6f64656c3a20756e737570706f72746564206a61722073695f8201527f7a65000000000000000000000000000000000000000000000000000000000000602082015250565b5f610eb7602283610b2b565b9150610ec282610e5d565b604082019050919050565b5f6020820190508181035f830152610ee481610eab565b905091905056fea2646970667358221220a8fa2217351fee07c1ed6c92b16991a361cfc1d3bdb941d2c6326f58dbd30af864736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_ALPHA = "alpha";

    public static final String FUNC_CALCULATEPRICE = "calculatePrice";

    public static final String FUNC_FLOORPRICES = "floorPrices";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_QUALITYINDEX = "qualityIndex";

    public static final String FUNC_SETALPHA = "setAlpha";

    public static final String FUNC_SETFLOORPRICE = "setFloorPrice";

    @Deprecated
    protected PricingModel(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected PricingModel(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected PricingModel(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected PricingModel(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> alpha() {
        final Function function = new Function(FUNC_ALPHA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculatePrice(BigInteger batchId,
            BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_CALCULATEPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> floorPrices(BigInteger param0) {
        final Function function = new Function(FUNC_FLOORPRICES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getPrice(BigInteger batchId, BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_GETPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> qualityIndex() {
        final Function function = new Function(FUNC_QUALITYINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAlpha(BigInteger newAlpha) {
        final Function function = new Function(
                FUNC_SETALPHA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(newAlpha)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setFloorPrice(BigInteger jarSizeGrams,
            BigInteger priceCents) {
        final Function function = new Function(
                FUNC_SETFLOORPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams), 
                new org.web3j.abi.datatypes.generated.Uint256(priceCents)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static PricingModel load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new PricingModel(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static PricingModel load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new PricingModel(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static PricingModel load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new PricingModel(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PricingModel load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new PricingModel(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<PricingModel> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<PricingModel> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider,
            String actorRegistryAddress, String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<PricingModel> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<PricingModel> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            String actorRegistryAddress, String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    public static void linkLibraries(List<Contract.LinkReference> references) {
        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
    }

    private static String getDeploymentBinary() {
        if (librariesLinkedBinary != null) {
            return librariesLinkedBinary;
        } else {
            return BINARY;
        }
    }
}

package h.burgenland.simulator.web3.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tuples.generated.Tuple6;
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
public class ConsumerGateway extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b50604051611932380380611932833981810160405281019061003191906101d8565b845f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508360015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508260025f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508160035f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508060045f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550505050505061024f565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6101a78261017e565b9050919050565b6101b78161019d565b81146101c1575f5ffd5b50565b5f815190506101d2816101ae565b92915050565b5f5f5f5f5f60a086880312156101f1576101f061017a565b5b5f6101fe888289016101c4565b955050602061020f888289016101c4565b9450506040610220888289016101c4565b9350506060610231888289016101c4565b9250506080610242888289016101c4565b9150509295509295909350565b6116d68061025c5f395ff3fe608060405234801561000f575f5ffd5b50600436106100cd575f3560e01c806388d84b661161008a578063b09afec111610064578063b09afec114610215578063ca6aa07614610249578063d561183b14610265578063eae7b93514610283576100cd565b806388d84b66146101a6578063970ad861146101c4578063ad6d3137146101f9576100cd565b8063026520d4146100d157806321b52519146100ef57806327124cb71461011f57806329831f5d146101505780632f4a3c8d1461016e5780634879ef141461018a575b5f5ffd5b6100d96102a1565b6040516100e69190610d67565b60405180910390f35b61010960048036038101906101049190610df9565b6102c6565b6040516101169190610e46565b60405180910390f35b61013960048036038101906101349190610e5f565b61036a565b604051610147929190610f24565b60405180910390f35b610158610415565b6040516101659190610f6b565b60405180910390f35b61018860048036038101906101839190610fae565b61043a565b005b6101a4600480360381019061019f9190610fae565b6105e4565b005b6101ae61078e565b6040516101bb9190610ff9565b60405180910390f35b6101de60048036038101906101d99190610e5f565b6107b3565b6040516101f0969594939291906110cb565b60405180910390f35b610213600480360381019061020e9190610fae565b610867565b005b61022f600480360381019061022a9190610e5f565b610a11565b604051610240959493929190611153565b60405180910390f35b610263600480360381019061025e9190610fae565b610ac2565b005b61026d610c6c565b60405161027a91906111c4565b60405180910390f35b61028b610c91565b60405161029891906111fd565b60405180910390f35b60045f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f60045f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166321b5251984846040518363ffffffff1660e01b8152600401610323929190611216565b602060405180830381865afa15801561033e573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906103629190611251565b905092915050565b610372610cb5565b5f60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16635ac44282846040518263ffffffff1660e01b81526004016103cd9190610e46565b608060405180830381865afa1580156103e8573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061040c91906113a7565b91509150915091565b60025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156104a3573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104c79190611418565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610522929190611452565b602060405180830381865afa15801561053d573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061056191906114a3565b6105a0576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161059790611528565b60405180910390fd5b8160035f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561064d573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106719190611418565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016106cc929190611452565b602060405180830381865afa1580156106e7573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061070b91906114a3565b61074a576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161074190611528565b60405180910390fd5b8160025f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f5f5f5f5f60035f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663970ad861886040518263ffffffff1660e01b81526004016108139190610e46565b60c060405180830381865afa15801561082e573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610852919061158c565b95509550955095509550955091939550919395565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156108d0573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906108f49190611418565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161094f929190611452565b602060405180830381865afa15801561096a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061098e91906114a3565b6109cd576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016109c490611528565b60405180910390fd5b8160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b5f5f5f5f5f60025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663b09afec1876040518263ffffffff1660e01b8152600401610a709190610e46565b60a060405180830381865afa158015610a8b573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610aaf9190611629565b9450945094509450945091939590929450565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610b2b573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610b4f9190611418565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610baa929190611452565b602060405180830381865afa158015610bc5573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610be991906114a3565b610c28576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610c1f90611528565b60405180910390fd5b8160045f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b60035f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60405180606001604052805f81526020015f61ffff1681526020015f73ffffffffffffffffffffffffffffffffffffffff1681525090565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f819050919050565b5f610d2f610d2a610d2584610ced565b610d0c565b610ced565b9050919050565b5f610d4082610d15565b9050919050565b5f610d5182610d36565b9050919050565b610d6181610d47565b82525050565b5f602082019050610d7a5f830184610d58565b92915050565b5f604051905090565b5f5ffd5b5f819050919050565b610d9f81610d8d565b8114610da9575f5ffd5b50565b5f81359050610dba81610d96565b92915050565b5f63ffffffff82169050919050565b610dd881610dc0565b8114610de2575f5ffd5b50565b5f81359050610df381610dcf565b92915050565b5f5f60408385031215610e0f57610e0e610d89565b5b5f610e1c85828601610dac565b9250506020610e2d85828601610de5565b9150509250929050565b610e4081610d8d565b82525050565b5f602082019050610e595f830184610e37565b92915050565b5f60208284031215610e7457610e73610d89565b5b5f610e8184828501610dac565b91505092915050565b610e9381610d8d565b82525050565b5f61ffff82169050919050565b610eaf81610e99565b82525050565b5f610ebf82610ced565b9050919050565b610ecf81610eb5565b82525050565b606082015f820151610ee95f850182610e8a565b506020820151610efc6020850182610ea6565b506040820151610f0f6040850182610ec6565b50505050565b610f1e81610eb5565b82525050565b5f608082019050610f375f830185610ed5565b610f446060830184610f15565b9392505050565b5f610f5582610d36565b9050919050565b610f6581610f4b565b82525050565b5f602082019050610f7e5f830184610f5c565b92915050565b610f8d81610eb5565b8114610f97575f5ffd5b50565b5f81359050610fa881610f84565b92915050565b5f60208284031215610fc357610fc2610d89565b5b5f610fd084828501610f9a565b91505092915050565b5f610fe382610d36565b9050919050565b610ff381610fd9565b82525050565b5f60208201905061100c5f830184610fea565b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602160045260245ffd5b600381106110505761104f611012565b5b50565b5f8190506110608261103f565b919050565b5f61106f82611053565b9050919050565b61107f81611065565b82525050565b6003811061109657611095611012565b5b50565b5f8190506110a682611085565b919050565b5f6110b582611099565b9050919050565b6110c5816110ab565b82525050565b5f60c0820190506110de5f830189610e37565b6110eb6020830188610e37565b6110f86040830187610e37565b6111056060830186610e37565b6111126080830185611076565b61111f60a08301846110bc565b979650505050505050565b5f8115159050919050565b61113e8161112a565b82525050565b61114d81610dc0565b82525050565b5f60a0820190506111665f830188610e37565b6111736020830187611135565b6111806040830186611144565b61118d6060830185610e37565b61119a6080830184611135565b9695505050505050565b5f6111ae82610d36565b9050919050565b6111be816111a4565b82525050565b5f6020820190506111d75f8301846111b5565b92915050565b5f6111e782610d36565b9050919050565b6111f7816111dd565b82525050565b5f6020820190506112105f8301846111ee565b92915050565b5f6040820190506112295f830185610e37565b6112366020830184611144565b9392505050565b5f8151905061124b81610d96565b92915050565b5f6020828403121561126657611265610d89565b5b5f6112738482850161123d565b91505092915050565b5f5ffd5b5f601f19601f8301169050919050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b6112c682611280565b810181811067ffffffffffffffff821117156112e5576112e4611290565b5b80604052505050565b5f6112f7610d80565b905061130382826112bd565b919050565b61131181610e99565b811461131b575f5ffd5b50565b5f8151905061132c81611308565b92915050565b5f8151905061134081610f84565b92915050565b5f6060828403121561135b5761135a61127c565b5b61136560606112ee565b90505f6113748482850161123d565b5f8301525060206113878482850161131e565b602083015250604061139b84828501611332565b60408301525092915050565b5f5f608083850312156113bd576113bc610d89565b5b5f6113ca85828601611346565b92505060606113db85828601611332565b9150509250929050565b5f819050919050565b6113f7816113e5565b8114611401575f5ffd5b50565b5f81519050611412816113ee565b92915050565b5f6020828403121561142d5761142c610d89565b5b5f61143a84828501611404565b91505092915050565b61144c816113e5565b82525050565b5f6040820190506114655f830185611443565b6114726020830184610f15565b9392505050565b6114828161112a565b811461148c575f5ffd5b50565b5f8151905061149d81611479565b92915050565b5f602082840312156114b8576114b7610d89565b5b5f6114c58482850161148f565b91505092915050565b5f82825260208201905092915050565b7f436f6e73756d6572476174657761793a206d697373696e6720726f6c650000005f82015250565b5f611512601d836114ce565b915061151d826114de565b602082019050919050565b5f6020820190508181035f83015261153f81611506565b9050919050565b60038110611552575f5ffd5b50565b5f8151905061156381611546565b92915050565b60038110611575575f5ffd5b50565b5f8151905061158681611569565b92915050565b5f5f5f5f5f5f60c087890312156115a6576115a5610d89565b5b5f6115b389828a0161123d565b96505060206115c489828a0161123d565b95505060406115d589828a0161123d565b94505060606115e689828a0161123d565b93505060806115f789828a01611555565b92505060a061160889828a01611578565b9150509295509295509295565b5f8151905061162381610dcf565b92915050565b5f5f5f5f5f60a0868803121561164257611641610d89565b5b5f61164f8882890161123d565b95505060206116608882890161148f565b945050604061167188828901611615565b93505060606116828882890161123d565b92505060806116938882890161148f565b915050929550929590935056fea26469706673582212207d15ae73387edcb9f23abc987277bcfc91ac59c9e472ee2998bc56feeef0478564736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_GETBATCHDATA = "getBatchData";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_GETQUALITYDATA = "getQualityData";

    public static final String FUNC_GETTOKENDATA = "getTokenData";

    public static final String FUNC_HONEYTOKEN = "honeyToken";

    public static final String FUNC_PRICINGMODEL = "pricingModel";

    public static final String FUNC_QUALITYINDEX = "qualityIndex";

    public static final String FUNC_SETHONEYTOKEN = "setHoneyToken";

    public static final String FUNC_SETPRICINGMODEL = "setPricingModel";

    public static final String FUNC_SETQUALITYINDEX = "setQualityIndex";

    public static final String FUNC_SETSUPPLYCHAIN = "setSupplyChain";

    public static final String FUNC_SUPPLYCHAIN = "supplyChain";

    @Deprecated
    protected ConsumerGateway(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ConsumerGateway(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ConsumerGateway(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ConsumerGateway(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<Batch, String>> getBatchData(BigInteger batchId) {
        final Function function = new Function(FUNC_GETBATCHDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Batch>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple2<Batch, String>>(function,
                new Callable<Tuple2<Batch, String>>() {
                    @Override
                    public Tuple2<Batch, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<Batch, String>(
                                (Batch) results.get(0), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getPrice(BigInteger batchId, BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_GETPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>> getQualityData(
            BigInteger batchId) {
        final Function function = new Function(FUNC_GETQUALITYDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> call(
                            ) throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>> getTokenData(
            BigInteger tokenId) {
        final Function function = new Function(FUNC_GETTOKENDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}, new TypeReference<Uint32>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>>(function,
                new Callable<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>>() {
                    @Override
                    public Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean> call()
                            throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (Boolean) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> honeyToken() {
        final Function function = new Function(FUNC_HONEYTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> pricingModel() {
        final Function function = new Function(FUNC_PRICINGMODEL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> qualityIndex() {
        final Function function = new Function(FUNC_QUALITYINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setHoneyToken(String honeyTokenAddress) {
        final Function function = new Function(
                FUNC_SETHONEYTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, honeyTokenAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setPricingModel(String pricingModelAddress) {
        final Function function = new Function(
                FUNC_SETPRICINGMODEL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pricingModelAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setQualityIndex(String qualityIndexAddress) {
        final Function function = new Function(
                FUNC_SETQUALITYINDEX, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setSupplyChain(String supplyChainAddress) {
        final Function function = new Function(
                FUNC_SETSUPPLYCHAIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, supplyChainAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> supplyChain() {
        final Function function = new Function(FUNC_SUPPLYCHAIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static ConsumerGateway load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new ConsumerGateway(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ConsumerGateway load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ConsumerGateway(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ConsumerGateway load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new ConsumerGateway(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ConsumerGateway load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ConsumerGateway(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ConsumerGateway> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String supplyChainAddress, String honeyTokenAddress, String qualityIndexAddress,
            String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ConsumerGateway.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<ConsumerGateway> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider,
            String actorRegistryAddress, String supplyChainAddress, String honeyTokenAddress,
            String qualityIndexAddress, String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ConsumerGateway.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<ConsumerGateway> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String supplyChainAddress, String honeyTokenAddress, String qualityIndexAddress,
            String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ConsumerGateway.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<ConsumerGateway> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            String actorRegistryAddress, String supplyChainAddress, String honeyTokenAddress,
            String qualityIndexAddress, String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ConsumerGateway.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

    public static class Batch extends StaticStruct {
        public BigInteger quantity;

        public BigInteger harvestYear;

        public String beekeeper;

        public Batch(BigInteger quantity, BigInteger harvestYear, String beekeeper) {
            super(new org.web3j.abi.datatypes.generated.Uint256(quantity), 
                    new org.web3j.abi.datatypes.generated.Uint16(harvestYear), 
                    new org.web3j.abi.datatypes.Address(160, beekeeper));
            this.quantity = quantity;
            this.harvestYear = harvestYear;
            this.beekeeper = beekeeper;
        }

        public Batch(Uint256 quantity, Uint16 harvestYear, Address beekeeper) {
            super(quantity, harvestYear, beekeeper);
            this.quantity = quantity.getValue();
            this.harvestYear = harvestYear.getValue();
            this.beekeeper = beekeeper.getValue();
        }
    }
}

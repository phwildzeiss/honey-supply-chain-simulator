package h.burgenland.simulator.web3.generated;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.CustomError;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
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
public class ActorRegistry extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b506100225f5f1b3361002860201b60201c565b50610187565b5f610039838361011d60201b60201c565b6101135760015f5f8581526020019081526020015f205f015f8473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f6101000a81548160ff0219169083151502179055506100b061018060201b60201c565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16847f2f8788117e7eff1d82e926ec794901d17c78024a50270940304540a733656f0d60405160405180910390a460019050610117565b5f90505b92915050565b5f5f5f8481526020019081526020015f205f015f8373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f9054906101000a900460ff16905092915050565b5f33905090565b6115f9806101945f395ff3fe608060405234801561000f575f5ffd5b506004361061011f575f3560e01c8063651e65b5116100ab578063abaa79391161006f578063abaa79391461031c578063bd3070c614610338578063c602d3fb14610356578063d547741f14610374578063eaa66a3c146103905761011f565b8063651e65b5146102745780638c64f57c1461029257806391d14854146102b0578063a217fddf146102e0578063a22d9255146102fe5761011f565b80632f2ff15d116100f25780632f2ff15d146101d257806336568abe146101ee5780634138d1671461020a5780634af913c91461023a57806357b4a876146102585761011f565b806301ffc9a7146101235780632115e7bf14610153578063236e092914610171578063248a9ca3146101a2575b5f5ffd5b61013d60048036038101906101389190610de1565b6103c1565b60405161014a9190610e26565b60405180910390f35b61015b61043a565b6040516101689190610e57565b60405180910390f35b61018b60048036038101906101869190610eca565b61045e565b604051610199929190610f81565b60405180910390f35b6101bc60048036038101906101b79190610fd9565b610511565b6040516101c99190610e57565b60405180910390f35b6101ec60048036038101906101e79190611004565b61052d565b005b61020860048036038101906102039190611004565b61054f565b005b610224600480360381019061021f9190610eca565b6105ca565b60405161023191906110d3565b60405180910390f35b6102426106ca565b60405161024f9190610e57565b60405180910390f35b610272600480360381019061026d9190611154565b6106ee565b005b61027c6107ce565b6040516102899190610e57565b60405180910390f35b61029a6107f2565b6040516102a79190610e57565b60405180910390f35b6102ca60048036038101906102c59190611004565b610816565b6040516102d79190610e26565b60405180910390f35b6102e8610879565b6040516102f59190610e57565b60405180910390f35b61030661087f565b6040516103139190610e57565b60405180910390f35b610336600480360381019061033191906111db565b6108a3565b005b6103406109a6565b60405161034d9190610e57565b60405180910390f35b61035e6109ca565b60405161036b9190610e57565b60405180910390f35b61038e60048036038101906103899190611004565b6109ee565b005b6103aa60048036038101906103a59190610eca565b610a10565b6040516103b892919061124c565b60405180910390f35b5f7f7965db0b000000000000000000000000000000000000000000000000000000007bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161480610433575061043282610ac2565b5b9050919050565b7f2a5f906c256a5d799494fcd066e1f6c077689de1cdb65052a1624de4bace99bf81565b6002602052805f5260405f205f91509050805f01805461047d906112a7565b80601f01602080910402602001604051908101604052809291908181526020018280546104a9906112a7565b80156104f45780601f106104cb576101008083540402835291602001916104f4565b820191905f5260205f20905b8154815290600101906020018083116104d757829003601f168201915b505050505090806001015f9054906101000a900461ffff16905082565b5f5f5f8381526020019081526020015f20600101549050919050565b61053682610511565b61053f81610b2b565b6105498383610b3f565b50505050565b610557610c28565b73ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff16146105bb576040517f6697b23200000000000000000000000000000000000000000000000000000000815260040160405180910390fd5b6105c58282610c2f565b505050565b6105d2610d69565b60015f8373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f206040518060400160405290815f82018054610629906112a7565b80601f0160208091040260200160405190810160405280929190818152602001828054610655906112a7565b80156106a05780601f10610677576101008083540402835291602001916106a0565b820191905f5260205f20905b81548152906001019060200180831161068357829003601f168201915b50505050508152602001600182015f9054906101000a900460ff1615151515815250509050919050565b7fb68a8381357ac987e0437efa112045a4b11b000847036dedb78e94b380456f3681565b5f5f1b6106fa81610b2b565b604051806040016040528084848080601f0160208091040260200160405190810160405280939291908181526020018383808284375f81840152601f19601f8201169050808301925050505050505081526020016001151581525060015f8673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f820151815f0190816107a591906114be565b506020820151816001015f6101000a81548160ff02191690831515021790555090505050505050565b7fd504ad34af20c88cc25749db9f004eb142411611de57205807393caa07db90d181565b7fd46c4e9aa6e966e36e1e5909588dbab2f671210ca4613e63fffcfcdfe2811d7181565b5f5f5f8481526020019081526020015f205f015f8373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f9054906101000a900460ff16905092915050565b5f5f1b81565b7f2de3edc056fca4682a7d2a0a2d4d1642bb8c612d1ec41c57b521fabe9a9e136c81565b7f2de3edc056fca4682a7d2a0a2d4d1642bb8c612d1ec41c57b521fabe9a9e136c6108cd81610b2b565b604051806040016040528085858080601f0160208091040260200160405190810160405280939291908181526020018383808284375f81840152601f19601f8201169050808301925050505050505081526020018361ffff1681525060025f8773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f820151815f01908161097991906114be565b506020820151816001015f6101000a81548161ffff021916908361ffff1602179055509050505050505050565b7f373fdac787be5578b9a3d4a9ca3e3ae1e632ab5ee4750e92f65223238a15b2ef81565b7fded9b5e0e0e3a2b3f09a0bc36ec64b9bf7a7c2319f3c4d9cff5ce48714257b2181565b6109f782610511565b610a0081610b2b565b610a0a8383610c2f565b50505050565b6001602052805f5260405f205f91509050805f018054610a2f906112a7565b80601f0160208091040260200160405190810160405280929190818152602001828054610a5b906112a7565b8015610aa65780601f10610a7d57610100808354040283529160200191610aa6565b820191905f5260205f20905b815481529060010190602001808311610a8957829003601f168201915b505050505090806001015f9054906101000a900460ff16905082565b5f7f01ffc9a7000000000000000000000000000000000000000000000000000000007bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916149050919050565b610b3c81610b37610c28565b610d18565b50565b5f610b4a8383610816565b610c1e5760015f5f8581526020019081526020015f205f015f8473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f6101000a81548160ff021916908315150217905550610bbb610c28565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16847f2f8788117e7eff1d82e926ec794901d17c78024a50270940304540a733656f0d60405160405180910390a460019050610c22565b5f90505b92915050565b5f33905090565b5f610c3a8383610816565b15610d0e575f5f5f8581526020019081526020015f205f015f8473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f6101000a81548160ff021916908315150217905550610cab610c28565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16847ff6391f5c32d9c69d2a47ea670b442974b53935d1edc7fd64eb21e047a839171b60405160405180910390a460019050610d12565b5f90505b92915050565b610d228282610816565b610d655780826040517fe2517d3f000000000000000000000000000000000000000000000000000000008152600401610d5c92919061159c565b60405180910390fd5b5050565b6040518060400160405280606081526020015f151581525090565b5f5ffd5b5f5ffd5b5f7fffffffff0000000000000000000000000000000000000000000000000000000082169050919050565b610dc081610d8c565b8114610dca575f5ffd5b50565b5f81359050610ddb81610db7565b92915050565b5f60208284031215610df657610df5610d84565b5b5f610e0384828501610dcd565b91505092915050565b5f8115159050919050565b610e2081610e0c565b82525050565b5f602082019050610e395f830184610e17565b92915050565b5f819050919050565b610e5181610e3f565b82525050565b5f602082019050610e6a5f830184610e48565b92915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f610e9982610e70565b9050919050565b610ea981610e8f565b8114610eb3575f5ffd5b50565b5f81359050610ec481610ea0565b92915050565b5f60208284031215610edf57610ede610d84565b5b5f610eec84828501610eb6565b91505092915050565b5f81519050919050565b5f82825260208201905092915050565b8281835e5f83830152505050565b5f601f19601f8301169050919050565b5f610f3782610ef5565b610f418185610eff565b9350610f51818560208601610f0f565b610f5a81610f1d565b840191505092915050565b5f61ffff82169050919050565b610f7b81610f65565b82525050565b5f6040820190508181035f830152610f998185610f2d565b9050610fa86020830184610f72565b9392505050565b610fb881610e3f565b8114610fc2575f5ffd5b50565b5f81359050610fd381610faf565b92915050565b5f60208284031215610fee57610fed610d84565b5b5f610ffb84828501610fc5565b91505092915050565b5f5f6040838503121561101a57611019610d84565b5b5f61102785828601610fc5565b925050602061103885828601610eb6565b9150509250929050565b5f82825260208201905092915050565b5f61105c82610ef5565b6110668185611042565b9350611076818560208601610f0f565b61107f81610f1d565b840191505092915050565b61109381610e0c565b82525050565b5f604083015f8301518482035f8601526110b38282611052565b91505060208301516110c8602086018261108a565b508091505092915050565b5f6020820190508181035f8301526110eb8184611099565b905092915050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f840112611114576111136110f3565b5b8235905067ffffffffffffffff811115611131576111306110f7565b5b60208301915083600182028301111561114d5761114c6110fb565b5b9250929050565b5f5f5f6040848603121561116b5761116a610d84565b5b5f61117886828701610eb6565b935050602084013567ffffffffffffffff81111561119957611198610d88565b5b6111a5868287016110ff565b92509250509250925092565b6111ba81610f65565b81146111c4575f5ffd5b50565b5f813590506111d5816111b1565b92915050565b5f5f5f5f606085870312156111f3576111f2610d84565b5b5f61120087828801610eb6565b945050602085013567ffffffffffffffff81111561122157611220610d88565b5b61122d878288016110ff565b93509350506040611240878288016111c7565b91505092959194509250565b5f6040820190508181035f8301526112648185610f2d565b90506112736020830184610e17565b9392505050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602260045260245ffd5b5f60028204905060018216806112be57607f821691505b6020821081036112d1576112d061127a565b5b50919050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b5f819050815f5260205f209050919050565b5f6020601f8301049050919050565b5f82821b905092915050565b5f600883026113607fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82611325565b61136a8683611325565b95508019841693508086168417925050509392505050565b5f819050919050565b5f819050919050565b5f6113ae6113a96113a484611382565b61138b565b611382565b9050919050565b5f819050919050565b6113c783611394565b6113db6113d3826113b5565b848454611331565b825550505050565b5f5f905090565b6113f26113e3565b6113fd8184846113be565b505050565b5f5b82811015611423576114185f8284016113ea565b600181019050611404565b505050565b601f82111561147657828211156114755761144281611304565b61144b83611316565b61145485611316565b6020861015611461575f90505b80830161147082840382611402565b505050505b5b505050565b5f82821c905092915050565b5f6114965f198460080261147b565b1980831691505092915050565b5f6114ae8383611487565b9150826002028217905092915050565b6114c782610ef5565b67ffffffffffffffff8111156114e0576114df6112d7565b5b6114ea82546112a7565b6114f5828285611428565b5f60209050601f831160018114611526575f8415611514578287015190505b61151e85826114a3565b865550611585565b601f19841661153486611304565b5f5b8281101561155b57848901518255600182019150602085019450602081019050611536565b868310156115785784890151611574601f891682611487565b8355505b6001600288020188555050505b505050505050565b61159681610e8f565b82525050565b5f6040820190506115af5f83018561158d565b6115bc6020830184610e48565b939250505056fea26469706673582212205786ccf54ab244cea4b0cde1a9c66c721d3abce53303539db74bbff9f3fcc82f64736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_AWARD_BODY_ROLE = "AWARD_BODY_ROLE";

    public static final String FUNC_BEEKEEPER_ROLE = "BEEKEEPER_ROLE";

    public static final String FUNC_BOTTLER_ROLE = "BOTTLER_ROLE";

    public static final String FUNC_CERTIFICATION_BODY_ROLE = "CERTIFICATION_BODY_ROLE";

    public static final String FUNC_DEFAULT_ADMIN_ROLE = "DEFAULT_ADMIN_ROLE";

    public static final String FUNC_LAB_ROLE = "LAB_ROLE";

    public static final String FUNC_LOGISTICS_ROLE = "LOGISTICS_ROLE";

    public static final String FUNC_RETAILER_ROLE = "RETAILER_ROLE";

    public static final String FUNC_ACTORS = "actors";

    public static final String FUNC_CERTIFICATIONS = "certifications";

    public static final String FUNC_GETACTOR = "getActor";

    public static final String FUNC_GETROLEADMIN = "getRoleAdmin";

    public static final String FUNC_GRANTROLE = "grantRole";

    public static final String FUNC_HASROLE = "hasRole";

    public static final String FUNC_REGISTERACTOR = "registerActor";

    public static final String FUNC_RENOUNCEROLE = "renounceRole";

    public static final String FUNC_REVOKEROLE = "revokeRole";

    public static final String FUNC_SETCERTIFICATION = "setCertification";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    public static final CustomError ACCESSCONTROLBADCONFIRMATION_ERROR = new CustomError("AccessControlBadConfirmation", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final CustomError ACCESSCONTROLUNAUTHORIZEDACCOUNT_ERROR = new CustomError("AccessControlUnauthorizedAccount", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event ROLEADMINCHANGED_EVENT = new Event("RoleAdminChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>(true) {}));
    ;

    public static final Event ROLEGRANTED_EVENT = new Event("RoleGranted", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event ROLEREVOKED_EVENT = new Event("RoleRevoked", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    @Deprecated
    protected ActorRegistry(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ActorRegistry(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ActorRegistry(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ActorRegistry(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<RoleAdminChangedEventResponse> getRoleAdminChangedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ROLEADMINCHANGED_EVENT, transactionReceipt);
        ArrayList<RoleAdminChangedEventResponse> responses = new ArrayList<RoleAdminChangedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RoleAdminChangedEventResponse typedResponse = new RoleAdminChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.previousAdminRole = (byte[]) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.newAdminRole = (byte[]) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static RoleAdminChangedEventResponse getRoleAdminChangedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ROLEADMINCHANGED_EVENT, log);
        RoleAdminChangedEventResponse typedResponse = new RoleAdminChangedEventResponse();
        typedResponse.log = log;
        typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.previousAdminRole = (byte[]) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.newAdminRole = (byte[]) eventValues.getIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<RoleAdminChangedEventResponse> roleAdminChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getRoleAdminChangedEventFromLog(log));
    }

    public Flowable<RoleAdminChangedEventResponse> roleAdminChangedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ROLEADMINCHANGED_EVENT));
        return roleAdminChangedEventFlowable(filter);
    }

    public static List<RoleGrantedEventResponse> getRoleGrantedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ROLEGRANTED_EVENT, transactionReceipt);
        ArrayList<RoleGrantedEventResponse> responses = new ArrayList<RoleGrantedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RoleGrantedEventResponse typedResponse = new RoleGrantedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static RoleGrantedEventResponse getRoleGrantedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ROLEGRANTED_EVENT, log);
        RoleGrantedEventResponse typedResponse = new RoleGrantedEventResponse();
        typedResponse.log = log;
        typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<RoleGrantedEventResponse> roleGrantedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getRoleGrantedEventFromLog(log));
    }

    public Flowable<RoleGrantedEventResponse> roleGrantedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ROLEGRANTED_EVENT));
        return roleGrantedEventFlowable(filter);
    }

    public static List<RoleRevokedEventResponse> getRoleRevokedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ROLEREVOKED_EVENT, transactionReceipt);
        ArrayList<RoleRevokedEventResponse> responses = new ArrayList<RoleRevokedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RoleRevokedEventResponse typedResponse = new RoleRevokedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static RoleRevokedEventResponse getRoleRevokedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ROLEREVOKED_EVENT, log);
        RoleRevokedEventResponse typedResponse = new RoleRevokedEventResponse();
        typedResponse.log = log;
        typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<RoleRevokedEventResponse> roleRevokedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getRoleRevokedEventFromLog(log));
    }

    public Flowable<RoleRevokedEventResponse> roleRevokedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ROLEREVOKED_EVENT));
        return roleRevokedEventFlowable(filter);
    }

    public RemoteFunctionCall<byte[]> AWARD_BODY_ROLE() {
        final Function function = new Function(FUNC_AWARD_BODY_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> BEEKEEPER_ROLE() {
        final Function function = new Function(FUNC_BEEKEEPER_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> BOTTLER_ROLE() {
        final Function function = new Function(FUNC_BOTTLER_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> CERTIFICATION_BODY_ROLE() {
        final Function function = new Function(FUNC_CERTIFICATION_BODY_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> DEFAULT_ADMIN_ROLE() {
        final Function function = new Function(FUNC_DEFAULT_ADMIN_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> LAB_ROLE() {
        final Function function = new Function(FUNC_LAB_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> LOGISTICS_ROLE() {
        final Function function = new Function(FUNC_LOGISTICS_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> RETAILER_ROLE() {
        final Function function = new Function(FUNC_RETAILER_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<Tuple2<String, Boolean>> actors(String param0) {
        final Function function = new Function(FUNC_ACTORS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple2<String, Boolean>>(function,
                new Callable<Tuple2<String, Boolean>>() {
                    @Override
                    public Tuple2<String, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, Boolean>(
                                (String) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple2<String, BigInteger>> certifications(String param0) {
        final Function function = new Function(FUNC_CERTIFICATIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint16>() {}));
        return new RemoteFunctionCall<Tuple2<String, BigInteger>>(function,
                new Callable<Tuple2<String, BigInteger>>() {
                    @Override
                    public Tuple2<String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Actor> getActor(String actorAddress) {
        final Function function = new Function(FUNC_GETACTOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Actor>() {}));
        return executeRemoteCallSingleValueReturn(function, Actor.class);
    }

    public RemoteFunctionCall<byte[]> getRoleAdmin(byte[] role) {
        final Function function = new Function(FUNC_GETROLEADMIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<TransactionReceipt> grantRole(byte[] role, String account) {
        final Function function = new Function(
                FUNC_GRANTROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, account)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> hasRole(byte[] role, String account) {
        final Function function = new Function(FUNC_HASROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, account)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> registerActor(String actorAddress, String name) {
        final Function function = new Function(
                FUNC_REGISTERACTOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorAddress), 
                new org.web3j.abi.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> renounceRole(byte[] role,
            String callerConfirmation) {
        final Function function = new Function(
                FUNC_RENOUNCEROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, callerConfirmation)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> revokeRole(byte[] role, String account) {
        final Function function = new Function(
                FUNC_REVOKEROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, account)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setCertification(String actorAddress,
            String ipfsCid, BigInteger organicScore) {
        final Function function = new Function(
                FUNC_SETCERTIFICATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorAddress), 
                new org.web3j.abi.datatypes.Utf8String(ipfsCid), 
                new org.web3j.abi.datatypes.generated.Uint16(organicScore)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> supportsInterface(byte[] interfaceId) {
        final Function function = new Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes4(interfaceId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static ActorRegistry load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new ActorRegistry(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ActorRegistry load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ActorRegistry(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ActorRegistry load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new ActorRegistry(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ActorRegistry load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ActorRegistry(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ActorRegistry> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ActorRegistry.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), "");
    }

    public static RemoteCall<ActorRegistry> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ActorRegistry.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<ActorRegistry> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ActorRegistry.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<ActorRegistry> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ActorRegistry.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), "");
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

    public static class Actor extends DynamicStruct {
        public String name;

        public Boolean registered;

        public Actor(String name, Boolean registered) {
            super(new org.web3j.abi.datatypes.Utf8String(name), 
                    new org.web3j.abi.datatypes.Bool(registered));
            this.name = name;
            this.registered = registered;
        }

        public Actor(Utf8String name, Bool registered) {
            super(name, registered);
            this.name = name.getValue();
            this.registered = registered.getValue();
        }
    }

    public static class RoleAdminChangedEventResponse extends BaseEventResponse {
        public byte[] role;

        public byte[] previousAdminRole;

        public byte[] newAdminRole;
    }

    public static class RoleGrantedEventResponse extends BaseEventResponse {
        public byte[] role;

        public String account;

        public String sender;
    }

    public static class RoleRevokedEventResponse extends BaseEventResponse {
        public byte[] role;

        public String account;

        public String sender;
    }
}

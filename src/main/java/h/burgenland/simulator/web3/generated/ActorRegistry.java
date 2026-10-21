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
import org.web3j.abi.datatypes.DynamicArray;
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
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b506100225f5f1b3361002860201b60201c565b50610187565b5f610039838361011d60201b60201c565b6101135760015f5f8581526020019081526020015f205f015f8473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f6101000a81548160ff0219169083151502179055506100b061018060201b60201c565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16847f2f8788117e7eff1d82e926ec794901d17c78024a50270940304540a733656f0d60405160405180910390a460019050610117565b5f90505b92915050565b5f5f5f8481526020019081526020015f205f015f8373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f9054906101000a900460ff16905092915050565b5f33905090565b611b35806101945f395ff3fe608060405234801561000f575f5ffd5b506004361061012a575f3560e01c8063651e65b5116100ab578063abaa79391161006f578063abaa793914610346578063bd3070c614610362578063c602d3fb14610380578063d547741f1461039e578063eaa66a3c146103ba5761012a565b8063651e65b51461029e5780638c64f57c146102bc57806391d14854146102da578063a217fddf1461030a578063a22d9255146103285761012a565b80632f2ff15d116100f25780632f2ff15d146101fc57806336568abe146102185780634138d167146102345780634af913c91461026457806357b4a876146102825761012a565b806301ffc9a71461012e5780631d010ed51461015e5780632115e7bf1461017d578063236e09291461019b578063248a9ca3146101cc575b5f5ffd5b6101486004803603810190610143919061110f565b6103eb565b6040516101559190611154565b60405180910390f35b610166610464565b6040516101749291906113c8565b60405180910390f35b6101856106b6565b6040516101929190611415565b60405180910390f35b6101b560048036038101906101b09190611458565b6106da565b6040516101c39291906114e7565b60405180910390f35b6101e660048036038101906101e1919061153f565b61078d565b6040516101f39190611415565b60405180910390f35b6102166004803603810190610211919061156a565b6107a9565b005b610232600480360381019061022d919061156a565b6107cb565b005b61024e60048036038101906102499190611458565b610846565b60405161025b91906115e2565b60405180910390f35b61026c610946565b6040516102799190611415565b60405180910390f35b61029c60048036038101906102979190611663565b61096a565b005b6102a6610afc565b6040516102b39190611415565b60405180910390f35b6102c4610b20565b6040516102d19190611415565b60405180910390f35b6102f460048036038101906102ef919061156a565b610b44565b6040516103019190611154565b60405180910390f35b610312610ba7565b60405161031f9190611415565b60405180910390f35b610330610bad565b60405161033d9190611415565b60405180910390f35b610360600480360381019061035b91906116ea565b610bd1565b005b61036a610cd4565b6040516103779190611415565b60405180910390f35b610388610cf8565b6040516103959190611415565b60405180910390f35b6103b860048036038101906103b3919061156a565b610d1c565b005b6103d460048036038101906103cf9190611458565b610d3e565b6040516103e292919061175b565b60405180910390f35b5f7f7965db0b000000000000000000000000000000000000000000000000000000007bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916148061045d575061045c82610df0565b5b9050919050565b60608060038054806020026020016040519081016040528092919081815260200182805480156104e657602002820191905f5260205f20905b815f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001906001019080831161049d575b5050505050915060038054905067ffffffffffffffff81111561050c5761050b611789565b5b60405190808252806020026020018201604052801561054557816020015b610532611097565b81526020019060019003908161052a5790505b5090505f5f90505b6003805490508110156106b15760015f60038381548110610571576105706117b6565b5b905f5260205f20015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f206040518060400160405290815f820180546105ec90611810565b80601f016020809104026020016040519081016040528092919081815260200182805461061890611810565b80156106635780601f1061063a57610100808354040283529160200191610663565b820191905f5260205f20905b81548152906001019060200180831161064657829003601f168201915b50505050508152602001600182015f9054906101000a900460ff161515151581525050828281518110610699576106986117b6565b5b6020026020010181905250808060010191505061054d565b509091565b7f2a5f906c256a5d799494fcd066e1f6c077689de1cdb65052a1624de4bace99bf81565b6002602052805f5260405f205f91509050805f0180546106f990611810565b80601f016020809104026020016040519081016040528092919081815260200182805461072590611810565b80156107705780601f1061074757610100808354040283529160200191610770565b820191905f5260205f20905b81548152906001019060200180831161075357829003601f168201915b505050505090806001015f9054906101000a900461ffff16905082565b5f5f5f8381526020019081526020015f20600101549050919050565b6107b28261078d565b6107bb81610e59565b6107c58383610e6d565b50505050565b6107d3610f56565b73ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff1614610837576040517f6697b23200000000000000000000000000000000000000000000000000000000815260040160405180910390fd5b6108418282610f5d565b505050565b61084e611097565b60015f8373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f206040518060400160405290815f820180546108a590611810565b80601f01602080910402602001604051908101604052809291908181526020018280546108d190611810565b801561091c5780601f106108f35761010080835404028352916020019161091c565b820191905f5260205f20905b8154815290600101906020018083116108ff57829003601f168201915b50505050508152602001600182015f9054906101000a900460ff1615151515815250509050919050565b7fb68a8381357ac987e0437efa112045a4b11b000847036dedb78e94b380456f3681565b5f5f1b61097681610e59565b60015f8573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f206001015f9054906101000a900460ff16610a2857600384908060018154018082558091505060019003905f5260205f20015f9091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b604051806040016040528084848080601f0160208091040260200160405190810160405280939291908181526020018383808284375f81840152601f19601f8201169050808301925050505050505081526020016001151581525060015f8673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f820151815f019081610ad391906119fa565b506020820151816001015f6101000a81548160ff02191690831515021790555090505050505050565b7fd504ad34af20c88cc25749db9f004eb142411611de57205807393caa07db90d181565b7fd46c4e9aa6e966e36e1e5909588dbab2f671210ca4613e63fffcfcdfe2811d7181565b5f5f5f8481526020019081526020015f205f015f8373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f9054906101000a900460ff16905092915050565b5f5f1b81565b7f2de3edc056fca4682a7d2a0a2d4d1642bb8c612d1ec41c57b521fabe9a9e136c81565b7f2de3edc056fca4682a7d2a0a2d4d1642bb8c612d1ec41c57b521fabe9a9e136c610bfb81610e59565b604051806040016040528085858080601f0160208091040260200160405190810160405280939291908181526020018383808284375f81840152601f19601f8201169050808301925050505050505081526020018361ffff1681525060025f8773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f820151815f019081610ca791906119fa565b506020820151816001015f6101000a81548161ffff021916908361ffff1602179055509050505050505050565b7f373fdac787be5578b9a3d4a9ca3e3ae1e632ab5ee4750e92f65223238a15b2ef81565b7fded9b5e0e0e3a2b3f09a0bc36ec64b9bf7a7c2319f3c4d9cff5ce48714257b2181565b610d258261078d565b610d2e81610e59565b610d388383610f5d565b50505050565b6001602052805f5260405f205f91509050805f018054610d5d90611810565b80601f0160208091040260200160405190810160405280929190818152602001828054610d8990611810565b8015610dd45780601f10610dab57610100808354040283529160200191610dd4565b820191905f5260205f20905b815481529060010190602001808311610db757829003601f168201915b505050505090806001015f9054906101000a900460ff16905082565b5f7f01ffc9a7000000000000000000000000000000000000000000000000000000007bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916149050919050565b610e6a81610e65610f56565b611046565b50565b5f610e788383610b44565b610f4c5760015f5f8581526020019081526020015f205f015f8473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f6101000a81548160ff021916908315150217905550610ee9610f56565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16847f2f8788117e7eff1d82e926ec794901d17c78024a50270940304540a733656f0d60405160405180910390a460019050610f50565b5f90505b92915050565b5f33905090565b5f610f688383610b44565b1561103c575f5f5f8581526020019081526020015f205f015f8473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020015f205f6101000a81548160ff021916908315150217905550610fd9610f56565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16847ff6391f5c32d9c69d2a47ea670b442974b53935d1edc7fd64eb21e047a839171b60405160405180910390a460019050611040565b5f90505b92915050565b6110508282610b44565b6110935780826040517fe2517d3f00000000000000000000000000000000000000000000000000000000815260040161108a929190611ad8565b60405180910390fd5b5050565b6040518060400160405280606081526020015f151581525090565b5f5ffd5b5f5ffd5b5f7fffffffff0000000000000000000000000000000000000000000000000000000082169050919050565b6110ee816110ba565b81146110f8575f5ffd5b50565b5f81359050611109816110e5565b92915050565b5f60208284031215611124576111236110b2565b5b5f611131848285016110fb565b91505092915050565b5f8115159050919050565b61114e8161113a565b82525050565b5f6020820190506111675f830184611145565b92915050565b5f81519050919050565b5f82825260208201905092915050565b5f819050602082019050919050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6111bf82611196565b9050919050565b6111cf816111b5565b82525050565b5f6111e083836111c6565b60208301905092915050565b5f602082019050919050565b5f6112028261116d565b61120c8185611177565b935061121783611187565b805f5b8381101561124757815161122e88826111d5565b9750611239836111ec565b92505060018101905061121a565b5085935050505092915050565b5f81519050919050565b5f82825260208201905092915050565b5f819050602082019050919050565b5f81519050919050565b5f82825260208201905092915050565b8281835e5f83830152505050565b5f601f19601f8301169050919050565b5f6112bf8261127d565b6112c98185611287565b93506112d9818560208601611297565b6112e2816112a5565b840191505092915050565b6112f68161113a565b82525050565b5f604083015f8301518482035f86015261131682826112b5565b915050602083015161132b60208601826112ed565b508091505092915050565b5f61134183836112fc565b905092915050565b5f602082019050919050565b5f61135f82611254565b611369818561125e565b93508360208202850161137b8561126e565b805f5b858110156113b657848403895281516113978582611336565b94506113a283611349565b925060208a0199505060018101905061137e565b50829750879550505050505092915050565b5f6040820190508181035f8301526113e081856111f8565b905081810360208301526113f48184611355565b90509392505050565b5f819050919050565b61140f816113fd565b82525050565b5f6020820190506114285f830184611406565b92915050565b611437816111b5565b8114611441575f5ffd5b50565b5f813590506114528161142e565b92915050565b5f6020828403121561146d5761146c6110b2565b5b5f61147a84828501611444565b91505092915050565b5f82825260208201905092915050565b5f61149d8261127d565b6114a78185611483565b93506114b7818560208601611297565b6114c0816112a5565b840191505092915050565b5f61ffff82169050919050565b6114e1816114cb565b82525050565b5f6040820190508181035f8301526114ff8185611493565b905061150e60208301846114d8565b9392505050565b61151e816113fd565b8114611528575f5ffd5b50565b5f8135905061153981611515565b92915050565b5f60208284031215611554576115536110b2565b5b5f6115618482850161152b565b91505092915050565b5f5f604083850312156115805761157f6110b2565b5b5f61158d8582860161152b565b925050602061159e85828601611444565b9150509250929050565b5f604083015f8301518482035f8601526115c282826112b5565b91505060208301516115d760208601826112ed565b508091505092915050565b5f6020820190508181035f8301526115fa81846115a8565b905092915050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f84011261162357611622611602565b5b8235905067ffffffffffffffff8111156116405761163f611606565b5b60208301915083600182028301111561165c5761165b61160a565b5b9250929050565b5f5f5f6040848603121561167a576116796110b2565b5b5f61168786828701611444565b935050602084013567ffffffffffffffff8111156116a8576116a76110b6565b5b6116b48682870161160e565b92509250509250925092565b6116c9816114cb565b81146116d3575f5ffd5b50565b5f813590506116e4816116c0565b92915050565b5f5f5f5f60608587031215611702576117016110b2565b5b5f61170f87828801611444565b945050602085013567ffffffffffffffff8111156117305761172f6110b6565b5b61173c8782880161160e565b9350935050604061174f878288016116d6565b91505092959194509250565b5f6040820190508181035f8301526117738185611493565b90506117826020830184611145565b9392505050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52603260045260245ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602260045260245ffd5b5f600282049050600182168061182757607f821691505b60208210810361183a576118396117e3565b5b50919050565b5f819050815f5260205f209050919050565b5f6020601f8301049050919050565b5f82821b905092915050565b5f6008830261189c7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82611861565b6118a68683611861565b95508019841693508086168417925050509392505050565b5f819050919050565b5f819050919050565b5f6118ea6118e56118e0846118be565b6118c7565b6118be565b9050919050565b5f819050919050565b611903836118d0565b61191761190f826118f1565b84845461186d565b825550505050565b5f5f905090565b61192e61191f565b6119398184846118fa565b505050565b5f5b8281101561195f576119545f828401611926565b600181019050611940565b505050565b601f8211156119b257828211156119b15761197e81611840565b61198783611852565b61199085611852565b602086101561199d575f90505b8083016119ac8284038261193e565b505050505b5b505050565b5f82821c905092915050565b5f6119d25f19846008026119b7565b1980831691505092915050565b5f6119ea83836119c3565b9150826002028217905092915050565b611a038261127d565b67ffffffffffffffff811115611a1c57611a1b611789565b5b611a268254611810565b611a31828285611964565b5f60209050601f831160018114611a62575f8415611a50578287015190505b611a5a85826119df565b865550611ac1565b601f198416611a7086611840565b5f5b82811015611a9757848901518255600182019150602085019450602081019050611a72565b86831015611ab45784890151611ab0601f8916826119c3565b8355505b6001600288020188555050505b505050505050565b611ad2816111b5565b82525050565b5f604082019050611aeb5f830185611ac9565b611af86020830184611406565b939250505056fea2646970667358221220cecd6ebd4bb88a90777c56cfda5127ba9f89a08eb14a07dca8055bed966b2de864736f6c63430008220033";

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

    public static final String FUNC_GETALLACTORS = "getAllActors";

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

    public RemoteFunctionCall<Tuple2<List<String>, List<Actor>>> getAllActors() {
        final Function function = new Function(FUNC_GETALLACTORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}, new TypeReference<DynamicArray<Actor>>() {}));
        return new RemoteFunctionCall<Tuple2<List<String>, List<Actor>>>(function,
                new Callable<Tuple2<List<String>, List<Actor>>>() {
                    @Override
                    public Tuple2<List<String>, List<Actor>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<List<String>, List<Actor>>(
                                convertToNative((List<Address>) results.get(0).getValue()), 
                                convertToNative((List<Actor>) results.get(1).getValue()));
                    }
                });
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

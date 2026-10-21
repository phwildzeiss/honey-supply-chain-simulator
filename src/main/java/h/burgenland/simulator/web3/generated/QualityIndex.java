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
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple4;
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
public class QualityIndex extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b50604051612a3d380380612a3d833981810160405281019061003191906100d4565b805f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550506100ff565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6100a38261007a565b9050919050565b6100b381610099565b81146100bd575f5ffd5b50565b5f815190506100ce816100aa565b92915050565b5f602082840312156100e9576100e8610076565b5b5f6100f6848285016100c0565b91505092915050565b6129318061010c5f395ff3fe608060405234801561000f575f5ffd5b5060043610610140575f3560e01c806386e5e4c2116100b6578063b9ca8d6c1161007a578063b9ca8d6c146103ed578063c9163e291461041d578063c996e19214610439578063d93e128714610455578063e2c0d3a714610485578063eae7b935146104a157610140565b806386e5e4c21461031e57806388d84b661461034e578063970ad8611461036c578063ad6d3137146103a1578063b20a5dbe146103bd57610140565b80634f09fed0116101085780634f09fed01461021057806365db8059146102415780636c4f3f6e1461025d57806372538b271461028d5780637b6592a0146102be578063808a12c5146102ee57610140565b8063088dbdf4146101445780631322cbb1146101775780631742108b146101a757806330256438146101d857806338140c71146101f4575b5f5ffd5b61015e60048036038101906101599190611a61565b6104bf565b60405161016e9493929190611aa8565b60405180910390f35b610191600480360381019061018c9190611a61565b61051f565b60405161019e9190611afa565b60405180910390f35b6101c160048036038101906101bc9190611a61565b610644565b6040516101cf929190611ba0565b60405180910390f35b6101f260048036038101906101ed9190611bf1565b6106b2565b005b61020e60048036038101906102099190611a61565b610919565b005b61022a60048036038101906102259190611c51565b610a67565b604051610238929190611c7c565b60405180910390f35b61025b60048036038101906102569190611d04565b610b94565b005b61027760048036038101906102729190611a61565b610e8e565b6040516102849190611afa565b60405180910390f35b6102a760048036038101906102a29190611a61565b610f1f565b6040516102b5929190611d88565b60405180910390f35b6102d860048036038101906102d39190611a61565b610f3f565b6040516102e59190611e1f565b60405180910390f35b61030860048036038101906103039190611a61565b610fda565b6040516103159190611e1f565b60405180910390f35b61033860048036038101906103339190611e5e565b611075565b6040516103459190611afa565b60405180910390f35b6103566111ef565b6040516103639190611ec9565b60405180910390f35b61038660048036038101906103819190611a61565b611214565b60405161039896959493929190611f28565b60405180910390f35b6103bb60048036038101906103b69190611fb1565b6112a6565b005b6103d760048036038101906103d29190611a61565b611450565b6040516103e49190611fdc565b60405180910390f35b61040760048036038101906104029190611a61565b61146d565b6040516104149190611ff5565b60405180910390f35b6104376004803603810190610432919061200e565b61148a565b005b610453600480360381019061044e919061204d565b611615565b005b61046f600480360381019061046a9190611a61565b6117a2565b60405161047c9190611e1f565b60405180910390f35b61049f600480360381019061049a91906120aa565b61183d565b005b6104a96119f9565b6040516104b69190612176565b60405180910390f35b6003602052805f5260405f205f91509050805f015f9054906101000a900461ffff1690805f0160029054906101000a900461ffff1690805f0160049054906101000a900461ffff1690805f0160069054906101000a900461ffff16905084565b5f5f60035f8481526020019081526020015f206040518060800160405290815f82015f9054906101000a900461ffff1661ffff1661ffff1681526020015f820160029054906101000a900461ffff1661ffff1661ffff1681526020015f820160049054906101000a900461ffff1661ffff1661ffff1681526020015f820160069054906101000a900461ffff1661ffff1661ffff168152505090506127106106ff826060015161ffff166105d391906121bc565b610652836040015161ffff166105e991906121bc565b61123c846020015161ffff166105ff91906121bc565b610784855f015161ffff1661061491906121bc565b61061e91906121fd565b61062891906121fd565b61063291906121fd565b61063c919061225d565b915050919050565b5f5f60055f8481526020019081526020015f205f9054906101000a900460ff16905060028081111561067957610678611b2d565b5b60045f8581526020019081526020015f205f9054906101000a900460ff1660028111156106a9576106a8611b2d565b5b14159150915091565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561071b573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061073f91906122c0565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161079a9291906122fa565b602060405180830381865afa1580156107b5573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107d9919061234b565b610818576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161080f906123c0565b60405180910390fd5b5f5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663236e0929336040518263ffffffff1660e01b81526004016108729190611ec9565b5f60405180830381865afa15801561088c573d5f5f3e3d5ffd5b505050506040513d5f823e3d601f19601f820116820180604052508101906108b4919061250c565b9150508260035f8681526020019081526020015f205f0160026101000a81548161ffff021916908361ffff1602179055508060035f8681526020019081526020015f205f0160046101000a81548161ffff021916908361ffff16021790555050505050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16146109a8576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161099f906125d6565b60405180910390fd5b6002808111156109bb576109ba611b2d565b5b60045f8381526020019081526020015f205f9054906101000a900460ff1660028111156109eb576109ea611b2d565b5b0315610a6457600260055f8381526020019081526020015f205f6101000a81548160ff02191690836002811115610a2557610a24611b2d565b5b0217905550600160045f8381526020019081526020015f205f6101000a81548160ff02191690836002811115610a5e57610a5d611b2d565b5b02179055505b50565b5f5f6108fc836060016020810190610a7f91906125f4565b61ffff161115610a95575f600191509150610b8f565b5f835f016020810190610aa891906125f4565b61ffff161480610acd57505f836020016020810190610ac791906125f4565b61ffff16145b80610aed57505f836040016020810190610ae791906125f4565b61ffff16145b15610afd575f5f91509150610b8f565b612710610d05846040016020810190610b1691906125f4565b61ffff16610b2491906121bc565b610d05856020016020810190610b3a91906125f4565b61ffff16610b4891906121bc565b610d05865f016020810190610b5d91906125f4565b61ffff16610b6b91906121bc565b610b7591906121fd565b610b7f91906121fd565b610b89919061225d565b91505f90505b915091565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663bd3070c66040518163ffffffff1660e01b8152600401602060405180830381865afa158015610bfd573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610c2191906122c0565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610c7c9291906122fa565b602060405180830381865afa158015610c97573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610cbb919061234b565b610cfa576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610cf1906123c0565b60405180910390fd5b5f5f610d0587610a67565b915091508160025f8a81526020019081526020015f20600101819055508560035f8a81526020019081526020015f205f015f6101000a81548161ffff021916908361ffff160217905550848460065f8b81526020019081526020015f209182610d6f92919061282e565b5060016002811115610d8457610d83611b2d565b5b816002811115610d9757610d96611b2d565b5b03610e1357600160055f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610dd057610dcf611b2d565b5b0217905550600260045f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610e0957610e08611b2d565b5b0217905550610e84565b5f60055f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610e4657610e45611b2d565b5b02179055505f60045f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610e7e57610e7d611b2d565b5b02179055505b5050505050505050565b5f5f60025f8481526020019081526020015f205f015490505f60025f8581526020019081526020015f206001015490505f610ec88561051f565b905061271061066284610edb91906121bc565b610b9a83610ee991906121bc565b61151485610ef791906121bc565b610f0191906121fd565b610f0b91906121fd565b610f15919061225d565b9350505050919050565b6002602052805f5260405f205f91509050805f0154908060010154905082565b6008602052805f5260405f205f915090508054610f5b90612656565b80601f0160208091040260200160405190810160405280929190818152602001828054610f8790612656565b8015610fd25780601f10610fa957610100808354040283529160200191610fd2565b820191905f5260205f20905b815481529060010190602001808311610fb557829003601f168201915b505050505081565b6006602052805f5260405f205f915090508054610ff690612656565b80601f016020809104026020016040519081016040528092919081815260200182805461102290612656565b801561106d5780601f106110445761010080835404028352916020019161106d565b820191905f5260205f20905b81548152906001019060200180831161105057829003601f168201915b505050505081565b5f6127106101008360e001602081019061108f91906125f4565b61ffff1661109d91906121bc565b61016c8460c00160208101906110b391906125f4565b61ffff166110c191906121bc565b61020e8560a00160208101906110d791906125f4565b61ffff166110e591906121bc565b6103158660800160208101906110fb91906125f4565b61ffff1661110991906121bc565b61046087606001602081019061111f91906125f4565b61ffff1661112d91906121bc565b6105d088604001602081019061114391906125f4565b61ffff1661115191906121bc565b6106b389602001602081019061116791906125f4565b61ffff1661117591906121bc565b610e9d8a5f01602081019061118a91906125f4565b61ffff1661119891906121bc565b6111a291906121fd565b6111ac91906121fd565b6111b691906121fd565b6111c091906121fd565b6111ca91906121fd565b6111d491906121fd565b6111de91906121fd565b6111e8919061225d565b9050919050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f5f5f5f5f60025f8881526020019081526020015f205f0154955060025f8881526020019081526020015f206001015494506112508761051f565b935061125b87610e8e565b925060045f8881526020019081526020015f205f9054906101000a900460ff16915060055f8881526020019081526020015f205f9054906101000a900460ff16905091939550919395565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561130f573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061133391906122c0565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161138e9291906122fa565b602060405180830381865afa1580156113a9573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906113cd919061234b565b61140c576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611403906123c0565b60405180910390fd5b8160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b6004602052805f5260405f205f915054906101000a900460ff1681565b6005602052805f5260405f205f915054906101000a900460ff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156114f3573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061151791906122c0565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016115729291906122fa565b602060405180830381865afa15801561158d573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906115b1919061234b565b6115f0576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016115e7906123c0565b60405180910390fd5b6115f982611075565b60025f8581526020019081526020015f205f0181905550505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561167e573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906116a291906122c0565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016116fd9291906122fa565b602060405180830381865afa158015611718573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061173c919061234b565b61177b576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611772906123c0565b60405180910390fd5b828260085f8781526020019081526020015f20918261179b92919061282e565b5050505050565b6007602052805f5260405f205f9150905080546117be90612656565b80601f01602080910402602001604051908101604052809291908181526020018280546117ea90612656565b80156118355780601f1061180c57610100808354040283529160200191611835565b820191905f5260205f20905b81548152906001019060200180831161181857829003601f168201915b505050505081565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663651e65b56040518163ffffffff1660e01b8152600401602060405180830381865afa1580156118a6573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906118ca91906122c0565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016119259291906122fa565b602060405180830381865afa158015611940573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190611964919061234b565b6119a3576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161199a906123c0565b60405180910390fd5b8360035f8781526020019081526020015f205f0160066101000a81548161ffff021916908361ffff160217905550828260075f8881526020019081526020015f2091826119f192919061282e565b505050505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f604051905090565b5f5ffd5b5f5ffd5b5f819050919050565b611a4081611a2e565b8114611a4a575f5ffd5b50565b5f81359050611a5b81611a37565b92915050565b5f60208284031215611a7657611a75611a26565b5b5f611a8384828501611a4d565b91505092915050565b5f61ffff82169050919050565b611aa281611a8c565b82525050565b5f608082019050611abb5f830187611a99565b611ac86020830186611a99565b611ad56040830185611a99565b611ae26060830184611a99565b95945050505050565b611af481611a2e565b82525050565b5f602082019050611b0d5f830184611aeb565b92915050565b5f8115159050919050565b611b2781611b13565b82525050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602160045260245ffd5b60038110611b6b57611b6a611b2d565b5b50565b5f819050611b7b82611b5a565b919050565b5f611b8a82611b6e565b9050919050565b611b9a81611b80565b82525050565b5f604082019050611bb35f830185611b1e565b611bc06020830184611b91565b9392505050565b611bd081611a8c565b8114611bda575f5ffd5b50565b5f81359050611beb81611bc7565b92915050565b5f5f60408385031215611c0757611c06611a26565b5b5f611c1485828601611a4d565b9250506020611c2585828601611bdd565b9150509250929050565b5f5ffd5b5f60808284031215611c4857611c47611c2f565b5b81905092915050565b5f60808284031215611c6657611c65611a26565b5b5f611c7384828501611c33565b91505092915050565b5f604082019050611c8f5f830185611aeb565b611c9c6020830184611b91565b9392505050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f840112611cc457611cc3611ca3565b5b8235905067ffffffffffffffff811115611ce157611ce0611ca7565b5b602083019150836001820283011115611cfd57611cfc611cab565b5b9250929050565b5f5f5f5f5f60e08688031215611d1d57611d1c611a26565b5b5f611d2a88828901611a4d565b9550506020611d3b88828901611c33565b94505060a0611d4c88828901611bdd565b93505060c086013567ffffffffffffffff811115611d6d57611d6c611a2a565b5b611d7988828901611caf565b92509250509295509295909350565b5f604082019050611d9b5f830185611aeb565b611da86020830184611aeb565b9392505050565b5f81519050919050565b5f82825260208201905092915050565b8281835e5f83830152505050565b5f601f19601f8301169050919050565b5f611df182611daf565b611dfb8185611db9565b9350611e0b818560208601611dc9565b611e1481611dd7565b840191505092915050565b5f6020820190508181035f830152611e378184611de7565b905092915050565b5f6101008284031215611e5557611e54611c2f565b5b81905092915050565b5f6101008284031215611e7457611e73611a26565b5b5f611e8184828501611e3f565b91505092915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f611eb382611e8a565b9050919050565b611ec381611ea9565b82525050565b5f602082019050611edc5f830184611eba565b92915050565b60038110611ef357611ef2611b2d565b5b50565b5f819050611f0382611ee2565b919050565b5f611f1282611ef6565b9050919050565b611f2281611f08565b82525050565b5f60c082019050611f3b5f830189611aeb565b611f486020830188611aeb565b611f556040830187611aeb565b611f626060830186611aeb565b611f6f6080830185611f19565b611f7c60a0830184611b91565b979650505050505050565b611f9081611ea9565b8114611f9a575f5ffd5b50565b5f81359050611fab81611f87565b92915050565b5f60208284031215611fc657611fc5611a26565b5b5f611fd384828501611f9d565b91505092915050565b5f602082019050611fef5f830184611f19565b92915050565b5f6020820190506120085f830184611b91565b92915050565b5f5f610120838503121561202557612024611a26565b5b5f61203285828601611a4d565b925050602061204385828601611e3f565b9150509250929050565b5f5f5f6040848603121561206457612063611a26565b5b5f61207186828701611a4d565b935050602084013567ffffffffffffffff81111561209257612091611a2a565b5b61209e86828701611caf565b92509250509250925092565b5f5f5f5f606085870312156120c2576120c1611a26565b5b5f6120cf87828801611a4d565b94505060206120e087828801611bdd565b935050604085013567ffffffffffffffff81111561210157612100611a2a565b5b61210d87828801611caf565b925092505092959194509250565b5f819050919050565b5f61213e61213961213484611e8a565b61211b565b611e8a565b9050919050565b5f61214f82612124565b9050919050565b5f61216082612145565b9050919050565b61217081612156565b82525050565b5f6020820190506121895f830184612167565b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f6121c682611a2e565b91506121d183611a2e565b92508282026121df81611a2e565b915082820484148315176121f6576121f561218f565b5b5092915050565b5f61220782611a2e565b915061221283611a2e565b925082820190508082111561222a5761222961218f565b5b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601260045260245ffd5b5f61226782611a2e565b915061227283611a2e565b92508261228257612281612230565b5b828204905092915050565b5f819050919050565b61229f8161228d565b81146122a9575f5ffd5b50565b5f815190506122ba81612296565b92915050565b5f602082840312156122d5576122d4611a26565b5b5f6122e2848285016122ac565b91505092915050565b6122f48161228d565b82525050565b5f60408201905061230d5f8301856122eb565b61231a6020830184611eba565b9392505050565b61232a81611b13565b8114612334575f5ffd5b50565b5f8151905061234581612321565b92915050565b5f602082840312156123605761235f611a26565b5b5f61236d84828501612337565b91505092915050565b7f5175616c697479496e6465783a206d697373696e6720726f6c650000000000005f82015250565b5f6123aa601a83611db9565b91506123b582612376565b602082019050919050565b5f6020820190508181035f8301526123d78161239e565b9050919050565b5f5ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b61241882611dd7565b810181811067ffffffffffffffff82111715612437576124366123e2565b5b80604052505050565b5f612449611a1d565b9050612455828261240f565b919050565b5f67ffffffffffffffff821115612474576124736123e2565b5b61247d82611dd7565b9050602081019050919050565b5f61249c6124978461245a565b612440565b9050828152602081018484840111156124b8576124b76123de565b5b6124c3848285611dc9565b509392505050565b5f82601f8301126124df576124de611ca3565b5b81516124ef84826020860161248a565b91505092915050565b5f8151905061250681611bc7565b92915050565b5f5f6040838503121561252257612521611a26565b5b5f83015167ffffffffffffffff81111561253f5761253e611a2a565b5b61254b858286016124cb565b925050602061255c858286016124f8565b9150509250929050565b7f5175616c697479496e6465783a2063616c6c6572206973206e6f7420537570705f8201527f6c79436861696e00000000000000000000000000000000000000000000000000602082015250565b5f6125c0602783611db9565b91506125cb82612566565b604082019050919050565b5f6020820190508181035f8301526125ed816125b4565b9050919050565b5f6020828403121561260957612608611a26565b5b5f61261684828501611bdd565b91505092915050565b5f82905092915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602260045260245ffd5b5f600282049050600182168061266d57607f821691505b6020821081036126805761267f612629565b5b50919050565b5f819050815f5260205f209050919050565b5f6020601f8301049050919050565b5f82821b905092915050565b5f600883026126e27fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff826126a7565b6126ec86836126a7565b95508019841693508086168417925050509392505050565b5f61271e61271961271484611a2e565b61211b565b611a2e565b9050919050565b5f819050919050565b61273783612704565b61274b61274382612725565b8484546126b3565b825550505050565b5f5f905090565b612762612753565b61276d81848461272e565b505050565b5f5b82811015612793576127885f82840161275a565b600181019050612774565b505050565b601f8211156127e657828211156127e5576127b281612686565b6127bb83612698565b6127c485612698565b60208610156127d1575f90505b8083016127e082840382612772565b505050505b5b505050565b5f82821c905092915050565b5f6128065f19846008026127eb565b1980831691505092915050565b5f61281e83836127f7565b9150826002028217905092915050565b612838838361261f565b67ffffffffffffffff811115612851576128506123e2565b5b61285b8254612656565b612866828285612798565b5f601f831160018114612893575f8415612881578287013590505b61288b8582612813565b8655506128f2565b601f1984166128a186612686565b5f5b828110156128c8578489013582556001820191506020850194506020810190506128a3565b868310156128e557848901356128e1601f8916826127f7565b8355505b6001600288020188555050505b5050505050505056fea2646970667358221220ead2119e4a9b3615dce7c5caf52b97007c9adfbd578ec8dceea711ce9c4398cf64736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_AWARDCERTIFICATECID = "awardCertificateCid";

    public static final String FUNC_BATCHSTATES = "batchStates";

    public static final String FUNC_CALCULATEMCI = "calculateMCI";

    public static final String FUNC_CALCULATEPHQI = "calculatePHQI";

    public static final String FUNC_CALCULATEQI = "calculateQI";

    public static final String FUNC_CALCULATESI = "calculateSI";

    public static final String FUNC_CHECKGATEKEEPER = "checkGatekeeper";

    public static final String FUNC_GATEKEEPERFLAGS = "gatekeeperFlags";

    public static final String FUNC_GETQUALITYDATA = "getQualityData";

    public static final String FUNC_MCIDATA = "mciData";

    public static final String FUNC_ORIGINCID = "originCid";

    public static final String FUNC_PHQIREPORTCID = "phqiReportCid";

    public static final String FUNC_QUALITYDATA = "qualityData";

    public static final String FUNC_SETSUPPLYCHAIN = "setSupplyChain";

    public static final String FUNC_SUBMITAWARD = "submitAward";

    public static final String FUNC_SUBMITMCIORIGINDATA = "submitMCIOriginData";

    public static final String FUNC_SUBMITORIGIN = "submitOrigin";

    public static final String FUNC_SUBMITPHQIDATA = "submitPHQIData";

    public static final String FUNC_SUBMITSIDATA = "submitSIData";

    public static final String FUNC_SUPPLYCHAIN = "supplyChain";

    public static final String FUNC_TRIGGERTEMPERATUREVIOLATION = "triggerTemperatureViolation";

    @Deprecated
    protected QualityIndex(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected QualityIndex(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected QualityIndex(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected QualityIndex(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> awardCertificateCid(BigInteger param0) {
        final Function function = new Function(FUNC_AWARDCERTIFICATECID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> batchStates(BigInteger param0) {
        final Function function = new Function(FUNC_BATCHSTATES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculateMCI(BigInteger batchId) {
        final Function function = new Function(FUNC_CALCULATEMCI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> calculatePHQI(PHQIInput input) {
        final Function function = new Function(FUNC_CALCULATEPHQI, 
                Arrays.<Type>asList(input), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, BigInteger>>(function,
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> calculateQI(BigInteger batchId) {
        final Function function = new Function(FUNC_CALCULATEQI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculateSI(SIInput input) {
        final Function function = new Function(FUNC_CALCULATESI, 
                Arrays.<Type>asList(input), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple2<Boolean, BigInteger>> checkGatekeeper(BigInteger batchId) {
        final Function function = new Function(FUNC_CHECKGATEKEEPER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple2<Boolean, BigInteger>>(function,
                new Callable<Tuple2<Boolean, BigInteger>>() {
                    @Override
                    public Tuple2<Boolean, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<Boolean, BigInteger>(
                                (Boolean) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> gatekeeperFlags(BigInteger param0) {
        final Function function = new Function(FUNC_GATEKEEPERFLAGS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
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

    public RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>> mciData(
            BigInteger param0) {
        final Function function = new Function(FUNC_MCIDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, BigInteger> call() throws
                            Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> originCid(BigInteger param0) {
        final Function function = new Function(FUNC_ORIGINCID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> phqiReportCid(BigInteger param0) {
        final Function function = new Function(FUNC_PHQIREPORTCID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> qualityData(BigInteger param0) {
        final Function function = new Function(FUNC_QUALITYDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, BigInteger>>(function,
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setSupplyChain(String supplyChainAddress) {
        final Function function = new Function(
                FUNC_SETSUPPLYCHAIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, supplyChainAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitAward(BigInteger batchId, BigInteger level,
            String ipfsCid) {
        final Function function = new Function(
                FUNC_SUBMITAWARD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint16(level), 
                new org.web3j.abi.datatypes.Utf8String(ipfsCid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitMCIOriginData(BigInteger batchId,
            BigInteger region) {
        final Function function = new Function(
                FUNC_SUBMITMCIORIGINDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint16(region)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitOrigin(BigInteger batchId, String ipfsCid) {
        final Function function = new Function(
                FUNC_SUBMITORIGIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.Utf8String(ipfsCid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitPHQIData(BigInteger batchId,
            PHQIInput input, BigInteger variety, String ipfsCid) {
        final Function function = new Function(
                FUNC_SUBMITPHQIDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                input, 
                new org.web3j.abi.datatypes.generated.Uint16(variety), 
                new org.web3j.abi.datatypes.Utf8String(ipfsCid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitSIData(BigInteger batchId, SIInput input) {
        final Function function = new Function(
                FUNC_SUBMITSIDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                input), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> supplyChain() {
        final Function function = new Function(FUNC_SUPPLYCHAIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> triggerTemperatureViolation(BigInteger batchId) {
        final Function function = new Function(
                FUNC_TRIGGERTEMPERATUREVIOLATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static QualityIndex load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new QualityIndex(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static QualityIndex load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new QualityIndex(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static QualityIndex load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new QualityIndex(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static QualityIndex load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new QualityIndex(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<QualityIndex> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<QualityIndex> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider,
            String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<QualityIndex> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<QualityIndex> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

    public static class PHQIInput extends StaticStruct {
        public BigInteger normalizedWaterContent;

        public BigInteger hmf;

        public BigInteger invertaseActivity;

        public BigInteger waterContentPercent;

        public PHQIInput(BigInteger normalizedWaterContent, BigInteger hmf,
                BigInteger invertaseActivity, BigInteger waterContentPercent) {
            super(new org.web3j.abi.datatypes.generated.Uint16(normalizedWaterContent), 
                    new org.web3j.abi.datatypes.generated.Uint16(hmf), 
                    new org.web3j.abi.datatypes.generated.Uint16(invertaseActivity), 
                    new org.web3j.abi.datatypes.generated.Uint16(waterContentPercent));
            this.normalizedWaterContent = normalizedWaterContent;
            this.hmf = hmf;
            this.invertaseActivity = invertaseActivity;
            this.waterContentPercent = waterContentPercent;
        }

        public PHQIInput(Uint16 normalizedWaterContent, Uint16 hmf, Uint16 invertaseActivity,
                Uint16 waterContentPercent) {
            super(normalizedWaterContent, hmf, invertaseActivity, waterContentPercent);
            this.normalizedWaterContent = normalizedWaterContent.getValue();
            this.hmf = hmf.getValue();
            this.invertaseActivity = invertaseActivity.getValue();
            this.waterContentPercent = waterContentPercent.getValue();
        }
    }

    public static class SIInput extends StaticStruct {
        public BigInteger forage;

        public BigInteger lightIntensity;

        public BigInteger waterSource;

        public BigInteger summerTemperature;

        public BigInteger winterTemperature;

        public BigInteger windSpeed;

        public BigInteger humidity;

        public BigInteger precipitation;

        public SIInput(BigInteger forage, BigInteger lightIntensity, BigInteger waterSource,
                BigInteger summerTemperature, BigInteger winterTemperature, BigInteger windSpeed,
                BigInteger humidity, BigInteger precipitation) {
            super(new org.web3j.abi.datatypes.generated.Uint16(forage), 
                    new org.web3j.abi.datatypes.generated.Uint16(lightIntensity), 
                    new org.web3j.abi.datatypes.generated.Uint16(waterSource), 
                    new org.web3j.abi.datatypes.generated.Uint16(summerTemperature), 
                    new org.web3j.abi.datatypes.generated.Uint16(winterTemperature), 
                    new org.web3j.abi.datatypes.generated.Uint16(windSpeed), 
                    new org.web3j.abi.datatypes.generated.Uint16(humidity), 
                    new org.web3j.abi.datatypes.generated.Uint16(precipitation));
            this.forage = forage;
            this.lightIntensity = lightIntensity;
            this.waterSource = waterSource;
            this.summerTemperature = summerTemperature;
            this.winterTemperature = winterTemperature;
            this.windSpeed = windSpeed;
            this.humidity = humidity;
            this.precipitation = precipitation;
        }

        public SIInput(Uint16 forage, Uint16 lightIntensity, Uint16 waterSource,
                Uint16 summerTemperature, Uint16 winterTemperature, Uint16 windSpeed,
                Uint16 humidity, Uint16 precipitation) {
            super(forage, lightIntensity, waterSource, summerTemperature, winterTemperature, windSpeed, humidity, precipitation);
            this.forage = forage.getValue();
            this.lightIntensity = lightIntensity.getValue();
            this.waterSource = waterSource.getValue();
            this.summerTemperature = summerTemperature.getValue();
            this.winterTemperature = winterTemperature.getValue();
            this.windSpeed = windSpeed.getValue();
            this.humidity = humidity.getValue();
            this.precipitation = precipitation.getValue();
        }
    }
}

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
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b506040516125ec3803806125ec833981810160405281019061003191906100d4565b805f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550506100ff565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6100a38261007a565b9050919050565b6100b381610099565b81146100bd575f5ffd5b50565b5f815190506100ce816100aa565b92915050565b5f602082840312156100e9576100e8610076565b5b5f6100f6848285016100c0565b91505092915050565b6124e08061010c5f395ff3fe608060405234801561000f575f5ffd5b506004361061011f575f3560e01c8063808a12c5116100ab578063ad6d31371161006f578063ad6d31371461036c578063b20a5dbe14610388578063b9ca8d6c146103b8578063c9163e29146103e8578063eae7b935146104045761011f565b8063808a12c51461029d57806386e5e4c2146102cd57806388d84b66146102fd5780638e0ae3951461031b578063970ad861146103375761011f565b806338140c71116100f257806338140c71146101d35780634f09fed0146101ef57806365db8059146102205780636c4f3f6e1461023c57806372538b271461026c5761011f565b8063088dbdf4146101235780631322cbb1146101565780631742108b1461018657806330256438146101b7575b5f5ffd5b61013d600480360381019061013891906116de565b610422565b60405161014d9493929190611725565b60405180910390f35b610170600480360381019061016b91906116de565b610482565b60405161017d9190611777565b60405180910390f35b6101a0600480360381019061019b91906116de565b6105a7565b6040516101ae92919061181d565b60405180910390f35b6101d160048036038101906101cc919061186e565b610615565b005b6101ed60048036038101906101e891906116de565b61087c565b005b610209600480360381019061020491906118ce565b6109ca565b6040516102179291906118f9565b60405180910390f35b61023a60048036038101906102359190611981565b610af7565b005b610256600480360381019061025191906116de565b610df1565b6040516102639190611777565b60405180910390f35b610286600480360381019061028191906116de565b610e82565b604051610294929190611a05565b60405180910390f35b6102b760048036038101906102b291906116de565b610ea2565b6040516102c49190611a9c565b60405180910390f35b6102e760048036038101906102e29190611adb565b610f3d565b6040516102f49190611777565b60405180910390f35b6103056110b7565b6040516103129190611b46565b60405180910390f35b6103356004803603810190610330919061186e565b6110dc565b005b610351600480360381019061034c91906116de565b611275565b60405161036396959493929190611ba5565b60405180910390f35b61038660048036038101906103819190611c2e565b611307565b005b6103a2600480360381019061039d91906116de565b6114b1565b6040516103af9190611c59565b60405180910390f35b6103d260048036038101906103cd91906116de565b6114ce565b6040516103df9190611c72565b60405180910390f35b61040260048036038101906103fd9190611c8b565b6114eb565b005b61040c611676565b6040516104199190611d25565b60405180910390f35b6003602052805f5260405f205f91509050805f015f9054906101000a900461ffff1690805f0160029054906101000a900461ffff1690805f0160049054906101000a900461ffff1690805f0160069054906101000a900461ffff16905084565b5f5f60035f8481526020019081526020015f206040518060800160405290815f82015f9054906101000a900461ffff1661ffff1661ffff1681526020015f820160029054906101000a900461ffff1661ffff1661ffff1681526020015f820160049054906101000a900461ffff1661ffff1661ffff1681526020015f820160069054906101000a900461ffff1661ffff1661ffff168152505090506127106106ff826060015161ffff166105369190611d6b565b610652836040015161ffff1661054c9190611d6b565b61123c846020015161ffff166105629190611d6b565b610784855f015161ffff166105779190611d6b565b6105819190611dac565b61058b9190611dac565b6105959190611dac565b61059f9190611e0c565b915050919050565b5f5f60055f8481526020019081526020015f205f9054906101000a900460ff1690506002808111156105dc576105db6117aa565b5b60045f8581526020019081526020015f205f9054906101000a900460ff16600281111561060c5761060b6117aa565b5b14159150915091565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561067e573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106a29190611e6f565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016106fd929190611ea9565b602060405180830381865afa158015610718573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061073c9190611efa565b61077b576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161077290611f6f565b60405180910390fd5b5f5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663236e0929336040518263ffffffff1660e01b81526004016107d59190611b46565b5f60405180830381865afa1580156107ef573d5f5f3e3d5ffd5b505050506040513d5f823e3d601f19601f8201168201806040525081019061081791906120bb565b9150508260035f8681526020019081526020015f205f0160026101000a81548161ffff021916908361ffff1602179055508060035f8681526020019081526020015f205f0160046101000a81548161ffff021916908361ffff16021790555050505050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461090b576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161090290612185565b60405180910390fd5b60028081111561091e5761091d6117aa565b5b60045f8381526020019081526020015f205f9054906101000a900460ff16600281111561094e5761094d6117aa565b5b03156109c757600260055f8381526020019081526020015f205f6101000a81548160ff02191690836002811115610988576109876117aa565b5b0217905550600160045f8381526020019081526020015f205f6101000a81548160ff021916908360028111156109c1576109c06117aa565b5b02179055505b50565b5f5f6108fc8360600160208101906109e291906121a3565b61ffff1611156109f8575f600191509150610af2565b5f835f016020810190610a0b91906121a3565b61ffff161480610a3057505f836020016020810190610a2a91906121a3565b61ffff16145b80610a5057505f836040016020810190610a4a91906121a3565b61ffff16145b15610a60575f5f91509150610af2565b612710610d05846040016020810190610a7991906121a3565b61ffff16610a879190611d6b565b610d05856020016020810190610a9d91906121a3565b61ffff16610aab9190611d6b565b610d05865f016020810190610ac091906121a3565b61ffff16610ace9190611d6b565b610ad89190611dac565b610ae29190611dac565b610aec9190611e0c565b91505f90505b915091565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663bd3070c66040518163ffffffff1660e01b8152600401602060405180830381865afa158015610b60573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610b849190611e6f565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610bdf929190611ea9565b602060405180830381865afa158015610bfa573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610c1e9190611efa565b610c5d576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610c5490611f6f565b60405180910390fd5b5f5f610c68876109ca565b915091508160025f8a81526020019081526020015f20600101819055508560035f8a81526020019081526020015f205f015f6101000a81548161ffff021916908361ffff160217905550848460065f8b81526020019081526020015f209182610cd29291906123dd565b5060016002811115610ce757610ce66117aa565b5b816002811115610cfa57610cf96117aa565b5b03610d7657600160055f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610d3357610d326117aa565b5b0217905550600260045f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610d6c57610d6b6117aa565b5b0217905550610de7565b5f60055f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610da957610da86117aa565b5b02179055505f60045f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610de157610de06117aa565b5b02179055505b5050505050505050565b5f5f60025f8481526020019081526020015f205f015490505f60025f8581526020019081526020015f206001015490505f610e2b85610482565b905061271061066284610e3e9190611d6b565b610b9a83610e4c9190611d6b565b61151485610e5a9190611d6b565b610e649190611dac565b610e6e9190611dac565b610e789190611e0c565b9350505050919050565b6002602052805f5260405f205f91509050805f0154908060010154905082565b6006602052805f5260405f205f915090508054610ebe90612205565b80601f0160208091040260200160405190810160405280929190818152602001828054610eea90612205565b8015610f355780601f10610f0c57610100808354040283529160200191610f35565b820191905f5260205f20905b815481529060010190602001808311610f1857829003601f168201915b505050505081565b5f6127106101008360e0016020810190610f5791906121a3565b61ffff16610f659190611d6b565b61016c8460c0016020810190610f7b91906121a3565b61ffff16610f899190611d6b565b61020e8560a0016020810190610f9f91906121a3565b61ffff16610fad9190611d6b565b610315866080016020810190610fc391906121a3565b61ffff16610fd19190611d6b565b610460876060016020810190610fe791906121a3565b61ffff16610ff59190611d6b565b6105d088604001602081019061100b91906121a3565b61ffff166110199190611d6b565b6106b389602001602081019061102f91906121a3565b61ffff1661103d9190611d6b565b610e9d8a5f01602081019061105291906121a3565b61ffff166110609190611d6b565b61106a9190611dac565b6110749190611dac565b61107e9190611dac565b6110889190611dac565b6110929190611dac565b61109c9190611dac565b6110a69190611dac565b6110b09190611e0c565b9050919050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663651e65b56040518163ffffffff1660e01b8152600401602060405180830381865afa158015611145573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906111699190611e6f565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016111c4929190611ea9565b602060405180830381865afa1580156111df573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906112039190611efa565b611242576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161123990611f6f565b60405180910390fd5b8160035f8581526020019081526020015f205f0160066101000a81548161ffff021916908361ffff160217905550505050565b5f5f5f5f5f5f60025f8881526020019081526020015f205f0154955060025f8881526020019081526020015f206001015494506112b187610482565b93506112bc87610df1565b925060045f8881526020019081526020015f205f9054906101000a900460ff16915060055f8881526020019081526020015f205f9054906101000a900460ff16905091939550919395565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611370573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906113949190611e6f565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016113ef929190611ea9565b602060405180830381865afa15801561140a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061142e9190611efa565b61146d576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161146490611f6f565b60405180910390fd5b8160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b6004602052805f5260405f205f915054906101000a900460ff1681565b6005602052805f5260405f205f915054906101000a900460ff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611554573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906115789190611e6f565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016115d3929190611ea9565b602060405180830381865afa1580156115ee573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906116129190611efa565b611651576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161164890611f6f565b60405180910390fd5b61165a82610f3d565b60025f8581526020019081526020015f205f0181905550505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f604051905090565b5f5ffd5b5f5ffd5b5f819050919050565b6116bd816116ab565b81146116c7575f5ffd5b50565b5f813590506116d8816116b4565b92915050565b5f602082840312156116f3576116f26116a3565b5b5f611700848285016116ca565b91505092915050565b5f61ffff82169050919050565b61171f81611709565b82525050565b5f6080820190506117385f830187611716565b6117456020830186611716565b6117526040830185611716565b61175f6060830184611716565b95945050505050565b611771816116ab565b82525050565b5f60208201905061178a5f830184611768565b92915050565b5f8115159050919050565b6117a481611790565b82525050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602160045260245ffd5b600381106117e8576117e76117aa565b5b50565b5f8190506117f8826117d7565b919050565b5f611807826117eb565b9050919050565b611817816117fd565b82525050565b5f6040820190506118305f83018561179b565b61183d602083018461180e565b9392505050565b61184d81611709565b8114611857575f5ffd5b50565b5f8135905061186881611844565b92915050565b5f5f60408385031215611884576118836116a3565b5b5f611891858286016116ca565b92505060206118a28582860161185a565b9150509250929050565b5f5ffd5b5f608082840312156118c5576118c46118ac565b5b81905092915050565b5f608082840312156118e3576118e26116a3565b5b5f6118f0848285016118b0565b91505092915050565b5f60408201905061190c5f830185611768565b611919602083018461180e565b9392505050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f84011261194157611940611920565b5b8235905067ffffffffffffffff81111561195e5761195d611924565b5b60208301915083600182028301111561197a57611979611928565b5b9250929050565b5f5f5f5f5f60e0868803121561199a576119996116a3565b5b5f6119a7888289016116ca565b95505060206119b8888289016118b0565b94505060a06119c98882890161185a565b93505060c086013567ffffffffffffffff8111156119ea576119e96116a7565b5b6119f68882890161192c565b92509250509295509295909350565b5f604082019050611a185f830185611768565b611a256020830184611768565b9392505050565b5f81519050919050565b5f82825260208201905092915050565b8281835e5f83830152505050565b5f601f19601f8301169050919050565b5f611a6e82611a2c565b611a788185611a36565b9350611a88818560208601611a46565b611a9181611a54565b840191505092915050565b5f6020820190508181035f830152611ab48184611a64565b905092915050565b5f6101008284031215611ad257611ad16118ac565b5b81905092915050565b5f6101008284031215611af157611af06116a3565b5b5f611afe84828501611abc565b91505092915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f611b3082611b07565b9050919050565b611b4081611b26565b82525050565b5f602082019050611b595f830184611b37565b92915050565b60038110611b7057611b6f6117aa565b5b50565b5f819050611b8082611b5f565b919050565b5f611b8f82611b73565b9050919050565b611b9f81611b85565b82525050565b5f60c082019050611bb85f830189611768565b611bc56020830188611768565b611bd26040830187611768565b611bdf6060830186611768565b611bec6080830185611b96565b611bf960a083018461180e565b979650505050505050565b611c0d81611b26565b8114611c17575f5ffd5b50565b5f81359050611c2881611c04565b92915050565b5f60208284031215611c4357611c426116a3565b5b5f611c5084828501611c1a565b91505092915050565b5f602082019050611c6c5f830184611b96565b92915050565b5f602082019050611c855f83018461180e565b92915050565b5f5f6101208385031215611ca257611ca16116a3565b5b5f611caf858286016116ca565b9250506020611cc085828601611abc565b9150509250929050565b5f819050919050565b5f611ced611ce8611ce384611b07565b611cca565b611b07565b9050919050565b5f611cfe82611cd3565b9050919050565b5f611d0f82611cf4565b9050919050565b611d1f81611d05565b82525050565b5f602082019050611d385f830184611d16565b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f611d75826116ab565b9150611d80836116ab565b9250828202611d8e816116ab565b91508282048414831517611da557611da4611d3e565b5b5092915050565b5f611db6826116ab565b9150611dc1836116ab565b9250828201905080821115611dd957611dd8611d3e565b5b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601260045260245ffd5b5f611e16826116ab565b9150611e21836116ab565b925082611e3157611e30611ddf565b5b828204905092915050565b5f819050919050565b611e4e81611e3c565b8114611e58575f5ffd5b50565b5f81519050611e6981611e45565b92915050565b5f60208284031215611e8457611e836116a3565b5b5f611e9184828501611e5b565b91505092915050565b611ea381611e3c565b82525050565b5f604082019050611ebc5f830185611e9a565b611ec96020830184611b37565b9392505050565b611ed981611790565b8114611ee3575f5ffd5b50565b5f81519050611ef481611ed0565b92915050565b5f60208284031215611f0f57611f0e6116a3565b5b5f611f1c84828501611ee6565b91505092915050565b7f5175616c697479496e6465783a206d697373696e6720726f6c650000000000005f82015250565b5f611f59601a83611a36565b9150611f6482611f25565b602082019050919050565b5f6020820190508181035f830152611f8681611f4d565b9050919050565b5f5ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b611fc782611a54565b810181811067ffffffffffffffff82111715611fe657611fe5611f91565b5b80604052505050565b5f611ff861169a565b90506120048282611fbe565b919050565b5f67ffffffffffffffff82111561202357612022611f91565b5b61202c82611a54565b9050602081019050919050565b5f61204b61204684612009565b611fef565b90508281526020810184848401111561206757612066611f8d565b5b612072848285611a46565b509392505050565b5f82601f83011261208e5761208d611920565b5b815161209e848260208601612039565b91505092915050565b5f815190506120b581611844565b92915050565b5f5f604083850312156120d1576120d06116a3565b5b5f83015167ffffffffffffffff8111156120ee576120ed6116a7565b5b6120fa8582860161207a565b925050602061210b858286016120a7565b9150509250929050565b7f5175616c697479496e6465783a2063616c6c6572206973206e6f7420537570705f8201527f6c79436861696e00000000000000000000000000000000000000000000000000602082015250565b5f61216f602783611a36565b915061217a82612115565b604082019050919050565b5f6020820190508181035f83015261219c81612163565b9050919050565b5f602082840312156121b8576121b76116a3565b5b5f6121c58482850161185a565b91505092915050565b5f82905092915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602260045260245ffd5b5f600282049050600182168061221c57607f821691505b60208210810361222f5761222e6121d8565b5b50919050565b5f819050815f5260205f209050919050565b5f6020601f8301049050919050565b5f82821b905092915050565b5f600883026122917fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82612256565b61229b8683612256565b95508019841693508086168417925050509392505050565b5f6122cd6122c86122c3846116ab565b611cca565b6116ab565b9050919050565b5f819050919050565b6122e6836122b3565b6122fa6122f2826122d4565b848454612262565b825550505050565b5f5f905090565b612311612302565b61231c8184846122dd565b505050565b5f5b82811015612342576123375f828401612309565b600181019050612323565b505050565b601f82111561239557828211156123945761236181612235565b61236a83612247565b61237385612247565b6020861015612380575f90505b80830161238f82840382612321565b505050505b5b505050565b5f82821c905092915050565b5f6123b55f198460080261239a565b1980831691505092915050565b5f6123cd83836123a6565b9150826002028217905092915050565b6123e783836121ce565b67ffffffffffffffff811115612400576123ff611f91565b5b61240a8254612205565b612415828285612347565b5f601f831160018114612442575f8415612430578287013590505b61243a85826123c2565b8655506124a1565b601f19841661245086612235565b5f5b8281101561247757848901358255600182019150602085019450602081019050612452565b868310156124945784890135612490601f8916826123a6565b8355505b6001600288020188555050505b5050505050505056fea2646970667358221220a9edc553a3fa5205cb12828582d54333347645797662c8796cb970623b3df86764736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_BATCHSTATES = "batchStates";

    public static final String FUNC_CALCULATEMCI = "calculateMCI";

    public static final String FUNC_CALCULATEPHQI = "calculatePHQI";

    public static final String FUNC_CALCULATEQI = "calculateQI";

    public static final String FUNC_CALCULATESI = "calculateSI";

    public static final String FUNC_CHECKGATEKEEPER = "checkGatekeeper";

    public static final String FUNC_GATEKEEPERFLAGS = "gatekeeperFlags";

    public static final String FUNC_GETQUALITYDATA = "getQualityData";

    public static final String FUNC_MCIDATA = "mciData";

    public static final String FUNC_PHQIREPORTCID = "phqiReportCid";

    public static final String FUNC_QUALITYDATA = "qualityData";

    public static final String FUNC_SETSUPPLYCHAIN = "setSupplyChain";

    public static final String FUNC_SUBMITAWARD = "submitAward";

    public static final String FUNC_SUBMITMCIORIGINDATA = "submitMCIOriginData";

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

    public RemoteFunctionCall<TransactionReceipt> submitAward(BigInteger batchId,
            BigInteger level) {
        final Function function = new Function(
                FUNC_SUBMITAWARD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint16(level)), 
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

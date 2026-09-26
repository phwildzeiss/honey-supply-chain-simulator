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
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b50604051612756380380612756833981810160405281019061003191906100d4565b805f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550506100ff565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6100a38261007a565b9050919050565b6100b381610099565b81146100bd575f5ffd5b50565b5f815190506100ce816100aa565b92915050565b5f602082840312156100e9576100e8610076565b5b5f6100f6848285016100c0565b91505092915050565b61264a8061010c5f395ff3fe608060405234801561000f575f5ffd5b506004361061012a575f3560e01c806386e5e4c2116100ab578063b9ca8d6c1161006f578063b9ca8d6c146103a7578063c9163e29146103d7578063d93e1287146103f3578063e2c0d3a714610423578063eae7b9351461043f5761012a565b806386e5e4c2146102d857806388d84b6614610308578063970ad86114610326578063ad6d31371461035b578063b20a5dbe146103775761012a565b80634f09fed0116100f25780634f09fed0146101fa57806365db80591461022b5780636c4f3f6e1461024757806372538b2714610277578063808a12c5146102a85761012a565b8063088dbdf41461012e5780631322cbb1146101615780631742108b1461019157806330256438146101c257806338140c71146101de575b5f5ffd5b610148600480360381019061014391906117d7565b61045d565b604051610158949392919061181e565b60405180910390f35b61017b600480360381019061017691906117d7565b6104bd565b6040516101889190611870565b60405180910390f35b6101ab60048036038101906101a691906117d7565b6105e2565b6040516101b9929190611916565b60405180910390f35b6101dc60048036038101906101d79190611967565b610650565b005b6101f860048036038101906101f391906117d7565b6108b7565b005b610214600480360381019061020f91906119c7565b610a05565b6040516102229291906119f2565b60405180910390f35b61024560048036038101906102409190611a7a565b610b32565b005b610261600480360381019061025c91906117d7565b610e2c565b60405161026e9190611870565b60405180910390f35b610291600480360381019061028c91906117d7565b610ebd565b60405161029f929190611afe565b60405180910390f35b6102c260048036038101906102bd91906117d7565b610edd565b6040516102cf9190611b95565b60405180910390f35b6102f260048036038101906102ed9190611bd4565b610f78565b6040516102ff9190611870565b60405180910390f35b6103106110f2565b60405161031d9190611c3f565b60405180910390f35b610340600480360381019061033b91906117d7565b611117565b60405161035296959493929190611c9e565b60405180910390f35b61037560048036038101906103709190611d27565b6111a9565b005b610391600480360381019061038c91906117d7565b611353565b60405161039e9190611d52565b60405180910390f35b6103c160048036038101906103bc91906117d7565b611370565b6040516103ce9190611d6b565b60405180910390f35b6103f160048036038101906103ec9190611d84565b61138d565b005b61040d600480360381019061040891906117d7565b611518565b60405161041a9190611b95565b60405180910390f35b61043d60048036038101906104389190611dc3565b6115b3565b005b61044761176f565b6040516104549190611e8f565b60405180910390f35b6003602052805f5260405f205f91509050805f015f9054906101000a900461ffff1690805f0160029054906101000a900461ffff1690805f0160049054906101000a900461ffff1690805f0160069054906101000a900461ffff16905084565b5f5f60035f8481526020019081526020015f206040518060800160405290815f82015f9054906101000a900461ffff1661ffff1661ffff1681526020015f820160029054906101000a900461ffff1661ffff1661ffff1681526020015f820160049054906101000a900461ffff1661ffff1661ffff1681526020015f820160069054906101000a900461ffff1661ffff1661ffff168152505090506127106106ff826060015161ffff166105719190611ed5565b610652836040015161ffff166105879190611ed5565b61123c846020015161ffff1661059d9190611ed5565b610784855f015161ffff166105b29190611ed5565b6105bc9190611f16565b6105c69190611f16565b6105d09190611f16565b6105da9190611f76565b915050919050565b5f5f60055f8481526020019081526020015f205f9054906101000a900460ff169050600280811115610617576106166118a3565b5b60045f8581526020019081526020015f205f9054906101000a900460ff166002811115610647576106466118a3565b5b14159150915091565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156106b9573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106dd9190611fd9565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610738929190612013565b602060405180830381865afa158015610753573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107779190612064565b6107b6576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016107ad906120d9565b60405180910390fd5b5f5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663236e0929336040518263ffffffff1660e01b81526004016108109190611c3f565b5f60405180830381865afa15801561082a573d5f5f3e3d5ffd5b505050506040513d5f823e3d601f19601f820116820180604052508101906108529190612225565b9150508260035f8681526020019081526020015f205f0160026101000a81548161ffff021916908361ffff1602179055508060035f8681526020019081526020015f205f0160046101000a81548161ffff021916908361ffff16021790555050505050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614610946576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161093d906122ef565b60405180910390fd5b600280811115610959576109586118a3565b5b60045f8381526020019081526020015f205f9054906101000a900460ff166002811115610989576109886118a3565b5b0315610a0257600260055f8381526020019081526020015f205f6101000a81548160ff021916908360028111156109c3576109c26118a3565b5b0217905550600160045f8381526020019081526020015f205f6101000a81548160ff021916908360028111156109fc576109fb6118a3565b5b02179055505b50565b5f5f6108fc836060016020810190610a1d919061230d565b61ffff161115610a33575f600191509150610b2d565b5f835f016020810190610a46919061230d565b61ffff161480610a6b57505f836020016020810190610a65919061230d565b61ffff16145b80610a8b57505f836040016020810190610a85919061230d565b61ffff16145b15610a9b575f5f91509150610b2d565b612710610d05846040016020810190610ab4919061230d565b61ffff16610ac29190611ed5565b610d05856020016020810190610ad8919061230d565b61ffff16610ae69190611ed5565b610d05865f016020810190610afb919061230d565b61ffff16610b099190611ed5565b610b139190611f16565b610b1d9190611f16565b610b279190611f76565b91505f90505b915091565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663bd3070c66040518163ffffffff1660e01b8152600401602060405180830381865afa158015610b9b573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610bbf9190611fd9565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610c1a929190612013565b602060405180830381865afa158015610c35573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610c599190612064565b610c98576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610c8f906120d9565b60405180910390fd5b5f5f610ca387610a05565b915091508160025f8a81526020019081526020015f20600101819055508560035f8a81526020019081526020015f205f015f6101000a81548161ffff021916908361ffff160217905550848460065f8b81526020019081526020015f209182610d0d929190612547565b5060016002811115610d2257610d216118a3565b5b816002811115610d3557610d346118a3565b5b03610db157600160055f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610d6e57610d6d6118a3565b5b0217905550600260045f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610da757610da66118a3565b5b0217905550610e22565b5f60055f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610de457610de36118a3565b5b02179055505f60045f8a81526020019081526020015f205f6101000a81548160ff02191690836002811115610e1c57610e1b6118a3565b5b02179055505b5050505050505050565b5f5f60025f8481526020019081526020015f205f015490505f60025f8581526020019081526020015f206001015490505f610e66856104bd565b905061271061066284610e799190611ed5565b610b9a83610e879190611ed5565b61151485610e959190611ed5565b610e9f9190611f16565b610ea99190611f16565b610eb39190611f76565b9350505050919050565b6002602052805f5260405f205f91509050805f0154908060010154905082565b6006602052805f5260405f205f915090508054610ef99061236f565b80601f0160208091040260200160405190810160405280929190818152602001828054610f259061236f565b8015610f705780601f10610f4757610100808354040283529160200191610f70565b820191905f5260205f20905b815481529060010190602001808311610f5357829003601f168201915b505050505081565b5f6127106101008360e0016020810190610f92919061230d565b61ffff16610fa09190611ed5565b61016c8460c0016020810190610fb6919061230d565b61ffff16610fc49190611ed5565b61020e8560a0016020810190610fda919061230d565b61ffff16610fe89190611ed5565b610315866080016020810190610ffe919061230d565b61ffff1661100c9190611ed5565b610460876060016020810190611022919061230d565b61ffff166110309190611ed5565b6105d0886040016020810190611046919061230d565b61ffff166110549190611ed5565b6106b389602001602081019061106a919061230d565b61ffff166110789190611ed5565b610e9d8a5f01602081019061108d919061230d565b61ffff1661109b9190611ed5565b6110a59190611f16565b6110af9190611f16565b6110b99190611f16565b6110c39190611f16565b6110cd9190611f16565b6110d79190611f16565b6110e19190611f16565b6110eb9190611f76565b9050919050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f5f5f5f5f60025f8881526020019081526020015f205f0154955060025f8881526020019081526020015f20600101549450611153876104bd565b935061115e87610e2c565b925060045f8881526020019081526020015f205f9054906101000a900460ff16915060055f8881526020019081526020015f205f9054906101000a900460ff16905091939550919395565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611212573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906112369190611fd9565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401611291929190612013565b602060405180830381865afa1580156112ac573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906112d09190612064565b61130f576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611306906120d9565b60405180910390fd5b8160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b6004602052805f5260405f205f915054906101000a900460ff1681565b6005602052805f5260405f205f915054906101000a900460ff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156113f6573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061141a9190611fd9565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401611475929190612013565b602060405180830381865afa158015611490573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906114b49190612064565b6114f3576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016114ea906120d9565b60405180910390fd5b6114fc82610f78565b60025f8581526020019081526020015f205f0181905550505050565b6007602052805f5260405f205f9150905080546115349061236f565b80601f01602080910402602001604051908101604052809291908181526020018280546115609061236f565b80156115ab5780601f10611582576101008083540402835291602001916115ab565b820191905f5260205f20905b81548152906001019060200180831161158e57829003601f168201915b505050505081565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663651e65b56040518163ffffffff1660e01b8152600401602060405180830381865afa15801561161c573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906116409190611fd9565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161169b929190612013565b602060405180830381865afa1580156116b6573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906116da9190612064565b611719576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611710906120d9565b60405180910390fd5b8360035f8781526020019081526020015f205f0160066101000a81548161ffff021916908361ffff160217905550828260075f8881526020019081526020015f209182611767929190612547565b505050505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f604051905090565b5f5ffd5b5f5ffd5b5f819050919050565b6117b6816117a4565b81146117c0575f5ffd5b50565b5f813590506117d1816117ad565b92915050565b5f602082840312156117ec576117eb61179c565b5b5f6117f9848285016117c3565b91505092915050565b5f61ffff82169050919050565b61181881611802565b82525050565b5f6080820190506118315f83018761180f565b61183e602083018661180f565b61184b604083018561180f565b611858606083018461180f565b95945050505050565b61186a816117a4565b82525050565b5f6020820190506118835f830184611861565b92915050565b5f8115159050919050565b61189d81611889565b82525050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602160045260245ffd5b600381106118e1576118e06118a3565b5b50565b5f8190506118f1826118d0565b919050565b5f611900826118e4565b9050919050565b611910816118f6565b82525050565b5f6040820190506119295f830185611894565b6119366020830184611907565b9392505050565b61194681611802565b8114611950575f5ffd5b50565b5f813590506119618161193d565b92915050565b5f5f6040838503121561197d5761197c61179c565b5b5f61198a858286016117c3565b925050602061199b85828601611953565b9150509250929050565b5f5ffd5b5f608082840312156119be576119bd6119a5565b5b81905092915050565b5f608082840312156119dc576119db61179c565b5b5f6119e9848285016119a9565b91505092915050565b5f604082019050611a055f830185611861565b611a126020830184611907565b9392505050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f840112611a3a57611a39611a19565b5b8235905067ffffffffffffffff811115611a5757611a56611a1d565b5b602083019150836001820283011115611a7357611a72611a21565b5b9250929050565b5f5f5f5f5f60e08688031215611a9357611a9261179c565b5b5f611aa0888289016117c3565b9550506020611ab1888289016119a9565b94505060a0611ac288828901611953565b93505060c086013567ffffffffffffffff811115611ae357611ae26117a0565b5b611aef88828901611a25565b92509250509295509295909350565b5f604082019050611b115f830185611861565b611b1e6020830184611861565b9392505050565b5f81519050919050565b5f82825260208201905092915050565b8281835e5f83830152505050565b5f601f19601f8301169050919050565b5f611b6782611b25565b611b718185611b2f565b9350611b81818560208601611b3f565b611b8a81611b4d565b840191505092915050565b5f6020820190508181035f830152611bad8184611b5d565b905092915050565b5f6101008284031215611bcb57611bca6119a5565b5b81905092915050565b5f6101008284031215611bea57611be961179c565b5b5f611bf784828501611bb5565b91505092915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f611c2982611c00565b9050919050565b611c3981611c1f565b82525050565b5f602082019050611c525f830184611c30565b92915050565b60038110611c6957611c686118a3565b5b50565b5f819050611c7982611c58565b919050565b5f611c8882611c6c565b9050919050565b611c9881611c7e565b82525050565b5f60c082019050611cb15f830189611861565b611cbe6020830188611861565b611ccb6040830187611861565b611cd86060830186611861565b611ce56080830185611c8f565b611cf260a0830184611907565b979650505050505050565b611d0681611c1f565b8114611d10575f5ffd5b50565b5f81359050611d2181611cfd565b92915050565b5f60208284031215611d3c57611d3b61179c565b5b5f611d4984828501611d13565b91505092915050565b5f602082019050611d655f830184611c8f565b92915050565b5f602082019050611d7e5f830184611907565b92915050565b5f5f6101208385031215611d9b57611d9a61179c565b5b5f611da8858286016117c3565b9250506020611db985828601611bb5565b9150509250929050565b5f5f5f5f60608587031215611ddb57611dda61179c565b5b5f611de8878288016117c3565b9450506020611df987828801611953565b935050604085013567ffffffffffffffff811115611e1a57611e196117a0565b5b611e2687828801611a25565b925092505092959194509250565b5f819050919050565b5f611e57611e52611e4d84611c00565b611e34565b611c00565b9050919050565b5f611e6882611e3d565b9050919050565b5f611e7982611e5e565b9050919050565b611e8981611e6f565b82525050565b5f602082019050611ea25f830184611e80565b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f611edf826117a4565b9150611eea836117a4565b9250828202611ef8816117a4565b91508282048414831517611f0f57611f0e611ea8565b5b5092915050565b5f611f20826117a4565b9150611f2b836117a4565b9250828201905080821115611f4357611f42611ea8565b5b92915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601260045260245ffd5b5f611f80826117a4565b9150611f8b836117a4565b925082611f9b57611f9a611f49565b5b828204905092915050565b5f819050919050565b611fb881611fa6565b8114611fc2575f5ffd5b50565b5f81519050611fd381611faf565b92915050565b5f60208284031215611fee57611fed61179c565b5b5f611ffb84828501611fc5565b91505092915050565b61200d81611fa6565b82525050565b5f6040820190506120265f830185612004565b6120336020830184611c30565b9392505050565b61204381611889565b811461204d575f5ffd5b50565b5f8151905061205e8161203a565b92915050565b5f602082840312156120795761207861179c565b5b5f61208684828501612050565b91505092915050565b7f5175616c697479496e6465783a206d697373696e6720726f6c650000000000005f82015250565b5f6120c3601a83611b2f565b91506120ce8261208f565b602082019050919050565b5f6020820190508181035f8301526120f0816120b7565b9050919050565b5f5ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b61213182611b4d565b810181811067ffffffffffffffff821117156121505761214f6120fb565b5b80604052505050565b5f612162611793565b905061216e8282612128565b919050565b5f67ffffffffffffffff82111561218d5761218c6120fb565b5b61219682611b4d565b9050602081019050919050565b5f6121b56121b084612173565b612159565b9050828152602081018484840111156121d1576121d06120f7565b5b6121dc848285611b3f565b509392505050565b5f82601f8301126121f8576121f7611a19565b5b81516122088482602086016121a3565b91505092915050565b5f8151905061221f8161193d565b92915050565b5f5f6040838503121561223b5761223a61179c565b5b5f83015167ffffffffffffffff811115612258576122576117a0565b5b612264858286016121e4565b925050602061227585828601612211565b9150509250929050565b7f5175616c697479496e6465783a2063616c6c6572206973206e6f7420537570705f8201527f6c79436861696e00000000000000000000000000000000000000000000000000602082015250565b5f6122d9602783611b2f565b91506122e48261227f565b604082019050919050565b5f6020820190508181035f830152612306816122cd565b9050919050565b5f602082840312156123225761232161179c565b5b5f61232f84828501611953565b91505092915050565b5f82905092915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602260045260245ffd5b5f600282049050600182168061238657607f821691505b60208210810361239957612398612342565b5b50919050565b5f819050815f5260205f209050919050565b5f6020601f8301049050919050565b5f82821b905092915050565b5f600883026123fb7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff826123c0565b61240586836123c0565b95508019841693508086168417925050509392505050565b5f61243761243261242d846117a4565b611e34565b6117a4565b9050919050565b5f819050919050565b6124508361241d565b61246461245c8261243e565b8484546123cc565b825550505050565b5f5f905090565b61247b61246c565b612486818484612447565b505050565b5f5b828110156124ac576124a15f828401612473565b60018101905061248d565b505050565b601f8211156124ff57828211156124fe576124cb8161239f565b6124d4836123b1565b6124dd856123b1565b60208610156124ea575f90505b8083016124f98284038261248b565b505050505b5b505050565b5f82821c905092915050565b5f61251f5f1984600802612504565b1980831691505092915050565b5f6125378383612510565b9150826002028217905092915050565b6125518383612338565b67ffffffffffffffff81111561256a576125696120fb565b5b612574825461236f565b61257f8282856124b1565b5f601f8311600181146125ac575f841561259a578287013590505b6125a4858261252c565b86555061260b565b601f1984166125ba8661239f565b5f5b828110156125e1578489013582556001820191506020850194506020810190506125bc565b868310156125fe57848901356125fa601f891682612510565b8355505b6001600288020188555050505b5050505050505056fea2646970667358221220caf123a9e24b4d5cc53c586de719b4fa8121b4c8737265af212e3405a86faa4564736f6c63430008220033";

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

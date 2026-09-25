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
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple3;
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
public class SupplyChain extends Contract {
    public static final String BINARY = "0x608060405260016003556028600455603c60055534801561001e575f5ffd5b50604051612d73380380612d7383398181016040528101906100409190610165565b825f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508060025f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050506101b5565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6101348261010b565b9050919050565b6101448161012a565b811461014e575f5ffd5b50565b5f8151905061015f8161013b565b92915050565b5f5f5f6060848603121561017c5761017b610107565b5b5f61018986828701610151565b935050602061019a86828701610151565b92505060406101ab86828701610151565b9150509250925092565b612bb1806101c25f395ff3fe608060405234801561000f575f5ffd5b506004361061012a575f3560e01c806394eae259116100ab578063ce22d7da1161006f578063ce22d7da14610341578063d561183b14610373578063d5cb160314610391578063eae7b935146103c2578063ecb9214a146103e05761012a565b806394eae25914610275578063a6f00f2a14610291578063b32c4d8d146102c1578063b4bbb278146102f3578063c70d588d146103115761012a565b80635fa49076116100f25780635fa49076146101d15780637d18d580146101ef578063815fc9bb1461020b5780638462a7f814610227578063895c62bc146102455761012a565b80632050cc011461012e578063244d75c41461014a57806329831f5d1461016657806357c9dc75146101845780635ac44282146101a0575b5f5ffd5b61014860048036038101906101439190611e7e565b6103fc565b005b610164600480360381019061015f9190611e7e565b61061c565b005b61016e61078d565b60405161017b9190611f23565b60405180910390f35b61019e60048036038101906101999190611ff2565b6107b2565b005b6101ba60048036038101906101b59190611e7e565b610ada565b6040516101c892919061211d565b60405180910390f35b6101d9610bb7565b6040516101e69190612153565b60405180910390f35b61020960048036038101906102049190611e7e565b610bbd565b005b61022560048036038101906102209190612196565b610d2e565b005b61022f611580565b60405161023c9190612153565b60405180910390f35b61025f600480360381019061025a9190611e7e565b611586565b60405161026c9190612153565b60405180910390f35b61028f600480360381019061028a91906121d4565b61159b565b005b6102ab60048036038101906102a6919061224e565b6116e0565b6040516102b89190612153565b60405180910390f35b6102db60048036038101906102d69190611e7e565b611b3c565b6040516102ea939291906122ee565b60405180910390f35b6102fb611b8f565b6040516103089190612153565b60405180910390f35b61032b60048036038101906103269190611e7e565b611b95565b6040516103389190612323565b60405180910390f35b61035b6004803603810190610356919061233c565b611bc5565b60405161036a9392919061237a565b60405180910390f35b61037b611c43565b60405161038891906123cf565b60405180910390f35b6103ab60048036038101906103a6919061233c565b611c68565b6040516103b99291906123e8565b60405180910390f35b6103ca611ca2565b6040516103d7919061242f565b60405180910390f35b6103fa60048036038101906103f591906121d4565b611cc6565b005b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16632115e7bf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610465573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610489919061247b565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016104e49291906124b5565b602060405180830381865afa1580156104ff573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105239190612511565b610562576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161055990612596565b60405180910390fd5b813373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610601576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016105f890612624565b60405180910390fd5b42600a5f8581526020019081526020015f2081905550505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610685573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106a9919061247b565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016107049291906124b5565b602060405180830381865afa15801561071f573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107439190612511565b610782576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161077990612596565b60405180910390fd5b816005819055505050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16634af913c96040518163ffffffff1660e01b8152600401602060405180830381865afa15801561081b573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061083f919061247b565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161089a9291906124b5565b602060405180830381865afa1580156108b5573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906108d99190612511565b610918576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161090f90612596565b60405180910390fd5b853373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16146109b7576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016109ae90612624565b60405180910390fd5b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a50388a2883389898989336040518863ffffffff1660e01b8152600401610a1d97969594939291906127af565b5f604051808303815f87803b158015610a34575f5ffd5b505af1158015610a46573d5f5f3e3d5ffd5b5050505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16639d4cf7bb886040518263ffffffff1660e01b8152600401610aa49190612153565b5f604051808303815f87803b158015610abb575f5ffd5b505af1158015610acd573d5f5f3e3d5ffd5b5050505050505050505050565b610ae2611e0b565b5f60065f8481526020019081526020015f206040518060600160405290815f8201548152602001600182015f9054906101000a900461ffff1661ffff1661ffff1681526020016001820160029054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681525050915060095f8481526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050915091565b60055481565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610c26573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610c4a919061247b565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401610ca59291906124b5565b602060405180830381865afa158015610cc0573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610ce49190612511565b610d23576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610d1a90612596565b60405180910390fd5b816004819055505050565b813373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610dcd576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610dc490612624565b60405180910390fd5b5f3390508260095f8681526020019081526020015f205f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060085f8581526020019081526020015f2060405180606001604052808373ffffffffffffffffffffffffffffffffffffffff1681526020018573ffffffffffffffffffffffffffffffffffffffff16815260200142815250908060018154018082558091505060019003905f5260205f2090600302015f909190919091505f820151815f015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506020820151816001015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506040820151816002015550505f600467ffffffffffffffff811115610f5057610f4f612812565b5b604051908082528060200260200182016040528015610f7e5781602001602082028036833780820191505090505b50905084815f81518110610f9557610f9461283f565b5b60200260200101818152505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166310b0a700866103e86040518363ffffffff1660e01b8152600401610fff92919061287b565b602060405180830381865afa15801561101a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061103e91906128b6565b816001815181106110525761105161283f565b5b60200260200101818152505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166310b0a700866101f46040518363ffffffff1660e01b81526004016110bc92919061287b565b602060405180830381865afa1580156110d7573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906110fb91906128b6565b8160028151811061110f5761110e61283f565b5b60200260200101818152505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166310b0a7008660fa6040518363ffffffff1660e01b815260040161117892919061287b565b602060405180830381865afa158015611193573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906111b791906128b6565b816003815181106111cb576111ca61283f565b5b6020026020010181815250505f600467ffffffffffffffff8111156111f3576111f2612812565b5b6040519080825280602002602001820160405280156112215781602001602082028036833780820191505090505b5090505f600467ffffffffffffffff8111156112405761123f612812565b5b60405190808252806020026020018201604052801561126e5781602001602082028036833780820191505090505b5090505f5f5f90505b60048110156113b6575f60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1662fdd58e888885815181106112d1576112d061283f565b5b60200260200101516040518363ffffffff1660e01b81526004016112f69291906128e1565b602060405180830381865afa158015611311573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061133591906128b6565b90505f8111156113a8578582815181106113525761135161283f565b5b602002602001015185848151811061136d5761136c61283f565b5b6020026020010181815250508084848151811061138d5761138c61283f565b5b60200260200101818152505082806113a490612935565b9350505b508080600101915050611277565b505f811115611576575f8167ffffffffffffffff8111156113da576113d9612812565b5b6040519080825280602002602001820160405280156114085781602001602082028036833780820191505090505b5090505f8267ffffffffffffffff81111561142657611425612812565b5b6040519080825280602002602001820160405280156114545781602001602082028036833780820191505090505b5090505f5f90505b838110156114e5578581815181106114775761147661283f565b5b60200260200101518382815181106114925761149161283f565b5b6020026020010181815250508481815181106114b1576114b061283f565b5b60200260200101518282815181106114cc576114cb61283f565b5b602002602001018181525050808060010191505061145c565b5060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16632eb2c2d6888b85856040518563ffffffff1660e01b81526004016115469493929190612a47565b5f604051808303815f87803b15801561155d575f5ffd5b505af115801561156f573d5f5f3e3d5ffd5b5050505050505b5050505050505050565b60035481565b600a602052805f5260405f205f915090505481565b823373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161461163a576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161163190612624565b60405180910390fd5b6004548311801561164d57506005548210155b156116da5760025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338140c71856040518263ffffffff1660e01b81526004016116ac9190612153565b5f604051808303815f87803b1580156116c3575f5ffd5b505af11580156116d5573d5f5f3e3d5ffd5b505050505b50505050565b5f5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561174a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061176e919061247b565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016117c99291906124b5565b602060405180830381865afa1580156117e4573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906118089190612511565b611847576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161183e90612596565b60405180910390fd5b83839050868690501461188f576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161188690612af5565b60405180910390fd5b5f5f5f90505b858590508110156118d4578585828181106118b3576118b261283f565b5b90506020020135826118c59190612b13565b91508080600101915050611895565b5060035f8154809291906118e790612935565b91905055925060405180606001604052808281526020018961ffff1681526020013373ffffffffffffffffffffffffffffffffffffffff1681525060065f8581526020019081526020015f205f820151815f01556020820151816001015f6101000a81548161ffff021916908361ffff16021790555060408201518160010160026101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055509050503360095f8581526020019081526020015f205f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505f5f90505b87879050811015611aa55760075f8581526020019081526020015f2060405180604001604052808a8a85818110611a3557611a3461283f565b5b905060200201358152602001888885818110611a5457611a5361283f565b5b90506020020135815250908060018154018082558091505060019003905f5260205f2090600202015f909190919091505f820151815f015560208201518160010155505080806001019150506119fb565b5060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663f66fb5688483336040518463ffffffff1660e01b8152600401611b0493929190612b46565b5f604051808303815f87803b158015611b1b575f5ffd5b505af1158015611b2d573d5f5f3e3d5ffd5b50505050505095945050505050565b6006602052805f5260405f205f91509050805f015490806001015f9054906101000a900461ffff16908060010160029054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905083565b60045481565b6009602052805f5260405f205f915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6008602052815f5260405f208181548110611bde575f80fd5b905f5260205f2090600302015f9150915050805f015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690806001015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060020154905083565b60025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6007602052815f5260405f208181548110611c81575f80fd5b905f5260205f2090600202015f9150915050805f0154908060010154905082565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b823373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614611d65576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611d5c90612624565b60405180910390fd5b60045483118015611d7857506005548210155b15611e055760025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338140c71856040518263ffffffff1660e01b8152600401611dd79190612153565b5f604051808303815f87803b158015611dee575f5ffd5b505af1158015611e00573d5f5f3e3d5ffd5b505050505b50505050565b60405180606001604052805f81526020015f61ffff1681526020015f73ffffffffffffffffffffffffffffffffffffffff1681525090565b5f5ffd5b5f5ffd5b5f819050919050565b611e5d81611e4b565b8114611e67575f5ffd5b50565b5f81359050611e7881611e54565b92915050565b5f60208284031215611e9357611e92611e43565b5b5f611ea084828501611e6a565b91505092915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f819050919050565b5f611eeb611ee6611ee184611ea9565b611ec8565b611ea9565b9050919050565b5f611efc82611ed1565b9050919050565b5f611f0d82611ef2565b9050919050565b611f1d81611f03565b82525050565b5f602082019050611f365f830184611f14565b92915050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f840112611f5d57611f5c611f3c565b5b8235905067ffffffffffffffff811115611f7a57611f79611f40565b5b602083019150836020820283011115611f9657611f95611f44565b5b9250929050565b5f5f83601f840112611fb257611fb1611f3c565b5b8235905067ffffffffffffffff811115611fcf57611fce611f40565b5b602083019150836020820283011115611feb57611fea611f44565b5b9250929050565b5f5f5f5f5f6060868803121561200b5761200a611e43565b5b5f61201888828901611e6a565b955050602086013567ffffffffffffffff81111561203957612038611e47565b5b61204588828901611f48565b9450945050604086013567ffffffffffffffff81111561206857612067611e47565b5b61207488828901611f9d565b92509250509295509295909350565b61208c81611e4b565b82525050565b5f61ffff82169050919050565b6120a881612092565b82525050565b5f6120b882611ea9565b9050919050565b6120c8816120ae565b82525050565b606082015f8201516120e25f850182612083565b5060208201516120f5602085018261209f565b50604082015161210860408501826120bf565b50505050565b612117816120ae565b82525050565b5f6080820190506121305f8301856120ce565b61213d606083018461210e565b9392505050565b61214d81611e4b565b82525050565b5f6020820190506121665f830184612144565b92915050565b612175816120ae565b811461217f575f5ffd5b50565b5f813590506121908161216c565b92915050565b5f5f604083850312156121ac576121ab611e43565b5b5f6121b985828601611e6a565b92505060206121ca85828601612182565b9150509250929050565b5f5f5f606084860312156121eb576121ea611e43565b5b5f6121f886828701611e6a565b935050602061220986828701611e6a565b925050604061221a86828701611e6a565b9150509250925092565b61222d81612092565b8114612237575f5ffd5b50565b5f8135905061224881612224565b92915050565b5f5f5f5f5f6060868803121561226757612266611e43565b5b5f6122748882890161223a565b955050602086013567ffffffffffffffff81111561229557612294611e47565b5b6122a188828901611f9d565b9450945050604086013567ffffffffffffffff8111156122c4576122c3611e47565b5b6122d088828901611f9d565b92509250509295509295909350565b6122e881612092565b82525050565b5f6060820190506123015f830186612144565b61230e60208301856122df565b61231b604083018461210e565b949350505050565b5f6020820190506123365f83018461210e565b92915050565b5f5f6040838503121561235257612351611e43565b5b5f61235f85828601611e6a565b925050602061237085828601611e6a565b9150509250929050565b5f60608201905061238d5f83018661210e565b61239a602083018561210e565b6123a76040830184612144565b949350505050565b5f6123b982611ef2565b9050919050565b6123c9816123af565b82525050565b5f6020820190506123e25f8301846123c0565b92915050565b5f6040820190506123fb5f830185612144565b6124086020830184612144565b9392505050565b5f61241982611ef2565b9050919050565b6124298161240f565b82525050565b5f6020820190506124425f830184612420565b92915050565b5f819050919050565b61245a81612448565b8114612464575f5ffd5b50565b5f8151905061247581612451565b92915050565b5f602082840312156124905761248f611e43565b5b5f61249d84828501612467565b91505092915050565b6124af81612448565b82525050565b5f6040820190506124c85f8301856124a6565b6124d5602083018461210e565b9392505050565b5f8115159050919050565b6124f0816124dc565b81146124fa575f5ffd5b50565b5f8151905061250b816124e7565b92915050565b5f6020828403121561252657612525611e43565b5b5f612533848285016124fd565b91505092915050565b5f82825260208201905092915050565b7f537570706c79436861696e3a206d697373696e6720726f6c65000000000000005f82015250565b5f61258060198361253c565b915061258b8261254c565b602082019050919050565b5f6020820190508181035f8301526125ad81612574565b9050919050565b7f537570706c79436861696e3a2063616c6c657220646f6573206e6f7420686f6c5f8201527f6420637573746f64790000000000000000000000000000000000000000000000602082015250565b5f61260e60298361253c565b9150612619826125b4565b604082019050919050565b5f6020820190508181035f83015261263b81612602565b9050919050565b5f82825260208201905092915050565b5f819050919050565b5f63ffffffff82169050919050565b6126738161265b565b82525050565b5f612684838361266a565b60208301905092915050565b6126998161265b565b81146126a3575f5ffd5b50565b5f813590506126b481612690565b92915050565b5f6126c860208401846126a6565b905092915050565b5f602082019050919050565b5f6126e78385612642565b93506126f282612652565b805f5b8581101561272a5761270782846126ba565b6127118882612679565b975061271c836126d0565b9250506001810190506126f5565b5085925050509392505050565b5f82825260208201905092915050565b5f5ffd5b82818337505050565b5f61275f8385612737565b93507f07ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff83111561279257612791612747565b5b6020830292506127a383858461274b565b82840190509392505050565b5f60a0820190506127c25f83018a612144565b6127cf602083018961210e565b81810360408301526127e28187896126dc565b905081810360608301526127f7818587612754565b9050612806608083018461210e565b98975050505050505050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52603260045260245ffd5b6128758161265b565b82525050565b5f60408201905061288e5f830185612144565b61289b602083018461286c565b9392505050565b5f815190506128b081611e54565b92915050565b5f602082840312156128cb576128ca611e43565b5b5f6128d8848285016128a2565b91505092915050565b5f6040820190506128f45f83018561210e565b6129016020830184612144565b9392505050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f61293f82611e4b565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff820361297157612970612908565b5b600182019050919050565b5f81519050919050565b5f819050602082019050919050565b5f6129a08383612083565b60208301905092915050565b5f602082019050919050565b5f6129c28261297c565b6129cc8185612737565b93506129d783612986565b805f5b83811015612a075781516129ee8882612995565b97506129f9836129ac565b9250506001810190506129da565b5085935050505092915050565b5f82825260208201905092915050565b50565b5f612a325f83612a14565b9150612a3d82612a24565b5f82019050919050565b5f60a082019050612a5a5f83018761210e565b612a67602083018661210e565b8181036040830152612a7981856129b8565b90508181036060830152612a8d81846129b8565b90508181036080830152612aa081612a27565b905095945050505050565b7f537570706c79436861696e3a206c656e677468206d69736d61746368000000005f82015250565b5f612adf601c8361253c565b9150612aea82612aab565b602082019050919050565b5f6020820190508181035f830152612b0c81612ad3565b9050919050565b5f612b1d82611e4b565b9150612b2883611e4b565b9250828201905080821115612b4057612b3f612908565b5b92915050565b5f606082019050612b595f830186612144565b612b666020830185612144565b612b73604083018461210e565b94935050505056fea26469706673582212203438c4100a3ef6b2f68276c1b1567bfacc22fdf78557ed60fa5d06bf3e65ba8164736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_BATCHLOCATIONS = "batchLocations";

    public static final String FUNC_BATCHES = "batches";

    public static final String FUNC_CURRENTHOLDER = "currentHolder";

    public static final String FUNC_CUSTODYHISTORY = "custodyHistory";

    public static final String FUNC_GETBATCH = "getBatch";

    public static final String FUNC_HONEYTOKEN = "honeyToken";

    public static final String FUNC_MAXSAFEDURATIONMINUTES = "maxSafeDurationMinutes";

    public static final String FUNC_MAXSAFETEMPERATURECELSIUS = "maxSafeTemperatureCelsius";

    public static final String FUNC_NEXTBATCHID = "nextBatchId";

    public static final String FUNC_PROCESSANDBOTTLE = "processAndBottle";

    public static final String FUNC_QUALITYINDEX = "qualityIndex";

    public static final String FUNC_RECORDRETAILRECEIPT = "recordRetailReceipt";

    public static final String FUNC_RECORDTRANSPORTDATA = "recordTransportData";

    public static final String FUNC_RECORDWAREHOUSEDATA = "recordWarehouseData";

    public static final String FUNC_REGISTERHARVESTBATCH = "registerHarvestBatch";

    public static final String FUNC_RETAILRECEIPTTIMESTAMP = "retailReceiptTimestamp";

    public static final String FUNC_SETMAXSAFEDURATION = "setMaxSafeDuration";

    public static final String FUNC_SETMAXSAFETEMPERATURE = "setMaxSafeTemperature";

    public static final String FUNC_TRANSFERCUSTODY = "transferCustody";

    @Deprecated
    protected SupplyChain(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SupplyChain(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected SupplyChain(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected SupplyChain(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> batchLocations(BigInteger param0,
            BigInteger param1) {
        final Function function = new Function(FUNC_BATCHLOCATIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
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

    public RemoteFunctionCall<Tuple3<BigInteger, BigInteger, String>> batches(BigInteger param0) {
        final Function function = new Function(FUNC_BATCHES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint16>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, BigInteger, String>>(function,
                new Callable<Tuple3<BigInteger, BigInteger, String>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> currentHolder(BigInteger param0) {
        final Function function = new Function(FUNC_CURRENTHOLDER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple3<String, String, BigInteger>> custodyHistory(BigInteger param0,
            BigInteger param1) {
        final Function function = new Function(FUNC_CUSTODYHISTORY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<String, String, BigInteger>>(function,
                new Callable<Tuple3<String, String, BigInteger>>() {
                    @Override
                    public Tuple3<String, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple2<Batch, String>> getBatch(BigInteger batchId) {
        final Function function = new Function(FUNC_GETBATCH, 
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

    public RemoteFunctionCall<String> honeyToken() {
        final Function function = new Function(FUNC_HONEYTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> maxSafeDurationMinutes() {
        final Function function = new Function(FUNC_MAXSAFEDURATIONMINUTES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> maxSafeTemperatureCelsius() {
        final Function function = new Function(FUNC_MAXSAFETEMPERATURECELSIUS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> nextBatchId() {
        final Function function = new Function(FUNC_NEXTBATCHID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> processAndBottle(BigInteger batchId,
            List<BigInteger> jarSizesGrams, List<BigInteger> jarCounts) {
        final Function function = new Function(
                FUNC_PROCESSANDBOTTLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint32>(
                        org.web3j.abi.datatypes.generated.Uint32.class,
                        org.web3j.abi.Utils.typeMap(jarSizesGrams, org.web3j.abi.datatypes.generated.Uint32.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(jarCounts, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> qualityIndex() {
        final Function function = new Function(FUNC_QUALITYINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> recordRetailReceipt(BigInteger batchId) {
        final Function function = new Function(
                FUNC_RECORDRETAILRECEIPT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> recordTransportData(BigInteger batchId,
            BigInteger temperatureCelsius, BigInteger durationMinutes) {
        final Function function = new Function(
                FUNC_RECORDTRANSPORTDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint256(temperatureCelsius), 
                new org.web3j.abi.datatypes.generated.Uint256(durationMinutes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> recordWarehouseData(BigInteger batchId,
            BigInteger temperatureCelsius, BigInteger durationMinutes) {
        final Function function = new Function(
                FUNC_RECORDWAREHOUSEDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint256(temperatureCelsius), 
                new org.web3j.abi.datatypes.generated.Uint256(durationMinutes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> registerHarvestBatch(BigInteger harvestYear,
            List<BigInteger> standIds, List<BigInteger> locationQuantities) {
        final Function function = new Function(
                FUNC_REGISTERHARVESTBATCH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint16(harvestYear), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(standIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(locationQuantities, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> retailReceiptTimestamp(BigInteger param0) {
        final Function function = new Function(FUNC_RETAILRECEIPTTIMESTAMP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setMaxSafeDuration(BigInteger minutesValue) {
        final Function function = new Function(
                FUNC_SETMAXSAFEDURATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(minutesValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setMaxSafeTemperature(BigInteger celsius) {
        final Function function = new Function(
                FUNC_SETMAXSAFETEMPERATURE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(celsius)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> transferCustody(BigInteger batchId, String to) {
        final Function function = new Function(
                FUNC_TRANSFERCUSTODY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.Address(160, to)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static SupplyChain load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new SupplyChain(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static SupplyChain load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SupplyChain(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SupplyChain load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new SupplyChain(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SupplyChain load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new SupplyChain(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SupplyChain> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<SupplyChain> deploy(Web3j web3j, TransactionManager transactionManager,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<SupplyChain> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<SupplyChain> deploy(Web3j web3j, TransactionManager transactionManager,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

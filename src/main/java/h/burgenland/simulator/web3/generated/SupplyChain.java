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
import org.web3j.abi.datatypes.generated.Int256;
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
    public static final String BINARY = "0x608060405260016003556028600455603c60055534801561001e575f5ffd5b50604051612df9380380612df983398181016040528101906100409190610165565b825f5f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508160015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508060025f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050506101b5565b5f5ffd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6101348261010b565b9050919050565b6101448161012a565b811461014e575f5ffd5b50565b5f8151905061015f8161013b565b92915050565b5f5f5f6060848603121561017c5761017b610107565b5b5f61018986828701610151565b935050602061019a86828701610151565b92505060406101ab86828701610151565b9150509250925092565b612c37806101c25f395ff3fe608060405234801561000f575f5ffd5b506004361061012a575f3560e01c8063b32c4d8d116100ab578063cedcd73f1161006f578063cedcd73f14610357578063d561183b14610373578063d5cb160314610391578063e24abbec146103c2578063eae7b935146103de5761012a565b8063b32c4d8d14610289578063b4bbb278146102bb578063b947b055146102d9578063c70d588d146102f5578063ce22d7da146103255761012a565b80635fa49076116100f25780635fa49076146101d1578063815fc9bb146101ef5780638462a7f81461020b578063895c62bc14610229578063a6f00f2a146102595761012a565b80632050cc011461012e578063244d75c41461014a57806329831f5d1461016657806357c9dc75146101845780635ac44282146101a0575b5f5ffd5b61014860048036038101906101439190611e7e565b6103fc565b005b610164600480360381019061015f9190611e7e565b61061c565b005b61016e61078d565b60405161017b9190611f23565b60405180910390f35b61019e60048036038101906101999190611ff2565b6107b2565b005b6101ba60048036038101906101b59190611e7e565b610ada565b6040516101c892919061211d565b60405180910390f35b6101d9610bb7565b6040516101e69190612153565b60405180910390f35b61020960048036038101906102049190612196565b610bbd565b005b61021361140f565b6040516102209190612153565b60405180910390f35b610243600480360381019061023e9190611e7e565b611415565b6040516102509190612153565b60405180910390f35b610273600480360381019061026e91906121fe565b61142a565b6040516102809190612153565b60405180910390f35b6102a3600480360381019061029e9190611e7e565b611886565b6040516102b29392919061229e565b60405180910390f35b6102c36118d9565b6040516102d091906122eb565b60405180910390f35b6102f360048036038101906102ee919061232e565b6118df565b005b61030f600480360381019061030a9190611e7e565b611a24565b60405161031c919061237e565b60405180910390f35b61033f600480360381019061033a9190612397565b611a54565b60405161034e939291906123d5565b60405180910390f35b610371600480360381019061036c919061232e565b611ad2565b005b61037b611c17565b604051610388919061242a565b60405180910390f35b6103ab60048036038101906103a69190612397565b611c3c565b6040516103b9929190612443565b60405180910390f35b6103dc60048036038101906103d7919061246a565b611c76565b005b6103e6611de7565b6040516103f391906124b5565b60405180910390f35b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16632115e7bf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610465573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104899190612501565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b81526004016104e492919061253b565b602060405180830381865afa1580156104ff573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105239190612597565b610562576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016105599061261c565b60405180910390fd5b813373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610601576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016105f8906126aa565b60405180910390fd5b42600a5f8581526020019081526020015f2081905550505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610685573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106a99190612501565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161070492919061253b565b602060405180830381865afa15801561071f573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107439190612597565b610782576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016107799061261c565b60405180910390fd5b816005819055505050565b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16634af913c96040518163ffffffff1660e01b8152600401602060405180830381865afa15801561081b573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061083f9190612501565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161089a92919061253b565b602060405180830381865afa1580156108b5573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906108d99190612597565b610918576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161090f9061261c565b60405180910390fd5b853373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16146109b7576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016109ae906126aa565b60405180910390fd5b60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a50388a2883389898989336040518863ffffffff1660e01b8152600401610a1d9796959493929190612835565b5f604051808303815f87803b158015610a34575f5ffd5b505af1158015610a46573d5f5f3e3d5ffd5b5050505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16639d4cf7bb886040518263ffffffff1660e01b8152600401610aa49190612153565b5f604051808303815f87803b158015610abb575f5ffd5b505af1158015610acd573d5f5f3e3d5ffd5b5050505050505050505050565b610ae2611e0b565b5f60065f8481526020019081526020015f206040518060600160405290815f8201548152602001600182015f9054906101000a900461ffff1661ffff1661ffff1681526020016001820160029054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681525050915060095f8481526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050915091565b60055481565b813373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610c5c576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610c53906126aa565b60405180910390fd5b5f3390508260095f8681526020019081526020015f205f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060085f8581526020019081526020015f2060405180606001604052808373ffffffffffffffffffffffffffffffffffffffff1681526020018573ffffffffffffffffffffffffffffffffffffffff16815260200142815250908060018154018082558091505060019003905f5260205f2090600302015f909190919091505f820151815f015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506020820151816001015f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506040820151816002015550505f600467ffffffffffffffff811115610ddf57610dde612898565b5b604051908082528060200260200182016040528015610e0d5781602001602082028036833780820191505090505b50905084815f81518110610e2457610e236128c5565b5b60200260200101818152505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166310b0a700866103e86040518363ffffffff1660e01b8152600401610e8e929190612901565b602060405180830381865afa158015610ea9573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610ecd919061293c565b81600181518110610ee157610ee06128c5565b5b60200260200101818152505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166310b0a700866101f46040518363ffffffff1660e01b8152600401610f4b929190612901565b602060405180830381865afa158015610f66573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610f8a919061293c565b81600281518110610f9e57610f9d6128c5565b5b60200260200101818152505060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166310b0a7008660fa6040518363ffffffff1660e01b8152600401611007929190612901565b602060405180830381865afa158015611022573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190611046919061293c565b8160038151811061105a576110596128c5565b5b6020026020010181815250505f600467ffffffffffffffff81111561108257611081612898565b5b6040519080825280602002602001820160405280156110b05781602001602082028036833780820191505090505b5090505f600467ffffffffffffffff8111156110cf576110ce612898565b5b6040519080825280602002602001820160405280156110fd5781602001602082028036833780820191505090505b5090505f5f5f90505b6004811015611245575f60015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1662fdd58e888885815181106111605761115f6128c5565b5b60200260200101516040518363ffffffff1660e01b8152600401611185929190612967565b602060405180830381865afa1580156111a0573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906111c4919061293c565b90505f811115611237578582815181106111e1576111e06128c5565b5b60200260200101518584815181106111fc576111fb6128c5565b5b6020026020010181815250508084848151811061121c5761121b6128c5565b5b6020026020010181815250508280611233906129bb565b9350505b508080600101915050611106565b505f811115611405575f8167ffffffffffffffff81111561126957611268612898565b5b6040519080825280602002602001820160405280156112975781602001602082028036833780820191505090505b5090505f8267ffffffffffffffff8111156112b5576112b4612898565b5b6040519080825280602002602001820160405280156112e35781602001602082028036833780820191505090505b5090505f5f90505b8381101561137457858181518110611306576113056128c5565b5b6020026020010151838281518110611321576113206128c5565b5b6020026020010181815250508481815181106113405761133f6128c5565b5b602002602001015182828151811061135b5761135a6128c5565b5b60200260200101818152505080806001019150506112eb565b5060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16632eb2c2d6888b85856040518563ffffffff1660e01b81526004016113d59493929190612acd565b5f604051808303815f87803b1580156113ec575f5ffd5b505af11580156113fe573d5f5f3e3d5ffd5b5050505050505b5050505050505050565b60035481565b600a602052805f5260405f205f915090505481565b5f5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611494573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906114b89190612501565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b815260040161151392919061253b565b602060405180830381865afa15801561152e573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906115529190612597565b611591576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016115889061261c565b60405180910390fd5b8383905086869050146115d9576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016115d090612b7b565b60405180910390fd5b5f5f5f90505b8585905081101561161e578585828181106115fd576115fc6128c5565b5b905060200201358261160f9190612b99565b915080806001019150506115df565b5060035f815480929190611631906129bb565b91905055925060405180606001604052808281526020018961ffff1681526020013373ffffffffffffffffffffffffffffffffffffffff1681525060065f8581526020019081526020015f205f820151815f01556020820151816001015f6101000a81548161ffff021916908361ffff16021790555060408201518160010160026101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055509050503360095f8581526020019081526020015f205f6101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505f5f90505b878790508110156117ef5760075f8581526020019081526020015f2060405180604001604052808a8a8581811061177f5761177e6128c5565b5b90506020020135815260200188888581811061179e5761179d6128c5565b5b90506020020135815250908060018154018082558091505060019003905f5260205f2090600202015f909190919091505f820151815f01556020820151816001015550508080600101915050611745565b5060015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663f66fb5688483336040518463ffffffff1660e01b815260040161184e93929190612bcc565b5f604051808303815f87803b158015611865575f5ffd5b505af1158015611877573d5f5f3e3d5ffd5b50505050505095945050505050565b6006602052805f5260405f205f91509050805f015490806001015f9054906101000a900461ffff16908060010160029054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905083565b60045481565b823373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161461197e576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611975906126aa565b60405180910390fd5b6004548313801561199157506005548210155b15611a1e5760025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338140c71856040518263ffffffff1660e01b81526004016119f09190612153565b5f604051808303815f87803b158015611a07575f5ffd5b505af1158015611a19573d5f5f3e3d5ffd5b505050505b50505050565b6009602052805f5260405f205f915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6008602052815f5260405f208181548110611a6d575f80fd5b905f5260205f2090600302015f9150915050805f015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690806001015f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060020154905083565b823373ffffffffffffffffffffffffffffffffffffffff1660095f8381526020019081526020015f205f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614611b71576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611b68906126aa565b60405180910390fd5b60045483138015611b8457506005548210155b15611c115760025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338140c71856040518263ffffffff1660e01b8152600401611be39190612153565b5f604051808303815f87803b158015611bfa575f5ffd5b505af1158015611c0c573d5f5f3e3d5ffd5b505050505b50505050565b60025f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6007602052815f5260405f208181548110611c55575f80fd5b905f5260205f2090600202015f9150915050805f0154908060010154905082565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611cdf573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190611d039190612501565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166391d1485482336040518363ffffffff1660e01b8152600401611d5e92919061253b565b602060405180830381865afa158015611d79573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190611d9d9190612597565b611ddc576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401611dd39061261c565b60405180910390fd5b816004819055505050565b5f5f9054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60405180606001604052805f81526020015f61ffff1681526020015f73ffffffffffffffffffffffffffffffffffffffff1681525090565b5f5ffd5b5f5ffd5b5f819050919050565b611e5d81611e4b565b8114611e67575f5ffd5b50565b5f81359050611e7881611e54565b92915050565b5f60208284031215611e9357611e92611e43565b5b5f611ea084828501611e6a565b91505092915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f819050919050565b5f611eeb611ee6611ee184611ea9565b611ec8565b611ea9565b9050919050565b5f611efc82611ed1565b9050919050565b5f611f0d82611ef2565b9050919050565b611f1d81611f03565b82525050565b5f602082019050611f365f830184611f14565b92915050565b5f5ffd5b5f5ffd5b5f5ffd5b5f5f83601f840112611f5d57611f5c611f3c565b5b8235905067ffffffffffffffff811115611f7a57611f79611f40565b5b602083019150836020820283011115611f9657611f95611f44565b5b9250929050565b5f5f83601f840112611fb257611fb1611f3c565b5b8235905067ffffffffffffffff811115611fcf57611fce611f40565b5b602083019150836020820283011115611feb57611fea611f44565b5b9250929050565b5f5f5f5f5f6060868803121561200b5761200a611e43565b5b5f61201888828901611e6a565b955050602086013567ffffffffffffffff81111561203957612038611e47565b5b61204588828901611f48565b9450945050604086013567ffffffffffffffff81111561206857612067611e47565b5b61207488828901611f9d565b92509250509295509295909350565b61208c81611e4b565b82525050565b5f61ffff82169050919050565b6120a881612092565b82525050565b5f6120b882611ea9565b9050919050565b6120c8816120ae565b82525050565b606082015f8201516120e25f850182612083565b5060208201516120f5602085018261209f565b50604082015161210860408501826120bf565b50505050565b612117816120ae565b82525050565b5f6080820190506121305f8301856120ce565b61213d606083018461210e565b9392505050565b61214d81611e4b565b82525050565b5f6020820190506121665f830184612144565b92915050565b612175816120ae565b811461217f575f5ffd5b50565b5f813590506121908161216c565b92915050565b5f5f604083850312156121ac576121ab611e43565b5b5f6121b985828601611e6a565b92505060206121ca85828601612182565b9150509250929050565b6121dd81612092565b81146121e7575f5ffd5b50565b5f813590506121f8816121d4565b92915050565b5f5f5f5f5f6060868803121561221757612216611e43565b5b5f612224888289016121ea565b955050602086013567ffffffffffffffff81111561224557612244611e47565b5b61225188828901611f9d565b9450945050604086013567ffffffffffffffff81111561227457612273611e47565b5b61228088828901611f9d565b92509250509295509295909350565b61229881612092565b82525050565b5f6060820190506122b15f830186612144565b6122be602083018561228f565b6122cb604083018461210e565b949350505050565b5f819050919050565b6122e5816122d3565b82525050565b5f6020820190506122fe5f8301846122dc565b92915050565b61230d816122d3565b8114612317575f5ffd5b50565b5f8135905061232881612304565b92915050565b5f5f5f6060848603121561234557612344611e43565b5b5f61235286828701611e6a565b93505060206123638682870161231a565b925050604061237486828701611e6a565b9150509250925092565b5f6020820190506123915f83018461210e565b92915050565b5f5f604083850312156123ad576123ac611e43565b5b5f6123ba85828601611e6a565b92505060206123cb85828601611e6a565b9150509250929050565b5f6060820190506123e85f83018661210e565b6123f5602083018561210e565b6124026040830184612144565b949350505050565b5f61241482611ef2565b9050919050565b6124248161240a565b82525050565b5f60208201905061243d5f83018461241b565b92915050565b5f6040820190506124565f830185612144565b6124636020830184612144565b9392505050565b5f6020828403121561247f5761247e611e43565b5b5f61248c8482850161231a565b91505092915050565b5f61249f82611ef2565b9050919050565b6124af81612495565b82525050565b5f6020820190506124c85f8301846124a6565b92915050565b5f819050919050565b6124e0816124ce565b81146124ea575f5ffd5b50565b5f815190506124fb816124d7565b92915050565b5f6020828403121561251657612515611e43565b5b5f612523848285016124ed565b91505092915050565b612535816124ce565b82525050565b5f60408201905061254e5f83018561252c565b61255b602083018461210e565b9392505050565b5f8115159050919050565b61257681612562565b8114612580575f5ffd5b50565b5f815190506125918161256d565b92915050565b5f602082840312156125ac576125ab611e43565b5b5f6125b984828501612583565b91505092915050565b5f82825260208201905092915050565b7f537570706c79436861696e3a206d697373696e6720726f6c65000000000000005f82015250565b5f6126066019836125c2565b9150612611826125d2565b602082019050919050565b5f6020820190508181035f830152612633816125fa565b9050919050565b7f537570706c79436861696e3a2063616c6c657220646f6573206e6f7420686f6c5f8201527f6420637573746f64790000000000000000000000000000000000000000000000602082015250565b5f6126946029836125c2565b915061269f8261263a565b604082019050919050565b5f6020820190508181035f8301526126c181612688565b9050919050565b5f82825260208201905092915050565b5f819050919050565b5f63ffffffff82169050919050565b6126f9816126e1565b82525050565b5f61270a83836126f0565b60208301905092915050565b61271f816126e1565b8114612729575f5ffd5b50565b5f8135905061273a81612716565b92915050565b5f61274e602084018461272c565b905092915050565b5f602082019050919050565b5f61276d83856126c8565b9350612778826126d8565b805f5b858110156127b05761278d8284612740565b61279788826126ff565b97506127a283612756565b92505060018101905061277b565b5085925050509392505050565b5f82825260208201905092915050565b5f5ffd5b82818337505050565b5f6127e583856127bd565b93507f07ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff831115612818576128176127cd565b5b6020830292506128298385846127d1565b82840190509392505050565b5f60a0820190506128485f83018a612144565b612855602083018961210e565b8181036040830152612868818789612762565b9050818103606083015261287d8185876127da565b905061288c608083018461210e565b98975050505050505050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52603260045260245ffd5b6128fb816126e1565b82525050565b5f6040820190506129145f830185612144565b61292160208301846128f2565b9392505050565b5f8151905061293681611e54565b92915050565b5f6020828403121561295157612950611e43565b5b5f61295e84828501612928565b91505092915050565b5f60408201905061297a5f83018561210e565b6129876020830184612144565b9392505050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f6129c582611e4b565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82036129f7576129f661298e565b5b600182019050919050565b5f81519050919050565b5f819050602082019050919050565b5f612a268383612083565b60208301905092915050565b5f602082019050919050565b5f612a4882612a02565b612a5281856127bd565b9350612a5d83612a0c565b805f5b83811015612a8d578151612a748882612a1b565b9750612a7f83612a32565b925050600181019050612a60565b5085935050505092915050565b5f82825260208201905092915050565b50565b5f612ab85f83612a9a565b9150612ac382612aaa565b5f82019050919050565b5f60a082019050612ae05f83018761210e565b612aed602083018661210e565b8181036040830152612aff8185612a3e565b90508181036060830152612b138184612a3e565b90508181036080830152612b2681612aad565b905095945050505050565b7f537570706c79436861696e3a206c656e677468206d69736d61746368000000005f82015250565b5f612b65601c836125c2565b9150612b7082612b31565b602082019050919050565b5f6020820190508181035f830152612b9281612b59565b9050919050565b5f612ba382611e4b565b9150612bae83611e4b565b9250828201905080821115612bc657612bc561298e565b5b92915050565b5f606082019050612bdf5f830186612144565b612bec6020830185612144565b612bf9604083018461210e565b94935050505056fea2646970667358221220763176d691c95a931ae84fe2850ed8025eb5ad269dc5b82ebcc90855e164c73b64736f6c63430008220033";

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
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
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
                new org.web3j.abi.datatypes.generated.Int256(temperatureCelsius), 
                new org.web3j.abi.datatypes.generated.Uint256(durationMinutes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> recordWarehouseData(BigInteger batchId,
            BigInteger temperatureCelsius, BigInteger durationMinutes) {
        final Function function = new Function(
                FUNC_RECORDWAREHOUSEDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Int256(temperatureCelsius), 
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
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(celsius)), 
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

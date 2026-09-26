package h.burgenland.simulator.award;

import h.burgenland.simulator.common.Scaling;
import h.burgenland.simulator.lab.PinataClient;
import h.burgenland.simulator.mci.Award;
import h.burgenland.simulator.mci.MciEvaluation;
import h.burgenland.simulator.web3.ContractAddresses;
import h.burgenland.simulator.web3.generated.QualityIndex;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.gas.DefaultGasProvider;

import java.math.BigInteger;

@Service
@ConditionalOnProperty(name = {"simulator.web3.award-body-private-key", "simulator.pinata.jwt"})
public class AwardService {

    private final AwardGenerator generator;
    private final PinataClient pinataClient;
    private final Web3j web3j;
    private final ContractAddresses contractAddresses;
    private final Credentials awardBodyCredentials;

    public AwardService(AwardGenerator generator, PinataClient pinataClient, Web3j web3j,
                         ContractAddresses contractAddresses, Credentials awardBodyCredentials) {
        this.generator = generator;
        this.pinataClient = pinataClient;
        this.web3j = web3j;
        this.contractAddresses = contractAddresses;
        this.awardBodyCredentials = awardBodyCredentials;
    }

    public AwardResult submitAward(long batchId, Award force) throws Exception {
        Award award = generator.generate(force);
        BigInteger level = BigInteger.valueOf(Scaling.toContractScale(MciEvaluation.evaluateAward(award)));

        String cid = "";
        if (award != Award.NONE) {
            byte[] pdf = AwardPdf.render(batchId, award);
            cid = pinataClient.uploadPdf(pdf, "praemierung-" + batchId + ".pdf");
        }

        QualityIndex qualityIndex = QualityIndex.load(
                contractAddresses.qualityIndex(), web3j, awardBodyCredentials, new DefaultGasProvider());

        TransactionReceipt receipt = qualityIndex.submitAward(BigInteger.valueOf(batchId), level, cid).send();

        return new AwardResult(award, cid, receipt.getTransactionHash(), receipt.getGasUsed());
    }
}

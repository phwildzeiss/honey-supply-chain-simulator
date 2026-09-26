package h.burgenland.simulator.lab;

import h.burgenland.simulator.common.Scaling;
import h.burgenland.simulator.mci.MciEvaluation;
import h.burgenland.simulator.phqi.PhqiEvaluation;
import h.burgenland.simulator.phqi.model.PhqiInput;
import h.burgenland.simulator.phqi.model.PhqiScores;
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
@ConditionalOnProperty(name = {"simulator.web3.lab-private-key", "simulator.pinata.jwt"})
public class LabAnalysisService {

    private final LabReportGenerator generator;
    private final PinataClient pinataClient;
    private final Web3j web3j;
    private final ContractAddresses contractAddresses;
    private final Credentials labCredentials;

    public LabAnalysisService(LabReportGenerator generator, PinataClient pinataClient, Web3j web3j,
                               ContractAddresses contractAddresses, Credentials labCredentials) {
        this.generator = generator;
        this.pinataClient = pinataClient;
        this.web3j = web3j;
        this.contractAddresses = contractAddresses;
        this.labCredentials = labCredentials;
    }

    public LabAnalysisResult analyze(long batchId, LabReportOutcome outcome) throws Exception {
        LabReportData reportData = generator.generate(outcome);

        byte[] pdf = LabReportPdf.render(batchId, reportData);
        String cid = pinataClient.uploadPdf(pdf, "laborbefund-" + batchId + ".pdf");

        PhqiScores scores = PhqiEvaluation.evaluate(new PhqiInput(
                reportData.waterContentPercent(), reportData.hmf(), reportData.invertaseActivity(),
                reportData.naturallyEnzymeWeak()));

        QualityIndex qualityIndex = QualityIndex.load(
                contractAddresses.qualityIndex(), web3j, labCredentials, new DefaultGasProvider());

        QualityIndex.PHQIInput phqiInput = new QualityIndex.PHQIInput(
                BigInteger.valueOf(Scaling.toContractScale(scores.waterContent())),
                BigInteger.valueOf(Scaling.toContractScale(scores.hmf())),
                BigInteger.valueOf(Scaling.toContractScale(scores.invertase())),
                BigInteger.valueOf(Math.round(reportData.waterContentPercent() * 100)));

        BigInteger variety = BigInteger.valueOf(
                Scaling.toContractScale(MciEvaluation.evaluateVariety(reportData.variety())));

        TransactionReceipt receipt = qualityIndex
                .submitPHQIData(BigInteger.valueOf(batchId), phqiInput, variety, cid)
                .send();

        return new LabAnalysisResult(reportData, cid, receipt.getTransactionHash(), receipt.getGasUsed());
    }
}

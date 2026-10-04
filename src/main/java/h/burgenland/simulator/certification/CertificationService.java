package h.burgenland.simulator.certification;

import h.burgenland.simulator.common.Scaling;
import h.burgenland.simulator.common.StepTimings;
import h.burgenland.simulator.lab.PinataClient;
import h.burgenland.simulator.mci.Certification;
import h.burgenland.simulator.mci.MciEvaluation;
import h.burgenland.simulator.web3.ContractAddresses;
import h.burgenland.simulator.web3.ContractTransactions;
import h.burgenland.simulator.web3.generated.ActorRegistry;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import java.math.BigInteger;

@Service
@ConditionalOnProperty(name = {"simulator.web3.certification-body-private-key", "simulator.pinata.jwt"})
public class CertificationService {

    private final CertificationGenerator generator;
    private final PinataClient pinataClient;
    private final Web3j web3j;
    private final ContractAddresses contractAddresses;
    private final Credentials certificationBodyCredentials;
    private final ContractTransactions transactions;

    public CertificationService(CertificationGenerator generator, PinataClient pinataClient, Web3j web3j,
                                 ContractAddresses contractAddresses, Credentials certificationBodyCredentials,
                                 ContractTransactions transactions) {
        this.generator = generator;
        this.pinataClient = pinataClient;
        this.web3j = web3j;
        this.contractAddresses = contractAddresses;
        this.certificationBodyCredentials = certificationBodyCredentials;
        this.transactions = transactions;
    }

    public CertificationResult certify(String beekeeperAddress, Certification force, Certification requested) throws Exception {
        long start = System.nanoTime();
        Certification certification = force != null
                ? generator.generate(force)
                : requested != null
                    ? generator.generateFor(requested)
                    : generator.generate(null);
        BigInteger organicScore = BigInteger.valueOf(
                Scaling.toContractScale(MciEvaluation.evaluateCertification(certification)));

        ActorRegistry actorRegistry = ActorRegistry.load(
                contractAddresses.actorRegistry(), web3j, transactions.managerFor(certificationBodyCredentials),
                transactions.gasProvider());

        // The name lookup is a read call, counted as part of creating the document.
        byte[] pdf = certification != Certification.NONE
                ? CertificationPdf.render(lookupName(actorRegistry, beekeeperAddress), certification)
                : null;
        long afterRender = System.nanoTime();

        String cid = "";
        if (pdf != null) {
            cid = pinataClient.uploadPdf(pdf, "zertifikat-" + beekeeperAddress + ".pdf");
        }
        long afterUpload = System.nanoTime();

        TransactionReceipt receipt = actorRegistry.setCertification(beekeeperAddress, cid, organicScore).send();
        long end = System.nanoTime();

        return new CertificationResult(certification, cid, receipt.getTransactionHash(), receipt.getGasUsed(),
                StepTimings.of(start, afterRender, afterUpload, end));
    }

    private String lookupName(ActorRegistry actorRegistry, String beekeeperAddress) throws Exception {
        ActorRegistry.Actor actor = actorRegistry.getActor(beekeeperAddress).send();
        return actor.registered && !actor.name.isBlank() ? actor.name : "nicht registriert";
    }
}

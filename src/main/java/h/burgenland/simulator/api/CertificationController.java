package h.burgenland.simulator.api;

import h.burgenland.simulator.certification.CertificationResult;
import h.burgenland.simulator.certification.CertificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
@ConditionalOnProperty(name = {"simulator.web3.certification-body-private-key", "simulator.pinata.jwt"})
public class CertificationController {

    private final CertificationService certificationService;

    public CertificationController(CertificationService certificationService) {
        this.certificationService = certificationService;
    }

    @PostMapping("/certifications")
    public CertificationResult certifications(@RequestBody CertificationRequest request) {
        if (request.beekeeperAddress() == null || request.beekeeperAddress().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "beekeeperAddress is required");
        }
        try {
            return certificationService.certify(request.beekeeperAddress(), request.force());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Certification failed: " + e.getMessage(), e);
        }
    }
}

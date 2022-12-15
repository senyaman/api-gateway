package tech.enfint.apigateway.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.enfint.apigateway.dto.LoanApplicationRequestDTO;
import tech.enfint.apigateway.dto.LoanOfferDTO;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "application-service", url = "http://localhost:8082/application")
public interface ApplicationClient {

    @PostMapping
    ResponseEntity<List<LoanOfferDTO>> loanApplication(@Valid @RequestBody LoanApplicationRequestDTO loanApplication);

    @PutMapping("/offer")
    void updateOffer(@RequestBody LoanOfferDTO loanOffer);
}

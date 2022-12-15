package tech.enfint.apigateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.enfint.apigateway.dto.LoanApplicationRequestDTO;
import tech.enfint.apigateway.dto.LoanOfferDTO;
import tech.enfint.apigateway.service.ApplicationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/application")
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<List<LoanOfferDTO>> loanApplication(@RequestBody LoanApplicationRequestDTO loanApplication) {
        List<LoanOfferDTO> loanOffers = applicationService.loanApplication(loanApplication);
        return ResponseEntity.ok(loanOffers);
    }

    @PutMapping("/offer")
    public void updateOffer(@RequestBody LoanOfferDTO loanOffer) {
        applicationService.updateOffer(loanOffer);
    }
}

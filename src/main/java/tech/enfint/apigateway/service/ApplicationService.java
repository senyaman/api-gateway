package tech.enfint.apigateway.service;

import tech.enfint.apigateway.dto.LoanApplicationRequestDTO;
import tech.enfint.apigateway.dto.LoanOfferDTO;

import java.util.List;

public interface ApplicationService {
    List<LoanOfferDTO> loanApplication(LoanApplicationRequestDTO loanApplication);
    void updateOffer(LoanOfferDTO loanOffer);
}

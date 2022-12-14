package tech.enfint.apigateway.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.enfint.apigateway.dto.LoanApplicationRequestDTO;
import tech.enfint.apigateway.dto.LoanOfferDTO;
import tech.enfint.apigateway.feignclient.ApplicationClient;
import tech.enfint.apigateway.service.ApplicationService;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationClient applicationClient;

    @Override
    public List<LoanOfferDTO> loanApplication(LoanApplicationRequestDTO loanApplication) {
        return applicationClient.loanApplication(loanApplication).getBody();
    }

    @Override
    public void updateOffer(LoanOfferDTO loanOffer) {
        applicationClient.updateOffer(loanOffer);
    }
}

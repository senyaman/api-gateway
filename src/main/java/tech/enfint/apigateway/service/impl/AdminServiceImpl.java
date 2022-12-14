package tech.enfint.apigateway.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.enfint.apigateway.dto.ScoringDataDTO;
import tech.enfint.apigateway.entity.Application;
import tech.enfint.apigateway.feignclient.DealClient;
import tech.enfint.apigateway.service.AdminService;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final DealClient dealClient;

    @Override
    public Application getApplicationById(ScoringDataDTO scoringData, Long id) {
        return dealClient.getApplicationById(scoringData, id);
    }

    @Override
    public List<Application> getAllApplications() {
        return dealClient.getAllApplications();
    }
}

package tech.enfint.apigateway.service;

import tech.enfint.apigateway.dto.ScoringDataDTO;
import tech.enfint.apigateway.entity.Application;

import java.util.List;

public interface AdminService {
    Application getApplicationById(ScoringDataDTO scoringData, Long id);
    List<Application> getAllApplications();
}

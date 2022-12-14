package tech.enfint.apigateway.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.enfint.apigateway.dto.ScoringDataDTO;
import tech.enfint.apigateway.entity.Application;

import java.util.List;

@FeignClient(name = "deal-client", url = "http://localhost:8081/deal")
public interface DealClient {

    @PutMapping("/calculate/{applicationId}")
    Application getApplicationById(@RequestBody ScoringDataDTO scoringData, @PathVariable Long applicationId);

    @GetMapping("/deal/admin/application")
    List<Application> getAllApplications();
}

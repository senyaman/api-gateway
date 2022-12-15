package tech.enfint.apigateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.enfint.apigateway.dto.ScoringDataDTO;
import tech.enfint.apigateway.entity.Application;
import tech.enfint.apigateway.service.AdminService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/application/{applicationId}")
    public ResponseEntity<Application> getApplicationById(@RequestBody ScoringDataDTO scoringData, @PathVariable("applicationId") Long id) {
        Application application = adminService.getApplicationById(scoringData, id);
        return ResponseEntity.ok(application);
    }

    @GetMapping("/application")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> applications = adminService.getAllApplications();
        return ResponseEntity.ok(applications);
    }
}

package tech.enfint.apigateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.enfint.apigateway.utils.GenderEnum;
import tech.enfint.apigateway.utils.MaritalStatusEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoringDataDTO {
    private BigDecimal amount;
    private Integer term;
    private String firstName;
    private String lastName;
    private String middleName;
    private GenderEnum gender;
    private LocalDate birthDate;
    private String passportSeries;
    private String passportNumber;
    private LocalDate passportIssueDate;
    private String passportIssueBranch;
    private MaritalStatusEnum maritalStatus;
    private Integer dependentAmount;
    private EmploymentDTO employment;
    private String account;
    private Boolean isInsuranceEnabled;
    private Boolean isSalaryClient;
}

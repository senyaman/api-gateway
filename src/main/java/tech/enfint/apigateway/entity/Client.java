package tech.enfint.apigateway.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.enfint.apigateway.dto.EmploymentDTO;
import tech.enfint.apigateway.utils.GenderEnum;
import tech.enfint.apigateway.utils.MaritalStatusEnum;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String email;
    private GenderEnum gender;
    private MaritalStatusEnum maritalStatus;
    private Integer dependentNumber;
    private String passportSeries;
    private String passportNumber;
    private EmploymentDTO employment;
    private Application application;
    private String account;
}

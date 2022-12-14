package tech.enfint.apigateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.enfint.apigateway.utils.EmploymentStatusEnum;
import tech.enfint.apigateway.utils.PositionEnum;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentDTO {
    private EmploymentStatusEnum employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private PositionEnum position;
    private Integer workExperienceTotal;
    private Integer workExperienceCurrent;
}

package tech.enfint.apigateway.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.enfint.apigateway.dto.ApplicationStatusHistoryDTO;
import tech.enfint.apigateway.dto.LoanOfferDTO;
import tech.enfint.apigateway.utils.ApplicationStatusEnum;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Application {
    private Long id;
    private Client client;
    private Credit credit;
    private ApplicationStatusEnum status;
    private LocalDate creationDate;
    private LoanOfferDTO appliedOffer;
    private LocalDate signDate;
    private Integer sesCode;
    private List<ApplicationStatusHistoryDTO> statusHistory;
}

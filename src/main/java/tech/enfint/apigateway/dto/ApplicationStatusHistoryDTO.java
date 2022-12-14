package tech.enfint.apigateway.dto;

import lombok.Builder;
import lombok.Data;
import tech.enfint.apigateway.utils.ApplicationStatusEnum;
import tech.enfint.apigateway.utils.ChangeTypeEnum;

import java.time.LocalDateTime;

@Data
@Builder
public class ApplicationStatusHistoryDTO {

    private ApplicationStatusEnum applicationStatus;
    private LocalDateTime time;
    private ChangeTypeEnum changeType;
}

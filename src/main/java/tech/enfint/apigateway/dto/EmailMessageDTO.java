package tech.enfint.apigateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.enfint.apigateway.utils.Theme;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessageDTO {
    private Long applicationID;
    private String address;
    private Theme theme;
}

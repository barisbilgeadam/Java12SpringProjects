package com.barisd.demo.dto.repsonse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MusteriFindAllResponseDto {
    String username;
    String ad;
    String img;
}

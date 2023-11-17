package com.barisd.demo.dto.repsonse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UrunFindAllResponseDto {
    String ad;
    String marka;
    Double fiyat;
}

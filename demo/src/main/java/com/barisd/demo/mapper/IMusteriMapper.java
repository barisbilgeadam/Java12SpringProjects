package com.barisd.demo.mapper;


import com.barisd.demo.dto.repsonse.MusteriFindAllResponseDto;
import com.barisd.demo.dto.request.MusteriSaveRequestDto;
import com.barisd.demo.repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMusteriMapper {
    IMusteriMapper INSTANCE = Mappers.getMapper( IMusteriMapper.class );

    MusteriFindAllResponseDto musteriToFindAllResponseDto(Musteri musteri);

    Musteri musteriSaveRequestDtoToMusteri(MusteriSaveRequestDto dto);
}

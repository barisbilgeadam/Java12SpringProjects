package com.barisd.demo.mapper;

import com.barisd.demo.dto.request.MusteriSaveRequestDto;
import com.barisd.demo.dto.request.UrunSaveRequestDto;
import com.barisd.demo.repository.entity.Musteri;
import com.barisd.demo.repository.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUrunMapper {
    IUrunMapper INSTANCE = Mappers.getMapper( IUrunMapper.class );
    Urun urunSaveRequestDtoToUrun(UrunSaveRequestDto dto);


}

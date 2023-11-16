package com.barisd.demo.service;

import com.barisd.demo.DenemeComponent;
import com.barisd.demo.dto.repsonse.MusteriFindAllResponseDto;
import com.barisd.demo.dto.request.MusteriSaveRequestDto;
import com.barisd.demo.mapper.IMusteriMapper;
import com.barisd.demo.repository.IMusteriRepository;
import com.barisd.demo.repository.entity.Musteri;
import com.barisd.demo.utility.ServiceManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MusteriService extends ServiceManager<Musteri,Long> {
    private final IMusteriRepository repository;

    public MusteriService(IMusteriRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<Musteri> findByAd(String ad) {
        return repository.findByAd(ad);
    }

    public void saveDto(MusteriSaveRequestDto dto){
        /*Musteri m1= Musteri.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .ad(dto.getAd())
                .build();
        save(m1);*/
        save( IMusteriMapper.INSTANCE.musteriSaveRequestDtoToMusteri(dto));
    }

    public List<MusteriFindAllResponseDto> findAllResponseDtos(){
        List<MusteriFindAllResponseDto> liste=new ArrayList<>();
        findAll().forEach(musteri->{
            liste.add(
                   /* MusteriFindAllResponseDto.builder()
                            .ad(musteri.getAd())
                            .username(musteri.getUsername())
                            .img(musteri.getImg())
                    .build()*/
                    IMusteriMapper.INSTANCE.musteriToFindAllResponseDto(musteri)

            );
        });
        return liste;
    }
}

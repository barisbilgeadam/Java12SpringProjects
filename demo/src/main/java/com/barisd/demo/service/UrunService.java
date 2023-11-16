package com.barisd.demo.service;

import com.barisd.demo.dto.request.UrunSaveRequestDto;
import com.barisd.demo.mapper.IMusteriMapper;
import com.barisd.demo.mapper.IUrunMapper;
import com.barisd.demo.repository.IUrunRepository;
import com.barisd.demo.repository.entity.Musteri;
import com.barisd.demo.repository.entity.Urun;
import com.barisd.demo.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunService extends ServiceManager<Urun,Long> {
    private final IUrunRepository repository;
    public UrunService(IUrunRepository repository) {
        super(repository);
        this.repository = repository;
    }
    //Berkan
    public List<Urun> findByAd(String ad) {
        return repository.findByAd(ad);
    }

    public List<Urun> findByMarkaAndModel(String marka,String model){
        return repository.findByMarkaAndModel(marka,model);
    }

    public Urun save(UrunSaveRequestDto dto){
        return save(IUrunMapper.INSTANCE.urunSaveRequestDtoToUrun(dto));
    }

}

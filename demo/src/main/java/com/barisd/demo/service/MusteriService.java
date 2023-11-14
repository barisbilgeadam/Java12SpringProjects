package com.barisd.demo.service;

import com.barisd.demo.DenemeComponent;
import com.barisd.demo.repository.IMusteriRepository;
import com.barisd.demo.repository.entity.Musteri;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MusteriService {
    private final IMusteriRepository repository;

    private final DenemeComponent denemeComponent;

    public MusteriService(IMusteriRepository repository, DenemeComponent denemeComponent) {
        this.repository = repository;
        this.denemeComponent = denemeComponent;
    }

    public Musteri save(Musteri musteri){
        return repository.save(musteri);
    }
    public List<Musteri> findAll(){
        return repository.findAll();
    }

    public void denemeComponentKullan(){
        denemeComponent.metod1();
    }
}

package com.barisd.demo.service;

import com.barisd.demo.DenemeComponent;
import com.barisd.demo.repository.IMusteriRepository;
import com.barisd.demo.repository.entity.Musteri;
import com.barisd.demo.utility.ServiceManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
}

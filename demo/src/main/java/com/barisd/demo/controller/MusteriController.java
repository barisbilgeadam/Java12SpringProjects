package com.barisd.demo.controller;

import com.barisd.demo.repository.entity.Musteri;
import com.barisd.demo.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musteri")
@RequiredArgsConstructor
public class MusteriController {
    private final MusteriService service;
//    @GetMapping("/save")
//    public ResponseEntity<Musteri> save(String ad, String adres){
//        return ResponseEntity.ok(service.save(Musteri.builder().ad(ad).adres(adres).build()));
//    }

    @PostMapping("/save")
    public ResponseEntity<Musteri> save(String ad, String adres){
         return ResponseEntity.ok(service.save(Musteri.builder().ad(ad).adres(adres).build()));
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Musteri());
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Musteri>> findAll(){
        HttpHeaders headers=new HttpHeaders();
        headers.add("baslik","deger");
        //return ResponseEntity.ok(service.findAll());
        return new ResponseEntity<>(service.findAll(),headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/deneme",method = RequestMethod.GET,produces = "application/json")
    public String deneme(){
        return "DENEME";
    }
}

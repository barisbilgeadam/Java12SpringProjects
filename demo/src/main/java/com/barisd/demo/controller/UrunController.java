package com.barisd.demo.controller;

import com.barisd.demo.dto.request.UrunSaveRequestDto;
import com.barisd.demo.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.barisd.demo.constant.EndPoints.*;
@RestController
@RequestMapping(ROOT+URUN)
@RequiredArgsConstructor
public class UrunController {

    private final UrunService service;

    @PostMapping(SAVE)
    public ResponseEntity<String> save(UrunSaveRequestDto dto){
        service.save(dto);
        return ResponseEntity.ok("Kayıt başarılı");
    }

}

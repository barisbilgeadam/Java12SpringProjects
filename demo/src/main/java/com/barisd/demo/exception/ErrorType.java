package com.barisd.demo.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ErrorType {

    PARAMETRE_EKSIK(2001,"Parametreleri eksik girildi.",HttpStatus.BAD_REQUEST),
    KULLANICI_BULUNAMADI(1001,"Böyle bir kullanıcı sistemde kayıtlı değil", HttpStatus.NOT_FOUND);

    private int code;
    private String mesaj;
    private HttpStatus httpStatus;
}

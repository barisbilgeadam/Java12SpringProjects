package com.barisd;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ucgen implements ISekil{
    public void alanHesapla(){
        System.out.println("Ucgen alanı hesaplandı");
    }
    public void cevreHesapla(){
        System.out.println("Ucgen çevre hesaplandı");
    }
    public void kosegenHesapla(){
        System.out.println("Ucgen kosegen olmaz ki...");
    }
}

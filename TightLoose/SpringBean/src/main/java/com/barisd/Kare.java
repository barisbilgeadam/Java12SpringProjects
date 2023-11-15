package com.barisd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("kareQualifier")
public class Kare implements ISekil {
    public void alanHesapla(){
        System.out.println("Kare alanı hesaplandı");
    }
    public void cevreHesapla(){
        System.out.println("Kare çevre hesaplandı");
    }
    public void kosegenHesapla(){
        System.out.println("Kare kosegen hesaplandı");
    }
}

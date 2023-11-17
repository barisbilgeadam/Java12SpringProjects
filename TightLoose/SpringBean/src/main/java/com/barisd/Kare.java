package com.barisd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("kareQualifier")
public class Kare implements ISekil {
    public Kare() {
        System.out.println("Kare nesnesi yaratıldı.");
    }

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

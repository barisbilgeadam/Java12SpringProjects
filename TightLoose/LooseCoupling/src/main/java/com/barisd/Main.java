package com.barisd;

public class Main {
    public static void main(String[] args) {
        //var sekil=new Kare();
        var sekil=new Kare();
        var hesaplayici=new Hesaplayici(sekil);
        hesaplayici.hesapla();
    }
}
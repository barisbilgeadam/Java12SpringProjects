package com.barisd;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
// Bean çağrımında metod isimleri kullanımı:
        System.out.println(context.getBean("ad"));
        System.out.println(context.getBean("yas"));
        System.out.println(context.getBean("kisi"));
        System.out.println(context.getBean("adresEv"));
        System.out.println(context.getBean("kisiMetodCall"));
        System.out.println(context.getBean("adresliKisi"));
        System.out.println(context.getBean("adresliKisi2"));
        System.out.println(context.getBean("adresliKisi3"));

        // Bean çağrımında Class kullanma
        System.out.println("Class cagrimi:...."+context.getBean(AdresliKisi.class));
    }
}
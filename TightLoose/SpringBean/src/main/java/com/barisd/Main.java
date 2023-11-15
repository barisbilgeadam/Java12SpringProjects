package com.barisd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {

        var context= new AnnotationConfigApplicationContext(Main.class);
        context.getBean(ISekil.class).alanHesapla();
        System.out.println("---------------------");
        context.getBean(Hesaplayici.class).hesapla();

        System.out.println("--------------------------------");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
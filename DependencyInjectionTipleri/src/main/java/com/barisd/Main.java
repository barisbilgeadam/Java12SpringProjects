package com.barisd;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Dependency Injection Türleri
 * 1. Field DI - Field Injection
 *          @Autowired
 *          Ekstra bir constructor açmanıza gerek kalmaz.
 * 2. Setter DI - Setter Injection.
 *          İnjecte edilmek istenen fieldların set metodları üstüne @Autowired eklenerek yapılır.
 *
 * 3. Constructor DI - Constructor Injection
 *
 * IoC : Inversion Of Control: Kontrolün tersine çevrilmesi
 * İlk başta nesne sen yaratıyordun sen yönetiyordun.
 * Şimdi: tamamen spring yapıyor. Buna IoC denir.
 */
@Component
@RequiredArgsConstructor
class ServiceClass{
    final Dependency1 dependency1;
    final Dependency2 dependency2;

    @Override
    public String toString() {
        return "ServiceClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}





@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Main.class);
        //Spring tarafından yönetilen beanlerin listesi:
        System.out.println("-----------------------------------------");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("-----------------------------------------");

        System.out.println(context.getBean(ServiceClass.class));

    }
}
package yte.bootcamp.springcore;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
    public static void printConstructorInjection(){
        System.out.println("Ben bir const inj bean'yim");
    }
}

package yte.bootcamp.springcore;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {
    public static void printFieldInjection(){
        System.out.println("Ben bir field inj bean'yim");
    }
}

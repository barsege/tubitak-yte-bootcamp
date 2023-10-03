package yte.bootcamp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {

    ConstructorInjectionBean constructorInjectionBean;
    @Autowired
    FieldInjectionBean fieldInjectionBean;
    SetterInjectionBean setterInjectionBean;

    @Autowired
    public void setSetterInjectionBean(SetterInjectionBean setterInjectionBean){
        this.setterInjectionBean = setterInjectionBean;
    }

    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean constructorInjectionBean){
        this.constructorInjectionBean = constructorInjectionBean;
    }

    public void print(){
        fieldInjectionBean.printFieldInjection();
        setterInjectionBean.printSetterInjection();
        constructorInjectionBean.printConstructorInjection();
    }
}

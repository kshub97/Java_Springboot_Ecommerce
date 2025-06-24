package com.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.autowireAnnotation");
        Car myCar = (Car) context.getBean("car");
        myCar.display();
    }
}

package com.autowireAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("spec")   //if specification clas have any name in component that name should match here in qualifier
    //it helps to differ if we have same class name so to distinguish which one to call
    private Specification specification;


    /*//Autowire through constructor
    @Autowired
    public Car(Specification specification) {
        this.specification = specification;
    }*/

    public void display(){
        System.out.println("Car Details : " +specification.toString());
    }
}

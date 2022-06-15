package com.tekparams.opps_concepts;

public class Dog1 extends Animal1{
    public void eat(){
        System.out.println("Eating bread!!!");
    }
    public void bark(){
        System.out.println("Barking!!!");
    }
    public void work(){
        super.eat();
        bark();
        eat();
    }
}

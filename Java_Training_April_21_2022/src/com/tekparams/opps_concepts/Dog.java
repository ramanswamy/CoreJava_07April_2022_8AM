package com.tekparams.opps_concepts;

public class Dog extends Animal {
    public String color = "black";
    public void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

package com.tekparams.oops_concepts_1;

public class Emp {
    int id;
    String name;
    Address1 address;

    public Emp(int id, String name, Address1 address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void displayEmp(){
        System.out.println("Emp ID : "+id);
        System.out.println("Emp Name : "+name);
        System.out.println("Emp Address : "+address.city);
        System.out.println("Emp Address : "+address.state);
        System.out.println("Emp Address : "+address.country);
    }
}

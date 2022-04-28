package com.tekparams.basics;
import java.time.LocalDate;

 class Address {
    // Instance Variables (or) Data Members (or) Fields
    /* String DoorNo="";
    String Street1="";
    String Street2="";
    String City="";
    String State="";
    int Pin=0;
    String Country="";
    */

     String DoorNo;
     String Street1;
     String Street2;
     String City;
     String State;
     int Pin;
     String Country;

     // Default Constructor (or) No Arguments Constructor
     public Address()
     {

         this.DoorNo="D100";
         this.Street1="Gandhi Street";
         this.Street2="M.G. Road";
         this.City="Bangalore";
         this.State="Karnataka";
         this.Pin=560001;
         this.Country="India";
     }

     public Address(String DoorNo, String Street1,String Street2, String City,String State,int Pin, String Country)
     {
         this.DoorNo=DoorNo;
         this.Street1=Street1;
         this.Street2=Street2;
         this.City=City;
         this.State=State;
         this.Pin=Pin;
         this.Country=Country;
     }

    // Methods
    public void DisplayAddress(){
        System.out.println("Door No."+DoorNo);
        System.out.println("Street1 : "+Street1);
        System.out.println("Street2 :"+Street2);
        System.out.println("City :"+City);
        System.out.println("State :"+State);
        System.out.println("Pincode : "+Pin);
        System.out.println("Country :"+Country);
        System.out.println("\n");

    }
}

 class Employee {
     String EmpID="";
     String EmpName="";
     LocalDate DOB = LocalDate.of(2000,8,10);
     LocalDate DOJ = LocalDate.of(2020,07,31);
     Double Basic=0.0;
     Double HRA=0.0;
     Double PF=0.0;
     Double GrandTotal=0.0;
     Double NetSalary=0.0;

     public void DisplayEmpInfo(){
         System.out.println("EmpID : "+EmpID);
         System.out.println("Emp Name : "+EmpName);
         System.out.println("Date Of Birth :  "+DOB);
         System.out.println("Date of joining : "+ DOJ);
         System.out.println("Basic Pay : "+Basic);
         System.out.println("HRA : "+HRA);
         System.out.println("Grand Total : "+GrandTotal);
         System.out.println("Provident Fund : "+PF);
         System.out.println("Net Salary : "+NetSalary);
     }
 }

public class Main {

    public static void main(String[] args) {
	// write your code here
        String DrNum = "D300";
        String St1="Raja Street";
        String St2="Rajaji Nagar";
        String Cty="Bangalore";
        String State="Karnataka";
        int Pin = 560001;
        String Ctry="Inida";
        Address address = new Address();
        Address address2 = new Address(DrNum,St1,St2,Cty,State,Pin,Ctry);
        System.out.println(address.DoorNo);
        System.out.println(address.Street1);
        System.out.println(address.Street2);
        System.out.println(address.City);
        System.out.println(address.State);
        System.out.println(address.Pin);
        System.out.println(address.Country);

        address.DisplayAddress();

        address.DoorNo="28/36-A1";
        address.Street1="BTM 2nd Stage";
        address.Street2="Near Food world";
        address.City="Bangalore";
        address.State="Karnataka";
        address.Pin=560076;
        address.Country="India";

        Address address1 = new Address();
        address1.DoorNo="A-1003";
        address1.Street1="Ganghi street";
        address1.Street2="HSR Layout";
        address1.City="Bangalore";
        address1.State="Karnataka";
        address1.Pin=560071;
        address1.Country="India";

        address.DisplayAddress();
        address1.DisplayAddress();
        address2.DisplayAddress();

        Employee employee = new Employee();
        employee.EmpID="E001";
        employee.EmpName="Raja";
        employee.DOB=LocalDate.of(1999,07,10);
        employee.DOJ=LocalDate.of(2015,06,30);
        employee.Basic=50000.87;
        employee.HRA=employee.Basic*10/100;
        employee.GrandTotal= employee.Basic+ employee.HRA;
        employee.PF= employee.Basic*12/100;
        employee.NetSalary=employee.GrandTotal- employee.PF;
    }
}

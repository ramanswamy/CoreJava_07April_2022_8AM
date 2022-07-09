package com.tekparams.basics;
import com.tekparams.accessmodifiersdemo.Sales_Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.tekparams.collectionexamples.ArrayListExample;
import com.tekparams.collectionexamples.LinkedListExample;
import com.tekparams.oops_concepts_1.Address1;
import com.tekparams.oops_concepts_1.Emp;
import com.tekparams.opps_concepts.*;
import com.tekparams.seleniumtraining.Google;


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
     protected String EmpID="";
     protected String EmpName="";
     protected LocalDate DOB = LocalDate.of(2000,8,10);
     protected LocalDate DOJ = LocalDate.of(2020,07,31);
     protected Double Basic=0.0;
     protected Double HRA=0.0;
     protected Double PF=0.0;
     protected Double GrandTotal=0.0;
     protected Double NetSalary=0.0;

     protected void DisplayEmpInfo(){
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

 class raiseSalesInvoice extends Sales_Invoice {
     protected String invoiceNo=super.invoiceNo;
     protected LocalDate invoiceDate=super.invoiceDate;
     protected String productCode=super.productCode;
     protected String productDescription = super.productDescription;
     protected Double invoiceAmount=super.invoiceAmount;

     protected void displaySalesInvoice(){
         System.out.println("Invoice No : "+invoiceNo+"\n"+"Invoice Date :"+invoiceDate+"\n"+"Product Code :"+productCode+"\n"+"Product Description :"+productDescription+"\n"+"Invoice Amount:"+invoiceAmount);
     }


 }

public class Main  {

    private String EmpID="";
    private String EmpName="";
    private LocalDate DOB = LocalDate.of(2000,8,10);
    private LocalDate DOJ = LocalDate.of(2020,07,31);
    private Double Basic=0.0;
    private Double HRA=0.0;
    private Double PF=0.0;
    private Double GrandTotal=0.0;
    private Double NetSalary=0.0;

    private void DisplayEmpInfo(){
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


    public static void main(String[] args) {

        /*
        String DrNum = "D300";
        String St1="Raja Street";
        String St2="Rajaji Nagar";
        String Cty="Bangalore";
        String State="Karnataka";
        int Pin = 560001;
        String Ctry="Inida";
        // Default Cnstructor (or) No Arguments Constructor
        Address address = new Address();
        // Parameterized Constructor
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
        */

        /*
        // Example Private Access Modifier
        System.out.println("\n"+"Example for Private Access Modifier..."+"\n");
        Main obj = new Main();
        obj.EmpID="E001";
        obj.EmpName="Raja";
        obj.DOB=LocalDate.of(1999,07,10);
        obj.DOJ=LocalDate.of(2015,06,30);
        obj.Basic=50000.87;
        obj.HRA=obj.Basic*10/100;
        obj.GrandTotal= obj.Basic+ obj.HRA;
        obj.PF= obj.Basic*12/100;
        obj.NetSalary=obj.GrandTotal- obj.PF;
        obj.DisplayEmpInfo();

        // Example for Protected Access Modifier
        System.out.println("\n"+"Example for Protected Access Modifier..."+"\n");
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
        employee.DisplayEmpInfo();
        */

        /*
        // Example for Default Access Modifier
        System.out.println("\n"+"Example for Public Access Modifier..."+"\n");
        Payroll payroll = new Payroll();
        payroll.PayDate=LocalDate.of(2022,05,17);
        payroll.PayAmount=764763;
        payroll.PayID="P001";
        payroll.DisplayParoll();
        */

        /*
        // Example for Accessing protected data members and methods from another package
        // Example for Inheritance
        System.out.println("Example Accessing protected data members and methods from another package"+"\n");
        raiseSalesInvoice raiseSalesInvoice = new raiseSalesInvoice();
        raiseSalesInvoice.displaySalesInvoice();
        */

        /*
        // Example for public access modifier from different package
        System.out.println("\n"+"Example for public access modifier from different package"+"\n");
        purchaseorderdemo purchaseorderdemo = new purchaseorderdemo();
        purchaseorderdemo.displayPurchaseOrder();
        */

        /*
        // Types of Inheritance
        // Example for Single Inheritance
        System.out.println("Types Inheritance - Single Inheritance Example..");
        Programmer programmer = new Programmer();
        System.out.println("Salary : "+programmer.salary);
        System.out.println("Bonus : "+programmer.bonus);
        */
        /*
        // Example for Multi level Inheritance
        System.out.println("Example for Multi level Inheritance");
        Programmer p = new Programmer();
        System.out.println(p.salary);
        */

        /*
        //Example1 for Hirarichal Inheritance
        System.out.println("\nExample for Hararichal Inheritance...");
        Receivables receivables = new Receivables();
        receivables.DisplayReceivables();

        //Example2 for Hirarichal Inheritance
        System.out.println("\n\nExample for Hararichal Inheritance...");
        Payables payables = new Payables();
        payables.DisplayPayables();
        */

        /*
        // Example for Aggregation
        Circle circle = new Circle();
        Double areaOfCircle=circle.findAreaOfCircle(5);
        System.out.println("\nExample for Aggregation");
        System.out.println("Area of the circle : "+areaOfCircle);
        */
        /*
        // Another example for Aggregation
        System.out.println("Another example for Aggregation ");
        Address1 address1 =new Address1("Bangalore","Karnataka","India");
        Emp emp = new Emp(100,"Suresh",address1);
        emp.displayEmp();
        */

        /*
        // Example1 for Method Overloading by chaning no. of arguments
        System.out.println("Example1 for Method Overloading...");
        int result = Adder.add(20,30);
        System.out.println("\nThe sum for two nos. : "+result);

        int result1 = Adder.add(40,30,10);
        System.out.println("\nThe sum of three nos. : "+result1);

        // Example2 for Method Overloading by changing the data type of the parameters
        System.out.println("\nExample2 for Method Overloading...");
        Double result2 = Adder.add(30.50,20.50);
        System.out.println("The sum of two Decimal nos. : "+result);
        */

        /*
        // Example for Method Overriding - Accessing modified functionality
        System.out.println("Example for Method Overriding - Accessing modified functionality..");
        Bike bike = new Bike();
        bike.run();

        // Example for Method Overriding - Accessing existing functionality
        System.out.println("Example for Method Overriding - Accessing existing functionality");
        Vehicle vehicle = new Vehicle();
        vehicle.run();
        */

        /*
        // Example1 for super Keyword
        Dog dog = new Dog();
        System.out.println("Example1 for super keyword...");
        dog.printColor();
        */
        /*
        // Example2 for super keyword
        System.out.println("Example2 fpr super keyword");
        Dog1 dog1 = new Dog1();
        dog1.work();
        */

        /*
        // Example3 for accessing parent class constructor
        System.out.println("Example3 for parent class constructor");
        Dog2 dog2 = new Dog2();
         */

        /*
        //Example for Instance Inializer Block
        System.out.println("Example for Instance Initializer Block....");
        Bike7 b7 = new Bike7();
         */

        /*
        // Example for final variable
        System.out.println("Example for final variable");
        Bike9 bike9 = new Bike9();
        System.out.println(bike9.speedlimit);
//        bike9.run();
//        System.out.println(bike9.speedlimit);
         */

        /*
        // Example for final method
        System.out.println("Example for final method...");
        Honda honda = new Honda();
        honda.run();
        Bike10 bike10 = new Bike10();
        bike10.run();
         */

        /*
        //Example for final class
        System.out.println("Example for finnal class");
        Yamaha yamaha = new Yamaha();
        yamaha.printYamaha();
        */

        /*
        //Example for Runtime Polimorphism (Method overriding)
        System.out.println("Example for Runtime Polymorphism - Method overriding..");
        Splender splender = new Splender();
        splender.run();
         */

        /*
        //Example for Runtime Polimorphism (Method overriding)
        System.out.println("Example for Runtime Polymorphism - Method overriding..");
        Bike12 splender1 = new Splender();
        splender1.run();
        */

        /*
        //Example for Static Binding
        System.out.println("Example for static binding...");
        Dog3 dog3 = new Dog3();
        dog3.eat();

        //Example for Dynamic Binding
        System.out.println("Example for Dynamic Binding...");
        Bank bk=new Bank();
        bk = new SBI();
        bk.getRateOfInterest();
         */

        /*
        // Example for Abstract Class
        System.out.println("Example for Abstract Class...");
        Honda4 h4 = new Honda4();
        h4.run();
        */

        /*
        // Example for Interface
        System.out.println("Example for Interface...");
        A6 a6 = new A6();
        a6.print();
        a6.print1();
         */

        /*
        // Example for Collection Framework - List interface >> ArrayList class
        System.out.println("Example for Collection Framework - List interface >> ArrayList class");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ravi");
        arrayList.add("Vijay");
        arrayList.add("Ravi");
        arrayList.add("Ajay");


        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
         */

        /*
        // Example for Collection Framework - Linked List - List interface
        System.out.println("Example for Collection Framework - Linked List - List interface");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ravi");
        linkedList.add("Vijay");
        linkedList.add("Ravi");
        linkedList.add("Ajay");

        Iterator itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
         */

        // Selenium Examples
        System.out.println("Selenium Examples");
        // Open google
        Google google = new Google();
        google.setUp();

    }
}

package com.tekparams.basics;

import java.time.LocalDate;

public class Payroll {
    String PayID;
    LocalDate PayDate = LocalDate.of(2022,04,01);
    int PayAmount;

    public void DisplayParoll(){
        System.out.println("Payroll ID : "+PayID);
        System.out.println("Payroll Date : "+PayDate);
        System.out.println("Payroll Amount : "+PayAmount);

    }
}

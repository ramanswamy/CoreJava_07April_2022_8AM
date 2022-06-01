package com.tekparams.oops_concepts_1;

import com.tekparams.opps_concepts.Accounts;

public class Payables extends Accounts {
    public String SuppID = "SD001";
    public String SuppName = "ASHOK LEYLAND";
    public Double OutBalancePayables = 100000.00;

    public void DisplayPayables() {
        System.out.println("Supplier ID : " + SuppID);
        System.out.println("Supplier Name : " + SuppName);
        System.out.println("Supplier Outstanding Balance : " + OutBalancePayables);
    }
}

package com.tekparams.oops_concepts_1;

import com.tekparams.opps_concepts.Accounts;

public class Receivables extends Accounts {
    public String AccountID_Receivables=super.accountID;
    public String AccountName = super.accountName;
    public String CustID = "CD001";
    public String CustName = "TITAN";
    public Double OutBalance = 400000.00;


    public void DisplayReceivables(){
        System.out.println("Account ID : "+AccountID_Receivables);
        System.out.println("Account Name : "+AccountName);
        System.out.println("Customer ID : " + CustID);
        System.out.println("Customer Name : " + CustName);
        System.out.println("Outstanding Balance : " + OutBalance);
    }
}

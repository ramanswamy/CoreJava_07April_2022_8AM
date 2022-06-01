package com.tekparams.opps_concepts;

public class Accounts {
    protected String accountID;
    protected String accountName;
    protected String typeOfAccount;
    protected int outstandingBalance;

    protected int getOutstandingBalance(){
        System.out.println("Account ID : "+accountID);
        System.out.println("Account Name : "+accountName);
        System.out.println("Type of Account : "+typeOfAccount);
        System.out.println("Outstanding Balance : "+outstandingBalance);
        return outstandingBalance;
    }
    public Accounts(){
        this.accountID="A100";
        this.accountName="Materials account";

    }

}

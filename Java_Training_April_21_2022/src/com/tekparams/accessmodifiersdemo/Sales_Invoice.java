package com.tekparams.accessmodifiersdemo;
import java.time.LocalDate;

public class Sales_Invoice {
    protected String invoiceNo="INV001";
    protected LocalDate invoiceDate= LocalDate.of(2022,05,18);
    protected String productCode = "PR001";
    protected String productDescription = "Acer Laptop";
    protected Double invoiceAmount=50000.00;

    protected void displaySalesInvoice(){
        System.out.println("Invoice No : "+invoiceNo+"\n"+"Invoice Date :"+invoiceDate+"\n"+"Product Code :"+productCode+"\n"+"Product Description :"+productDescription+"\n"+"Invoice Amount:"+invoiceAmount);
    }

}

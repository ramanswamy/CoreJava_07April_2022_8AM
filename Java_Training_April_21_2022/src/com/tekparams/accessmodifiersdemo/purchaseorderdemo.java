package com.tekparams.accessmodifiersdemo;

import java.time.LocalDate;

public class purchaseorderdemo {
    public String purchaseOrderNo = "PO001";
    public LocalDate purchaseOrderDate = LocalDate.of(2022,05,18);
    public String productCode = "PR100";
    public String productDescription="HCL Laptop";
    public Double purchaseOrderAmount = 40000.00;

    public void displayPurchaseOrder(){
        System.out.println("PO No. "+purchaseOrderNo);
        System.out.println("PO Date. "+purchaseOrderDate);
        System.out.println("Product Code :"+productCode);
        System.out.println("Product Description :"+productDescription);
        System.out.println("Purchase Order Amount :"+purchaseOrderAmount);
    }

}

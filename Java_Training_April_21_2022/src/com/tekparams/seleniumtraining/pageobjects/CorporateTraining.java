package com.tekparams.seleniumtraining.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateTraining {
    WebElement element = null;


    public WebElement getCoporateTrainingText(WebDriver CoporateTriningDriver) {
        element = CoporateTriningDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[1]"));
    return  element;
    }
}

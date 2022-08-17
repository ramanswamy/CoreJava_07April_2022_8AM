package com.tekparams.seleniumtraining.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserDashboard {
    public WebElement UserDashboard = null;
    public WebElement element = null;

    public WebElement UserDashboardObj(WebDriver DashBoarddriver){
        //element = DashBoarddriver.findElement(By.xpath("//h2[contains(text(),\"User dashboard\")]"));
        WebDriverWait wait = new WebDriverWait(DashBoarddriver, Duration.ofSeconds(20));
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span/span[contains(text(),\"Contact Us\")]")));
        //element = HomePageDriver.findElement(By.xpath("//a/span/span[contains(text(),\"Contact Us\")]"));
        return  element;
    }

}

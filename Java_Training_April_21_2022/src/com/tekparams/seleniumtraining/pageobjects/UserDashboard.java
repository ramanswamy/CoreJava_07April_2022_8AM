package com.tekparams.seleniumtraining.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDashboard {
    public WebElement UserDashboard = null;
    public WebElement element = null;

    public WebElement UserDashboardObj(WebDriver DashBoarddriver){
        element = DashBoarddriver.findElement(By.xpath("//h2[contains(text(),\"User dashboard\")]"));
        return element;
    }

}

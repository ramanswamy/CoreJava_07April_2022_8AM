package com.tekparams.seleniumtraining.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ITTrainingCourses {
    WebElement element=null;

    public WebElement ITTrainingCoursesText(WebDriver ITTrainingCoursesDriver){

        WebDriverWait wait = new WebDriverWait(ITTrainingCoursesDriver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),\\\"Customer service -\\\")]")));
//        element=ITTrainingCoursesDriver.findElement(By.xpath("//h2"));
        return element;
    }
}

package com.tekparams.seleniumtraining.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.tekparams.seleniumtraining.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Base{
    WebElement ITTrainingCourses=null;
    WebElement WebDevelopment=null;
    WebElement RPADevelopment=null;
    WebElement CorporateTraining=null;
    WebElement ContactUs=null;
    WebElement Login = null;
    WebElement Username = null;
    WebElement Password = null;
    WebElement LoginBtn = null;

    WebElement element=null;
//    WebDriver HomePageDriver = null;
    String browserType="chrome";

    public void openAUT(WebDriver driver) {
        driver.navigate().to("https://tekparams.com");
        driver.manage().window().maximize();
    }

    public WebElement ITTrainingCourseObject(WebDriver HomePageDriver){
        element=HomePageDriver.findElement(By.xpath("//a/span[contains(text(),\"IT Training Courses\")]"));
        return element;
    }

    public WebElement CorporateTrainingObject(WebDriver HomePageDriver){
        element = HomePageDriver.findElement(By.xpath("//a/span/span[contains(text(),\"Corporate Training\")]"));
        return element;
    }

    public WebElement ContactUsObject(WebDriver HomePageDriver){
        WebDriverWait wait = new WebDriverWait(HomePageDriver, Duration.ofSeconds(20));
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span/span[contains(text(),\"Contact Us\")]")));
        //element = HomePageDriver.findElement(By.xpath("//a/span/span[contains(text(),\"Contact Us\")]"));
        return  element;
    }

    public WebElement LoginObject(WebDriver HomePageDriver){
        element=HomePageDriver.findElement(By.xpath("//a[normalize-space()='Login']"));
        return element;
    }
    public WebElement Username(WebDriver HomePageDriver){
        element = HomePageDriver.findElement(By.id("user_login_name"));
        return element;
    }
    public WebElement Password(WebDriver HomPageDriver){
        element=HomPageDriver.findElement(By.id("user_login_password"));
        return element;
    }
    public WebElement LoginBtn(WebDriver HomePageDriver){
        //element=HomePageDriver.findElement(By.xpath("//a[contains(text(),\"Login\")]"));
        element=HomePageDriver.findElement(By.xpath("//button/span[contains(text(),\"Login\")]"));
        return element;
    }
    public WebElement CheckForInvalidLogin(WebDriver HomePageDriver){
        element=HomePageDriver.findElement(By.xpath("//div[@class='mkdf-social-login-holder']//p[contains(text(),'Wrong username or password.')]"));
        return element;
    }
    public WebElement MainPage(WebDriver HomePageDriver){
        element=HomePageDriver.findElement(By.xpath("//rs-slide[1]"));
        return element;
    }
}

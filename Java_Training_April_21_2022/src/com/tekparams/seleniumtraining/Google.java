package com.tekparams.seleniumtraining;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Google {

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Raman_Dell\\Java Training\\CoreJava_07April2022_8AM\\GitHubRepository\\CoreJava_07April_2022_8AM\\Java_Training_April_21_2022\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, SECONDS);
        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        boolean isGoogleImageExist = false;
        try {
            WebElement googleImage = driver.findElement(By.xpath("//img[@alt=\"Google\"]"));
            isGoogleImageExist = googleImage.isDisplayed();
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        if (isGoogleImageExist == true){
            System.out.println("Google Image exist - PASS");
        }
        else {
            System.out.println("Gooogle Image does not exist - FAIL");
        }
    }

}

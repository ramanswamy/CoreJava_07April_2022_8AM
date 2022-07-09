package com.tekparams.seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;


public class Base {

    WebDriver driver = null;

    public WebDriver setup1(String browserType){
        switch (browserType){
            case "chrome":
            {
                System.setProperty("webdriver.chrome.driver","./BrowserDrivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                break;
            }
            case "edge":
            {
                System.setProperty("webdriver.edge.driver","./BrowserDrivers/msedgedriver.exe");
                driver = new EdgeDriver();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                break;
            }
            case "opera":
            {
                System.setProperty("webdriver.opera.driver","./BrowserDrivers/operadriver.exe");
                driver = new OperaDriver();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                break;
            }
        }
        return driver;
    }
}

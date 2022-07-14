package com.tekparams.seleniumtraining.acttiondrivers;

import com.tekparams.seleniumtraining.Base;
import com.tekparams.seleniumtraining.pageobjects.CorporateTraining;
import com.tekparams.seleniumtraining.pageobjects.HomePage;
import com.tekparams.seleniumtraining.pageobjects.ITTrainingCourses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion.*;

public class ActionDriver {
    WebDriver driver=null;
    WebElement element=null;
    String strBrowser = "edge";
    HomePage homePage = new HomePage();
    ITTrainingCourses itTrainingCourses = new ITTrainingCourses();
    CorporateTraining corporateTraining = new CorporateTraining();

    @BeforeTest
    //@Test(priority=1,groups={"SmokeTest"})
    public void setupApplication(){
        Base base = new Base();
        driver=base.setup1(strBrowser);
    }
    @Test(priority=1,groups={"SmokeTest","Regression"})
    public void openApplication(){
        setupApplication();
        homePage.openAUT(driver);
    }

    @Test (priority = 2,groups={"SmokeTest"})
    public void clickOnITTrainingCourses(){
        element=homePage.ITTrainingCourseObject(driver);
        element.click();
        element=itTrainingCourses.ITTrainingCoursesText(driver);
        String result = element.getText();
        Assert.assertEquals(result,"IT Training Courses");
//        if (result=="IT Training Courses"){
//            System.out.println("IT Training Courses page opened successfully.");
//        }
//        else{
//            System.out.println("IT Training Courses page does not exist");
//        }
    }

    @Test (priority = 3,groups = {"Regression"})
    public void clickOnCorporateTrainingObject(){
        element = homePage.CorporateTrainingObject(driver);
        element.click();
        element=corporateTraining.getCoporateTrainingText(driver);
        String strResult=element.getText();
        Assert.assertEquals(strResult,"Corporate Training");
    }

    @Test(priority=4, groups={"SmokeTest"})
    public void loginToApplication(){
        element=homePage.LoginObject(driver);
        element.click();
        element=homePage.Username(driver);
        element.sendKeys("ram");
        element=homePage.Password(driver);
        element.sendKeys("rama123");
        element=homePage.LoginBtn(driver);
        element.click();
    }

    @AfterTest
    public void cleanUp(){
        System.out.println("Clean up executed...");
    }

}

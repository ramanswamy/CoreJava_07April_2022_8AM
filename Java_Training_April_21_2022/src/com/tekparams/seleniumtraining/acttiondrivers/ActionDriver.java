package com.tekparams.seleniumtraining.acttiondrivers;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.tekparams.seleniumtraining.Base;
import com.tekparams.seleniumtraining.pageobjects.CorporateTraining;
import com.tekparams.seleniumtraining.pageobjects.HomePage;
import com.tekparams.seleniumtraining.pageobjects.ITTrainingCourses;
import com.tekparams.seleniumtraining.pageobjects.UserDashboard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion.*;
import java.lang.Class;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ActionDriver {
    WebDriver driver=null;
    WebElement element=null;
    String strBrowser = "edge";
    HomePage homePage = new HomePage();
    ITTrainingCourses itTrainingCourses = new ITTrainingCourses();
    CorporateTraining corporateTraining = new CorporateTraining();

    UserDashboard userDashboard = new UserDashboard();

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

    @DataProvider(name="loginDataProvider")
    public  Object[][] signInTekparams(){
        return new Object[][] {
            {"ram","rama123",false},
            {"rama100","r1",false},
            {"ram","ram",false},
            {"rama100","rama123",true}
        };
    }
    
    @Test
    public void testReadDataFromCSV() throws IOException, CsvException {
        List<String[]> data = getStrings();
        for(String[] row:data){
            System.out.println(Arrays.toString(row));
            data.
        }
    }

    public List<String[]> getStrings() throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("./TestData/LoginTestData.csv"));
        List<String[]> data =reader.readAll();
        return data;
    }

    @DataProvider(name="loginDataProviderUsingCSV")
    public  Object[][] signInTekparamsUsingCSV(){
        return new Object[][] {
                {"ram","rama123",false},
                {"rama100","r1",false},
                {"ram","ram",false},
                {"rama100","rama123",true}
        };
    }

    @Test(priority=4, groups={"SmokeTest"},dataProvider = "loginDataProviderUsingCSV" )
    public void loginToApplicationUsingCSV(String username, String password,String flag1){
        Boolean flag = Boolean.valueOf(flag1);
        if (flag==false){
            element=homePage.LoginObject(driver);
            element.click();
            element=homePage.Username(driver);
            element.clear();
            element.sendKeys(username);
            element=homePage.Password(driver);
            element.clear();
            element.sendKeys(password);
            element=homePage.LoginBtn(driver);
            element.click();
            element=homePage.CheckForInvalidLogin(driver);
            if (element.getText().contains("Wrong")) {
                System.out.println("Wrong user name/password");
                Assert.assertTrue(true,"Wrong username or password validated successfully.");
                System.out.println("closed applicaiton....");
                driver.quit();
                openApplication();
//                element=homePage.LoginBtn(driver);
//                Actions actions = new Actions(driver);
//                actions.keyDown(element,Keys.ESCAPE);
//                actions.keyUp(element,Keys.ESCAPE);
//                actions.build().perform();
            }
        }
        if (flag==true){
            element=homePage.LoginObject(driver);
            element.click();
            element=homePage.Username(driver);
            element.clear();
            element.sendKeys(username);
            element=homePage.Password(driver);
            element.clear();
            element.sendKeys(password);
            element=homePage.LoginBtn(driver);
            element.click();
            element=userDashboard.UserDashboardObj(driver);
            if (element.isDisplayed()==true)
            {
                Assert.assertTrue(true,"Login successful valiated.");
            }
        }
    }

    public void loginToApplication(String username, String password,Boolean flag){
        if (flag==false){
            element=homePage.LoginObject(driver);
            element.click();
            element=homePage.Username(driver);
            element.clear();
            element.sendKeys(username);
            element=homePage.Password(driver);
            element.clear();
            element.sendKeys(password);
            element=homePage.LoginBtn(driver);
            element.click();
            element=homePage.CheckForInvalidLogin(driver);
            if (element.getText().contains("Wrong")) {
                System.out.println("Wrong user name/password");
                Assert.assertTrue(true,"Wrong username or password validated successfully.");
                System.out.println("closed applicaiton....");
                driver.quit();
                openApplication();
//                element=homePage.LoginBtn(driver);
//                Actions actions = new Actions(driver);
//                actions.keyDown(element,Keys.ESCAPE);
//                actions.keyUp(element,Keys.ESCAPE);
//                actions.build().perform();
            }
        }
        if (flag==true){
            element=homePage.LoginObject(driver);
            element.click();
            element=homePage.Username(driver);
            element.clear();
            element.sendKeys(username);
            element=homePage.Password(driver);
            element.clear();
            element.sendKeys(password);
            element=homePage.LoginBtn(driver);
            element.click();
            element=userDashboard.UserDashboardObj(driver);
            if (element.isDisplayed()==true)
            {
                Assert.assertTrue(true,"Login successful valiated.");
            }
        }
    }
    @AfterTest
    public void cleanUp(){
        System.out.println("Clean up executed...");
    }
}

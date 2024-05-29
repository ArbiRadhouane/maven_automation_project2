package Day12_051324;

import Day11_0507.ReusableMethode;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Day11_0507.ReusableMethode.setupChromeDriver;

public class TestNG {
    WebDriver driver;

    @BeforeSuite
    public void setUpChromeDriver(){
        driver = setupChromeDriver();
    }//end of before suite

    @Test (priority = 1)
    public void searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        ReusableMethode.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReusableMethode.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 1
    @Test(priority = 2)
    public void captureSearchResult(){
        // click on the tools button
        ReusableMethode.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = ReusableMethode.CaptureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
    }//end of test case 2

    @AfterSuite
    public void cleanUpDriver(){
        driver.quit();
    }//end of after suite
}

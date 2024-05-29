package day13_051424;

import Day11_0507.ReusableMethode;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T3_Google_SoftAssert extends TestParent{
    @Test(priority = 1)
    public void tc001_verifyGoogleTitle(){
        //navigate to google homepage
        driver.navigate().to("https://www.google.com");
        //store the title of google page in a string variable
        String actualTitle = driver.getTitle();
        //store the expected title
        String expectedTitle = "Google";
        //use soft assert
        SoftAssert softie = new SoftAssert();
        softie.assertEquals(actualTitle,expectedTitle);
        softie.assertAll();
    }//end of test case 1
    @Test(priority = 2)
    public void tc002_searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        ReusableMethode.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReusableMethode.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 2
    @Test(priority = 3)
    public void tc003_captureSearchResult(){
        // click on the tools button
       ReusableMethode.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String actualGoogleSearchResult = ReusableMethode.CaptureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        String expectedGoogleSearchResult = "About 1,390,000,000 results (0.51 seconds)";
        //Assert the search results
        SoftAssert softie = new SoftAssert();
        softie.assertEquals(actualGoogleSearchResult,expectedGoogleSearchResult);
        softie.assertAll();
    }//end of test case 3
}

package Day14_052024;

import Day11_0507.ReusableMethode;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import day13_051424.TestParent;
import org.junit.Assert;
import org.testng.annotations.Test;

public class T1_googleSearch_Loggers extends TestParent {


        @Test(priority = 1)
        public void tc001_verifyGoogleTitle() {
            //navigate to google homepage
            driver.navigate().to("https://www.google.com");
            //store the title of google page in a string variable
            String expectedGoogleSearchResult = driver.getTitle();
            //store the expected title
            String actualGoogleSearchResult = "Google";
            //assert the two titles
            ReusableMethodes_Loggers.checkIfStringEquals(expectedGoogleSearchResult,actualGoogleSearchResult,logger);
        }//end of test case 1

        @Test(priority = 2)
        public void tc002_searchForACar() {
            //navigate to google home page
            driver.navigate().to("https://www.google.com");
            //search for a car
            ReusableMethodes_Loggers.sendKeysMethod(driver, logger,"//*[@name = 'q']", "bmw", "Google Search");
            //hit submit
            ReusableMethodes_Loggers.submitMethod(driver, logger,"//*[@name = 'btnK']", "Submit Button");
        }//end of test case 2
        @Test(priority = 3)
        public void tc003_captureSearchResult() {
            // click on the tools button
            ReusableMethodes_Loggers.clickMethod(driver,logger, "//*[@id = 'hdtb-tls']", "Tools Button");
            //store the search result into a string variable
            String actualGoogleSearchResult = ReusableMethode.CaptureText(driver, "//*[@id = 'result-stats']", "Search Result");
            String expectedGoogleSearchResult = "About 1,390,000,000 results (0.51 seconds)";
            //Assert the search results

            ReusableMethodes_Loggers.checkIfStringEquals(expectedGoogleSearchResult,actualGoogleSearchResult,logger);
        }//end of test case 3
    }



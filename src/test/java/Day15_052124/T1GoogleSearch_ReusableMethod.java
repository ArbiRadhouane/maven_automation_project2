package Day15_052124;

import Day14_052024.ReusableMethodes_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import day13_051424.TestParent;
import org.testng.annotations.Test;

public class T1GoogleSearch_ReusableMethod extends TestParent {
    @Test
    public void googleSearch() {
        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
       ReusableMethodes_Loggers.sendKeysMethod(driver, logger, "//*[@name='q']", "cars", "Search Field");
        //click on Google Search button
        ReusableMethodes_Loggers.submitMethod(driver, logger, "//*[@name='btnK']", "Search Button");
        //capture the search results
        String results = ReusableMethodes_Loggers.captureText(driver, logger, "//*[@id='result-stats']", "Search Results");
        System.out.println("My search Result is " + results);
        logger.log(LogStatus.INFO, "My search Result is " + results);
    }//end of main
}

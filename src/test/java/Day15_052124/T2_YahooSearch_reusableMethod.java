package Day15_052124;

import Day14_052024.ReusableMethodes_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import day13_051424.TestParent;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static day13_051424.TestParent.driver;
import static day13_051424.TestParent.logger;

public class T2_YahooSearch_reusableMethod extends TestParent {
    @Test
    public void yahooSearch(){
        driver.navigate().to("https://www.yahoo.com");
        //enter a keyword on search field
        ReusableMethodes_Loggers.sendKeysMethod(driver,logger,"//*[@id='ybar-sbq']","cars","yahoo Search Field");
        //click on Google Search button
        ReusableMethodes_Loggers.submitMethod(driver,logger,"//*[@id='ybar-search']","yahoo Search Button");
        //capture the search results
        String results = ReusableMethodes_Loggers.captureText(driver,logger,"//*[@class='compTitle fc-smoke']","yahoo Search Results");
        System.out.println("My search Result is " + results);
        logger.log(LogStatus.INFO,"My search Result is " + results);
    }//end of test
}

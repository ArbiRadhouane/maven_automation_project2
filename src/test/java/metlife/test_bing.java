package metlife;

import Day14_052024.ReusableMethodes_Loggers;
import day13_051424.TestParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.sql.Driver;
import java.util.logging.Logger;

import static day13_051424.TestParent.driver;
import static day13_051424.TestParent.logger;

public class test_bing extends TestParent {
    @Test(priority = 1)
    public void tc001_searchbox() {
        //declare WebDriver
        driver.navigate().to("https://www.bing.com/");
        // navigate to Bing.com
        //click on search bar and Enter the Key word "cars" on the Search bar
        ReusableMethodes_Loggers.sendKeysMethod(driver, logger, "//* [@name = 'q']", "Cars", "search box");
        //Click the search button
        ReusableMethodes_Loggers.submitMethod(driver, logger, "//*[@viewBox='0 0 25 24']", "search Button");

        //create a string to capture the search result
        ReusableMethodes_Loggers.captureText(driver, logger, "//*[@class='sb_count']", "search Result");

    }

    @Test(priority = 2)
    public void tc002_searchbox() {
        //click on more on the search result
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[@target='_self']", "more");
        //now click on My BING from the dropdown option
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[@class=' b_active']", "click on My Bing dropDown");
        //create a string and capture the message under "myProfile"
        String myProfileMessage = ReusableMethodes_Loggers.captureText(driver, logger, "//div[@class= 'myprofile-description b_canvas']", "message");
        //print out the message
        System.out.println("The message under the profile is " + myProfileMessage);
        //quit the chrome
        driver.quit();

    }

    @Test(priority = 3)
    public void tc002_travel() {
        //click on more on the search result
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//div[@class='b_sp_over_cont']", "more");
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[@id='b-scopeListItem-hotels']", "hotels");
        ReusableMethodes_Loggers.sendKeysMethod(driver, logger, "//* [@class = 'autosuggest-input ']", "New York", "NewYORK");
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[contain(@class='ms-Button-flexContainer ')]", "more");
    }
}

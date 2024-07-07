package metlife;

import Day11_0507.ReusableMethode;
import Day14_052024.ReusableMethodes_Loggers;
import day13_051424.TestParent;
import org.testng.annotations.Test;

import static day13_051424.TestParent.driver;
import static day13_051424.TestParent.logger;

public class metlife_testNG extends TestParent {
    @Test(priority = 1)
    public void tc001_metlife() {
        driver.navigate().to("https://www.metlife.com/");
        //click on sollution
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[contains(@class,'header__navigation-container-menu-item')] ", "sollution ");
        //click on insurance
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//div[@class='navigation__menu-nested-nav-legend-title font-cta-1 category active' and @aria-label='Insurance'] ", "sollution ");
        //click on Enhance Your Health Coverage
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[text()='Enhance Your Health Coverage'] ", "Enhance Your Health Coverage ");
        // click on ' me and my family'
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[text()='Me & My Family'] ", "Enhance Your Health Coverage ");
        // click on dentil insurance
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//span[text()='Dental Insurance'] ", "Enhance Your Health Coverage ");
    }
    @Test(priority = 2)
    public void tc002_capturetext() {
        // capture message
        String text = ReusableMethodes_Loggers.captureText(driver, logger, "//*[@class='supporting__copy font-body-1 font-body-3-sm font-body-1-md']", "text");
        System.out.println("Schedule: " + text);
    }
}



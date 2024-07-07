package metlife;

import Day11_0507.ReusableMethode;
import Day14_052024.ReusableMethodes_Loggers;
import day13_051424.TestParent;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static Day11_0507.ReusableMethode.CaptureText;
import static day13_051424.TestParent.driver;
import static day13_051424.TestParent.logger;

public class Action_Item5 extends TestParent {
    @Test(priority = 1)
    public void tc001_searchbox() {
        //navigate to weightwatchers website
        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
        //click on Find a Workshop
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[@class='secondaryWrapper-lMu0i']", "find workshop");
        //click on in person link
        ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[@class='buttonText-0YATk']", "person link");

        //create array list for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        //declare an array list
        zipCode.add("11220");
        zipCode.add("11219");
        zipCode.add("10306");
        //set up for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //declare and store locator as a webElement
            ReusableMethodes_Loggers.sendKeysMethod(driver, logger, "//*[@id='location-search']", zipCode.get(i), "zipcode search");
            //click on search arrow
            ReusableMethodes_Loggers.clickMethod(driver, logger, "//*[@class='rightArrow-C_sUu']", "person link");
            // select studio link by index
            if (i == 0) {
                ReusableMethodes_Loggers.clickByIndex(driver, logger, "//*[@class='linkContainer-C5n9z']", 1, "studio link 2");
            } else if (i == 1) {
                ReusableMethodes_Loggers.clickByIndex(driver, logger, "//*[@class='linkContainer-C5n9z']", 2, "studio link 3");
            } else if (i == 2) {
                ReusableMethodes_Loggers.clickByIndex(driver, logger, "//*[@class='linkContainer-C5n9z']", 0, "studio link 1");
            }//end of select studio

            //store address
            String address = ReusableMethode.CaptureText(driver, "//*[@class='address-FnT8k']", "Store Address");
            //print the address
            System.out.println("Address: " + address);
            ReusableMethode.scrollIntoView(driver, "//*[@class='title-UbUc9']", "workshops");
            //capture schedule
            String schedule = ReusableMethode.CaptureText(driver, "//*[@class='scheduleContainerMobile-ps6Rm']", "Schedule");
            System.out.println("Schedule: " + schedule);

        }//end of capture text
    }
    }//end of class
package action_item3;

import Day11_0507.ReusableMethode;
import day13_051424.TestParent;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static Day11_0507.ReusableMethode.CaptureText;
import static Day11_0507.ReusableMethode.setupChromeDriver;

public class Ai_reusable {
    public static void main(String[] args) throws InterruptedException {
        //set up chrome driver from reusable method
        WebDriver driver = setupChromeDriver();

        //create array list for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        //declare an array list
        zipCode.add("11220");
        zipCode.add("11219");
        zipCode.add("10306");

        //set up for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to weightwatchers website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //pause for 3 seconds
            Thread.sleep(3000);
            //click on Find a Workshop
           ReusableMethode.clickMethod(driver, "//*[@class='secondaryWrapper-lMu0i']", "find workshop");

            //click on in person link
           ReusableMethode.clickMethod(driver, "//*[@class='buttonText-0YATk']", "person link");

            //pause 3 seconds
            Thread.sleep(3000);

            //declare and store locator as a webElement
            ReusableMethode.sendKeysMethod(driver, "//*[@id='location-search']", zipCode.get(i), "zipcode search");

            //click on search arrow
            ReusableMethode.clickMethod(driver, "//*[@class='rightArrow-C_sUu']", "person link");

            //pause for 3 seconds
            Thread.sleep(3000);

            // select studio link by index
            if (i == 0) {
                ReusableMethode.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']", 1, "studio link 2");
            } else if (i == 1) {
               ReusableMethode.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']", 2, "studio link 3");
            } else if (i == 2) {
                ReusableMethode.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']", 0, "studio link 1");
            }//end of select studio

            // pause for 3 seconds
            Thread.sleep(3000);

            //store address
            String address = CaptureText(driver, "//*[@class='address-FnT8k']", "Store Address");
            //print the address
            System.out.println("Address: " + address);

            ReusableMethode.scrollIntoView(driver, "//*[@class='title-UbUc9']", "workshops");
            //capture schedule
            String schedule = CaptureText(driver, "//*[@class='scheduleContainerMobile-ps6Rm']", "Schedule");
            System.out.println("Schedule: " + schedule);
        }//end of capture text
           //quit driver
            driver.quit();
    }
}





package Day10_0406;

import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_actioncommand {
    public static void main(String[] args) {
        //Set up chromeOptions
        ChromeOptions options = new ChromeOptions();
//declare chrome arguments //run in incognito
        options.addArguments("Incognito");
        //run in full screen
        options.addArguments("start-maximized");
//define the driver
        WebDriver driver = new ChromeDriver(options);
//Navigate to USPS driver.navigate().to url: "https://www.usps.com");
//define Action command
        Actions mouseAction = new Actions(driver);
//hover over the Send Tab to open up the drop-down list
        try {
            WebElement sendTab = driver.findElement(By.xpath("//*[text ()=' Send' ]"));
            mouseAction.moveToElement(sendTab).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover over Send Tab " + e);
        }
//end of exception
//Click on Look up a Zip Code from the drop-down list
        try {
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click on Look up a Zip code " + e);
        }
        //end of exception
        //click on find cities by Zip Code
        try {
            WebElement findCitiesByZipCode = driver.findElement(By.xpath("//*[text ()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findCitiesByZipCode).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click on Find Cities by Zip code " + e);}
            //Enter a Zip Code
            try {
                WebElement ZipCode = driver.findElement(By.xpath("//*[Gid='tZip' ]"));
                mouseAction.moveToElement(ZipCode).sendKeys("11221").perform();
            } catch (Exception e) {
                System.out.println("Unable to enter Zip code " + e);
            }//end of exception
        }
    }

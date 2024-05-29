package Day10_0406;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_explicit {
    public static void main(String[] args) throws InterruptedException {
        //declare the chromeOptions
        ChromeOptions options = new ChromeOptions();
        //run in incognito
        options.addArguments ("start-maximized");
//define the web driver
        WebDriver driver = new ChromeDriver(options);
//declare and define your global implicit wait for all web elements driver.manage() .timeouts).implicitlyWait(Duration.ofSeconds (10));
//navigate to usps
        //navigate to usps
        driver.navigate().to("https://www.ups.com/");
        //declare explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //click on tracking
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();
        }catch (Exception e) {
            System.out.println("Unable to click on Tracking " +e);
        }//end of exception
        //click on track a package
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        }catch (Exception e) {
            System.out.println("Unable to click on Track a package " +e);
        }//end of exception
        //quit the driver
        driver.quit();
    }//end of main method
}// end of java class



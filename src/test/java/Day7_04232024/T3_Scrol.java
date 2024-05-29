package Day7_04232024;

import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.text.html.Option;

public class T3_Scrol {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions Options = new ChromeOptions();
        //add option to start it maximized
        Options.addArguments("start-maximized", "incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(Options);
        //go to micalc.com
        driver.navigate().to("https://www.mLcalc.com/");
        //wait 2 seconds
        Thread.sleep(2000);
        //define the java script executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript( "scroll (8,800)");
        //wait 2 seconds
        Thread. sleep(  2000);
       // scroll back up
      jse.executeScript( "scroll (8,-800)");
        // wait 2 seconds
        Thread.sleep( 2000);
        //scroll into the webElement, we need to define calculate button into webelement
       WebElement calcButton = driver.findElement (By.xpath ( "//*[@value ='Calculate']"));
        //scroll into view of the calculate button
        jse.executeScript (  "arguments[0].scrollIntoView(true) ;", calcButton) ;
        //wait 4 seconds
        Thread.sleep(  4000);
        driver.quit();
    }
}


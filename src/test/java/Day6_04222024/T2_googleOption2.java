package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_googleOption2 {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized", "incognito");
        //add option to start it maximized
//        options.addArguments("incognito");
        //run headless mode (code runs in the background)
//        options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //print out the header text
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();
        //print header to the console
        //System.out.println("Header is " + headerText);
        //quit the browser
        // wait 2 sec
        Thread.sleep(2000);
        driver.quit();
    }
}


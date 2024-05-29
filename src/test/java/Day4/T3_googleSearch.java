package Day4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_googleSearch {
    public static void main(String[] args) throws InterruptedException {

        //set up the chromedriver with webdrivermanager

        //define the web driver
        WebDriver driver = new ChromeDriver();
        //navigate to google page
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        //pause the code for 3 seconds
        Thread.sleep(3000);

        //quit the chrome
        //driver.quit();
    }
}

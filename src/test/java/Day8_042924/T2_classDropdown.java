package Day8_042924;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_classDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
//wait few seconds for the browser session to load up
        Thread.sleep(3000);
        //enter home value
        driver.findElement(By.xpath("//*[@id='homeval']")).sendKeys("450000");
        //enter down payment
        driver.findElement(By.xpath("//*[@id='downpayment']")).sendKeys("100000");
       //select a start month from the start month dropdown
       //click on start month dropdown
        driver.findElement (By.xpath( "//*[@name= 'param [start_month]']")).click();
        //click on dropdown value may by using xpath text)
        driver.findElement(By.xpath("//*[text='Mar']")).click();
        //click somwhere
        driver.findElement (By.xpath( "//*[@lass= 'left-cell']")).click();


    }//end of main
}//end of class

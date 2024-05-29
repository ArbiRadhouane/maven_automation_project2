package Day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_googlesearch2 {
    public static void main(String[] args) throws InterruptedException {


        //set up the chromedriver with webdrivermanager

        //define the web driver
        WebDriver driver = new ChromeDriver();
        //navigate to google page

        driver.navigate().to("https://www.google.com/");
        //type cars in search box
        ////*[@name= 'q'] for google box
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("cars");
        //click or submit the google search button
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
        //pause for 2 second
        Thread.sleep(2000);
        //store the results in a string variable
        String searchResult = driver.findElement(By.xpath(  "//*[@id = 'result-stats']")).getText();
        System.out.println( "search result is "+ searchResult);
        //split the search result using split command
        String[] searchResultArray = searchResult.split(" ");
        System.out.println("search reasult number is" + searchResult );
        //quit the chrome
        driver.quit();
    }//end of main
}

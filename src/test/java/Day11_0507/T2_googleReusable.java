package Day11_0507;

import org.openqa.selenium.WebDriver;

import static Day11_0507.ReusableMethode.setupChromeDriver;

public class T2_googleReusable {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable and set up the chrome driver
        WebDriver driver = setupChromeDriver();
        //go to google.com
        driver.navigate().to("https://www.google.com");
        //send keys from reusable methods
       ReusableMethode.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //submit using reusable methods
        ReusableMethode.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
        // click on the tools button
      ReusableMethode.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = ReusableMethode.CaptureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
        //quit the chrome browser
        driver.quit();
    }//end of main
}

package Day11_0507;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import static day13_051424.TestParent.driver;


//******************************ClickMethod**************
public class ReusableMethode {

    public static void clickMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " due to exception " + e);
        }//end of catch block
    }//end of click method
    //*********************************capture text*************************
    public static String CaptureText (WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String Result="";
        try {
          Result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + " due to exception " + e);
        }
            return Result;

}//end of catch block
     //**********************************SetUpDriver**********************
     public static WebDriver setupChromeDriver() {
            //declare and define chrome options
            ChromeOptions options = new ChromeOptions();
            //add option to start it maximized
            options.addArguments("start-maximized", "incognito");
            //pass the chrome options to the driver
            WebDriver driver = new ChromeDriver(options);
            //return driver
            return driver;
     }//end of setupdriver method
/*
         public static WebDriver setUpDriver(String url){
             ChromeOptions options = new ChromeOptions();
             options.addArguments("start-maximized", "incognito");
             WebDriver driver = new ChromeDriver(options);
             driver.navigate().to(url);
             return driver;
         }//end of setup driver
         */



     //*******************************SubmitMethod************************

     public static void submitMethod(WebDriver driver, String xpathValue, String elementName) {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         try {
             wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
         }//end of try block
         catch (Exception e) {
             System.out.println("Unable to submit on " + elementName + " due to exception " + e);
         }//end of catch block
     }//end of submit method
     //*************************************sendKeysMethod**********************
     public static void sendKeysMethod(WebDriver driver, String xpathValue, String userInput, String elementName){
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
         try {
             wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).clear();
             wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
         }//end of try block
         catch (Exception e) {
             System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
         }//end of catch block
     }//end of send keys method
    //******************** click by index*************
    public static void clickByIndex (WebDriver driver, String xpathValue,int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue))).get(indexNumber).click();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to click on " + elementName.indexOf(indexNumber) + " due to exception " + e);
        }//end of catch block
    }//end of click method
   // ***************scrolByView**************
   public static void scrollIntoView(WebDriver driver, String xpathValue, String elementName) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         try {
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
             WebElement scrollElement = By.xpath(xpathValue).findElement(driver);
         JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("arguments[0].scrollIntoView(true);",scrollElement);
       } catch (Exception e) {
           System.out.println("Unable to scroll into view " + elementName + " due to exception " + e);
       }
   }//end of scroll method
    //*********************tab**********
    public static void switchToTabByIndex(WebDriver driver, int index) {

            Set<String> tabHandle = driver.getWindowHandles();
            //store your tabs arraylist to switch to the new tab
          ArrayList<String> windowHandlesList= new ArrayList<>(tabHandle);
            driver.switchTo().window(windowHandlesList.get(index));



    }// end of tab
    public static void scrollIntoViewByPixel(WebDriver driver,String PIXEL, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PIXEL)));
            WebElement scrollElement = By.xpath(PIXEL).findElement(driver);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript( "scroll (PIXEL)");
        } catch (Exception e) {
            System.out.println("Unable to scroll into view " + elementName + " due to exception " + e);
        }
    }//end of scroll method
}//end of class
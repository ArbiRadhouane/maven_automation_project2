package Day14_052024;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class ReusableMethodes_Loggers {
    public static void clickMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to click on " + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
    }//end of click method

            public static String captureText (WebDriver driver, ExtentTest logger, String xpathValue, String elementName)
            {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                String result = "";
                try {
                    result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
                    logger.log(LogStatus.PASS, "Successfully captured text from " + elementName);
                }//end of try block
                catch (Exception e) {
                    System.out.println("Unable to capture text " + elementName + " due to exception " + e);
                    logger.log(LogStatus.FAIL, "Unable to capture text from " + elementName);
                    getScreenShot(driver, elementName, logger);
                }//end of catch block
                return result;
            }//end of capture text method

            public static void submitMethod (WebDriver driver, ExtentTest logger, String xpathValue, String elementName)
            {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
                    logger.log(LogStatus.PASS, "Successfully submitted " + elementName);
                }//end of try block
                catch (Exception e) {
                    System.out.println("Unable to submit on " + elementName + " due to exception " + e);
                    logger.log(LogStatus.FAIL, "Unable to submit " + elementName);
                    getScreenShot(driver, elementName, logger);
                }//end of catch block
            }//end of submit method

            public static void sendKeysMethod (WebDriver driver, ExtentTest logger, String xpathValue, String
            userInput, String elementName){
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).clear();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
                    logger.log(LogStatus.PASS, "Successfully entered text on " + elementName);
                }//end of try block
                catch (Exception e) {
                    System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
                    logger.log(LogStatus.FAIL, "Unable to send keys on " + elementName);
                    getScreenShot(driver, elementName, logger);
                }//end of checkString
            }//end of catch block

            public static void checkIfStringEquals (String expectedText, String actualText, ExtentTest logger){
                if (expectedText.equals(actualText)) {
                    logger.log(LogStatus.PASS, "Expected Text " + expectedText + " Matches " + actualText);

                } else {
                    logger.log(LogStatus.FAIL, "Expected Text " + expectedText + " does not match " + actualText);
                }

            }//end of send keys method
            //************capture screenshot when logger fails***********
            public static void getScreenShot (WebDriver driver, String imageName, ExtentTest logger){
                try {
                    String fileName = imageName + ".png";
                    String directory = null;
                    String snPath = null;
                    directory = "src/main/java/HTML_Report/Screenshots/";
                    snPath = "Screenshots//";
                    File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(sourceFile, new File(directory + fileName));
                    //String imgPath = directory + fileName;
                    String image = logger.addScreenCapture(snPath + fileName);
                    logger.log(LogStatus.FAIL, "", image);
                } catch (Exception e) {
                    logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!! " + e);
                }//end of exception
            }//end of get screenshot method
    //******************** click by index*************
    public static void clickByIndex (WebDriver driver, ExtentTest logger, String xpathValue,int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue))).get(indexNumber).click();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to click on " + elementName.indexOf(indexNumber) + " due to exception " + e);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
    }//end of click method

        }//end of class



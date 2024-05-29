package Day9_043024;

import com.google.common.cache.Cache;
import netscape.javascript.JSException;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class action_item5 {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator site
        driver.navigate().to("https://www.statefarm.com/");
        //policyStart, firstName, lastName, streetAdd, dob, coirstName, colastName
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11219");
        zipCode.add("11220");
        ArrayList<String> policyStart = new ArrayList<>();
        policyStart.add("06/30/2024");
        policyStart.add("06/17/2024");
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Salah");
        firstName.add("Samiha");
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Arbi");
        lastName.add("chowdhury");
        ArrayList<String> streetaddress = new ArrayList<>();
        streetaddress.add("414 BAY RIDGE AVE");
        streetaddress.add("902 41ST STREET");
        ArrayList<String> dob = new ArrayList<>();
        dob.add("03/17/1995");
        dob.add("11/27/1995");
        ArrayList<String> cofirstName = new ArrayList<>();
        cofirstName.add("Aymen");
        cofirstName.add("Hassan");
        ArrayList<String> CoLastName = new ArrayList<>();
        CoLastName.add("Arbi");
        CoLastName.add("Arbi");
        for (int i = 0; i < 2; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='Get a Quote']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on get a quot" + e);
            }
            //select a  from quot dropdown
            try {
                WebElement Product = driver.findElement(By.xpath(" //*[@name= 'productName']"));
                //call the select function to select the start month
                Select Dropdown = new Select(Product);
                //select Homeowners by visible text
                Dropdown.selectByVisibleText("Homeowners");
            } catch (Exception e) {
                System.out.println("Unable to select Homeouners " + e);
            }
            try {

                // write zip code
                driver.findElement(By.xpath("//*[@name='zipCode']")).sendKeys(zipCode.get(i));

            } catch (Exception e) {
                    System.out.println("unable to write zip code " + e);
                }
                //click on Start a quote
                    try {
                driver.findElement(By.xpath("//*[text()='Start a quote']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on start a quote " + e);
            }
                    Thread.sleep(2000);
            //  policy start date
            try {
                WebElement policydate = driver.findElement(By.xpath("//*[@id='effectiveDate']"));
                //clear the home value field
                policydate.clear();
                //enter policy date in the home value field
                policydate.sendKeys(policyStart.get(i));
            } catch (Exception e) {
                System.out.println("unable to add policy " + e);
            }
            Thread.sleep(2000);
            //Enter first name
            try {
                driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(i));
            } catch (Exception e) {
                System.out.println("unable to add first name  " + e);
            }
            Thread.sleep(2000);
            //Enter last name
            try {
                driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastName.get(i));
            } catch (Exception e) {
                System.out.println("unable to add last name  " + e);
            }

            //Enter a valid street address
            try {
                driver.findElement(By.xpath("//*[@id='street']")).sendKeys(streetaddress.get(i));
            } catch (Exception e) {
                System.out.println("unable to add street address  " + e);
            }
            //Enter date of birth format: mm/dd/yyyy
            try {
                WebElement homevalue = driver.findElement(By.xpath("//*[@id='dateOfBirth']"));
                //clear the home value field
                homevalue .clear();
                //enter value in the dob field
               homevalue.sendKeys(dob.get(i));
            } catch (Exception e) {
                System.out.println("unable to add dob  " + e);
            }
            Thread.sleep(2000);
            //Scroll down using JavaScriptExecutor
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                WebElement continuebutton = driver.findElement(By.xpath("//*[@name='continue']"));
                //scroll into view of the continue button and click on it

                jse.executeScript("arguments[0].scrollIntoView(true);", continuebutton);
                continuebutton.click();
            } catch (Exception e) {
                System.out.println("unable to click on continue button  " + e);

            }
            //Click on Continue again
            try {
                driver.findElement(By.xpath("//*[@id='continue']")).click();

            } catch (Exception e) {
                System.out.println("unable to click on 2nd continue button   " + e);
            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id='continue']")).click();

            } catch (Exception e) {
                System.out.println("unable to click on 3rd continue button   " + e);
            }
            Thread.sleep(2000);
            try {
            //Select value for Fire Protection from the dropdown
            WebElement fireProtection = driver.findElement(By.xpath(" //*[@id= 'fireProtectionAreaNameSelectId']"));
            Thread.sleep(20000);
            //call the select function to select the fireprotection
            Select Dropdown = new Select(fireProtection);
            //select fireProtection by visible text
            Dropdown.selectByVisibleText("BROOKLYN");
        } catch (Exception e) {
            System.out.println("Unable to select fireProtection " + e);
        }
            Thread.sleep(2000);
            //click on continue
            try {
                driver.findElement(By.xpath("//*[@id='continue']")).click();

            } catch (Exception e) {
                System.out.println("unable to click on 3rd continue button   " + e);
            }
            Thread.sleep(2000);
           //Capture the personal info messages and print it out
            try {
            WebElement PersonalInfo =driver.findElement(By.xpath("//*[@class='sfx-pageDescription']"));
            System.out.println("personal info message : " + PersonalInfo.getText());
            } catch (Exception e) {
                System.out.println("unable to print PersonalInformation" );
            }
          //Capture email info messages and print it out
            try {
            WebElement EmailInfo=driver.findElement(By.xpath("//*[@class='help-block']"));
            System.out.println("EmailInfo is " + EmailInfo.getText());
    } catch (Exception e) {
        System.out.println("unable to print email message" );}
          //Capture add an applicant info messages and print it out
            try {
            WebElement AddApplicantMessage=driver.findElement(By.xpath("//*[@id='addApplicantDescription']"));
            System.out.println("AddApplicant message is " + AddApplicantMessage.getText());
            } catch (Exception e) {
                System.out.println("unable to print AddApplicant Information" );}
            Thread.sleep(5000);
            //addApplicantModuleNewAdd
            //Click on Add Co Applicant
                try {
            driver.findElement(By.xpath("//*[@id='addApplicantModuleNewAdd']")).click();
                } catch (Exception e) {
                    System.out.println("unable to click on AddApplicant button" );}
                Thread.sleep(2000);
            //Enter co applicant first name
                try {
            driver.findElement(By.xpath("//*[@//*[contain(@id='sfx_additionalApplicants')]")).sendKeys(cofirstName.get(i));

                } catch (Exception e) {
                    System.out.println("unable to Add co Applicant First name Information" );}
                Thread.sleep(2000);
                //Enter co applicant last name
            try {
                driver.findElement(By.xpath("//*[contain(@id='sfx_additionalApplicants')]")).sendKeys(CoLastName.get(i));;

            } catch (Exception e) {
                System.out.println("unable to Add co Applicant lastName name Information" );}
         // Click on continue
            driver.findElement(By.xpath("//*[@id='continue']")).click();
        }
    }
}
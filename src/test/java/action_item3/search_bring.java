package action_item3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class search_bring {

        public static void main(String[] args) throws InterruptedException {
            //declare WebDriver
            WebDriver webdriver = new ChromeDriver();
            // navigate to Bing.com
            webdriver.get("https://www.bing.com/");
            //wait for 3 seconds
            Thread.sleep(  3000);
            //click on search bar and Enter the Key word "cars" on the Search bar
            webdriver. findElement (By. xpath (  "//* [@name = 'q']")).sendKeys (  "Cars");
            //Click the search button
            webdriver .findElement (By.xpath(  "//*[@viewBox='0 0 25 24']")).submit();
            //pause for 2 seconds
            Thread.sleep(  2000) ;
            //create a string to capture the search result
            String SearchResult = webdriver. findElement (By. xpath( "//*[@class='sb_count']")) .getText();

            //split the message
            String[] SearchResultArray = SearchResult.split(" ");
            // print the search result
            System.out.println("search result is " + SearchResultArray[1]);
            //click on more on the search result
            webdriver.findElement (By.xpath(  "//*[@target='_self']")) .click();
            //now click on My BING from the dropdown option
            webdriver. findElement (By .xpath(  "//*[@h='ID=SERP,5042.1']")) .click();
           //now wait about 2 seconds
            Thread.sleep(  2000);
            //create a string and capture the message under "myProfile"
           String myProfileMessage = webdriver.findElement (By.xpath(  "//*[@class= 'myprofile-description b_canvas']")) .getText();
            //print out the message
            System.out .println("The message under the profile is " + myProfileMessage);
            //quit the chrome
           webdriver.quit();

             }
           }//end of class



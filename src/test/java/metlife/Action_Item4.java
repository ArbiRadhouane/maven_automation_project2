package metlife;

import Day11_0507.ReusableMethode;
import day13_051424.TestParent;
import org.testng.annotations.Test;
public class Action_Item4 extends TestParent {
    // Test Case1:
    // •Navigate to https://www.fideliscare.org/

    @Test
    public void tc001_FidelisCareNumber() {
        driver.navigate().to("https://www.fideliscare.org/");
        // •Click on search element on top right
        ReusableMethode.clickMethod(driver, "//*[@class = 'fal fa-search'] ", "Search Button");
        // •Enter get dental coverage on the search
        ReusableMethode.sendKeysMethod(driver, "//*[@class = 'form-control search-input']", "Fidelis Care Member", " Search Box");
        //•Click on search icon
        ReusableMethode.clickMethod(driver, "//*[@class = 'btn btn-primary btn-search']", "search icon");
        //•Capture the search results
        String SearchResult = ReusableMethode.CaptureText(driver, "//*[@class= 'gsc-result-info']", "Search Result");
        //•Split and only print the search number
        String[] SplitMessage = SearchResult.split(" ");
        System.out.println("the Result is" + SplitMessage[1]);
        //•Click on Get General Coverage link
        ReusableMethode.clickMethod(driver, "//a[@class = 'gs-title']", "Fidelis Care Member");
    }
    @Test
    public void tc002_Test2() {
        //switch to new tab
        ReusableMethode.switchToTabByIndex(driver,1);
        //click on Renew Your Coverage
        ReusableMethode.clickMethod(driver,"//*[normalize-space()='Renewal Help']", "Click on renewal Help");
        //click on "when do you need to renew your coverage"
        ReusableMethode.clickMethod(driver,"//*[normalize-space()='When do you need to renew your coverage?']", "Click on renew your cov");
        //capture text on "When do you need to renew your coverage"
        String results =ReusableMethode.CaptureText(driver,"//div[@class='accordion-body']","Capture results 1");
        System.out.println(results);
        //click on "what info do you need to renewal coverage"
        ReusableMethode.clickMethod(driver,"//*[normalize-space()='What information do you need to renew your coverage?']", "Click on what info?");
        //capture text on "What info needed for coverage?"
        String results2 = ReusableMethode.CaptureText(driver,"(//div[@class='accordion-body'])[2]","Capture results 2");
        System.out.println(results2);
    }// end of test case two

    @Test
    public void tc003_thirdTC() throws InterruptedException {
        //switch back to default tab
        ReusableMethode.switchToTabByIndex(driver,0);
        //click on log in
        ReusableMethode.clickMethod(driver,"(//a[@class='dropdown-toggle'])[1]","Click Login");
        //click on member online portal
        Thread.sleep(2000);
      //  ReusableMethode.clickByIndex(driver,"//h4[@class='link-external']",1,"Click Member Online Portal");
        //switch to new tab
      //  ReusableMethode.switchToTabByIndex(driver,2);
        //capture message helpful hints
      //  String results = ReusableMethode.CaptureText(driver,"(//div[@class='body-copy sm'])","Print helpful hints message");
      //  System.out.println(results);
        driver.close();
    }
    }


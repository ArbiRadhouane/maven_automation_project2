package metlife;

import Day11_0507.ReusableMethode;
import Day14_052024.ReusableMethodes_Loggers;
import day13_051424.TestParent;
import org.testng.annotations.Test;

public class ActionItem_3logger extends TestParent {
    @Test
    public void tc001_FidelisCareNumber() {
        driver.navigate().to("https://www.fideliscare.org/");
        // •Click on search element on top right
        ReusableMethodes_Loggers.clickMethod(driver,logger, "//*[@class = 'fal fa-search'] ", "Search Button");
        // •Enter get dental coverage on the search
        ReusableMethodes_Loggers.sendKeysMethod(driver,logger, "//*[@class = 'form-control search-input']", "Fidelis Care Member", " Search Box");
        //•Click on search icon
        ReusableMethodes_Loggers.clickMethod(driver,logger, "//*[@class = 'btn btn-primary btn-search']", "search icon");
        //•Capture the search results
        String SearchResult = ReusableMethodes_Loggers.captureText(driver,logger, "//*[@class= 'gsc-result-info']", "Search Result");
        //•Split and only print the search number
        String[] SplitMessage = SearchResult.split(" ");
        System.out.println("the Result is" + SplitMessage[1]);
        //•Click on Get General Coverage link
        ReusableMethodes_Loggers.clickMethod(driver,logger, "//*[@class = 'gs-title']", "Fidelis Care Member");
    }
    @Test
    public void tc002_Test2(){
        //switch to new tab
        ReusableMethode.switchToTabByIndex(driver,1);
        //click on Renew Your Coverage
        ReusableMethodes_Loggers.clickMethod(driver,logger,"//*[normalize-space()='Renewal Help']", "Click on renewal Help");
        //click on "when do you need to renew your coverage"
        ReusableMethodes_Loggers.clickMethod(driver,logger,"//*[normalize-space()='When do you need to renew your coverage?']", "Click on renew your cov");
        //capture text on "When do you need to renew your coverage"
        String results =ReusableMethodes_Loggers.captureText(driver,logger,"//*[@class='accordion-body']","Capture results 1");
        System.out.println(results);
        //click on "what info do you need to renewal coverage"
        ReusableMethodes_Loggers.clickMethod(driver,logger,"//*[normalize-space()='What information do you need to renew your coverage?']", "Click on what info?");
        //capture text on "What info needed for coverage?"
        String results2 = ReusableMethode.CaptureText(driver,"//*[@class='accordion-body'])[2]","Capture results 2");
        System.out.println(results2);
    }// end of test case two

    @Test
    public void tc003_thirdTC(){
        //switch back to default tab
        ReusableMethode.switchToTabByIndex(driver,0);
        //click on log in
        ReusableMethodes_Loggers.clickMethod(driver,logger,"//*[@class='dropdown-toggle'])[1]","Click Login");
        //click on member online portal
        ReusableMethodes_Loggers.clickMethod(driver,logger,"//*[text()='Member Online Portal']","Click Member Online Portal");
        //switch to new tab
        ReusableMethode.switchToTabByIndex(driver,2 );
        //capture message helpful hints
        String results = ReusableMethodes_Loggers.captureText(driver,logger,"//*[@class='flex flex-column p-8']","Print helpful hints message");
        System.out.println(results);
        driver.close();
    }
}


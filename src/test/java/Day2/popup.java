package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static day13_051424.TestParent.driver;

public class popup {
    public static void main(String[] args) {
        try{
            WebElement popUpCloseBtn = driver.findElement(By.xpath("//*[@id='popup']"));
            if(popUpCloseBtn.isDisplayed()){
                popUpCloseBtn.click();
                System.out.println("Popup is closed.");
            }
        }catch (NoSuchElementException e){
            System.out.println("No pop up was found.");
        }

        WebElement someOtherElement = driver.findElement(By.xpath("//*[@class='random element']"));
        someOtherElement.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
   public CheckOutPage(WebDriver driver){
        this.driver=driver;

   }

   By FirstNameField=By.id("first-name");
   By LastName=By.id("last-name");
   By PostalCode=By.id("postal-code");

   By ContinueButton=By.xpath("//input[@class=\"btn_primary cart_button\"]");

    public void EnterInf (String firstname, String secondName ,String postal){

        driver.findElement(FirstNameField).sendKeys(firstname);
        driver.findElement(LastName).sendKeys(secondName);
        driver.findElement(PostalCode).sendKeys(postal);
        driver.findElement(ContinueButton).click();


    }

}





package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

   private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    String productName = "Sauce Labs Bolt T-Shirt";

    private  By testElement = By.className("peek");

     private By productLink = By.xpath("//div[text()=\""+productName+"\"]");
     public By getHeaderArea(){
         return testElement;
     }
    public void openProduct(){
        driver.findElement(productLink).click();
    }


}

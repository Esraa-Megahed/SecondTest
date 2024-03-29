package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
   private WebDriver driver;
   public CartPage(WebDriver driver){
       this.driver=driver;

   }
    private By productName = By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]");
    private By checkoutButton = By.xpath("//a[@class=\"btn_action checkout_button\"]");

    public By getProductName(){
        return productName;
    }

//Actions

    public void checkout(){
        driver.findElement(checkoutButton).click();

    }

}

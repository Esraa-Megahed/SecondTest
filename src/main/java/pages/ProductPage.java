package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
     public ProductPage (WebDriver driver){
         this. driver= driver;
     }

    private By productPrice = By.className("inventory_details_price");
     private By addTocartButton= By.xpath("//button[@class=\"btn_primary btn_inventory\"]");
     private By cartIcon= By.id("shopping_cart_container");
     public By getProductPrice(){
         return  productPrice;
     }
     public String expectedPrice = "$15.99";


     public void Product( String Price,String productName){
         driver.findElement(productPrice).getText();
     }
     public void addToCart(){
         driver.findElement(addTocartButton).click();
     }
     public void moveToCartPage(){
         driver.findElement(cartIcon).click();

     }



}

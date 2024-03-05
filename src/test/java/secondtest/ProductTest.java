package secondtest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends Testjava {

    String expectedPrice = "$15.99";
    String productName = "Sauce Labs Bolt T-Shirt";
    String validUserName= "standard_user";
    String validPassword= "secret_sauce";

    By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    By productPrice = By.className("inventory_details_price");
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
     By addCart=By.xpath("//button[@class='btn_primary btn_inventory']");
    By Basket=By.xpath("//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']");
    By Check=By.xpath("//a[@class='btn_action checkout_button']");
    By Eliminate= By.xpath("//button[@class='btn_secondary cart_button']");
    By Continue= By.xpath("//a[@class='btn_secondary']");


    @org.testng.annotations.Test

    public void validLogin (){
        driver.findElement(userName).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();

    }

    @org.testng.annotations.Test

    public void validateProductPrice(){
        driver.findElement(userName).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        driver.findElement(productLink).click();
        String actualValue = driver.findElement(productPrice).getText();
        Assert.assertEquals(actualValue, expectedPrice);
    }

    @Test
    public void Cart(){
        driver.findElement(userName).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        driver.findElement(productLink).click();
        driver.findElement(addCart).click();
        driver.findElement(Basket).click();
        driver.findElement(Check).click();
        driver.navigate().back();
        driver.findElement(Eliminate).click();
        driver.findElement(Continue).click();


    }



}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ShoppingCard {
    WebDriver driver;

    By addCart=By.xpath("//button[@class='btn_primary btn_inventory']");
    By Basket=By.xpath("//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']");
    By Check=By.xpath("//a[@class='btn_action checkout_button']");
    By Eliminate= By.xpath("//button[@class='btn_secondary cart_button']");
    By Continue= By.xpath("//a[@class='btn_secondary']");

    public void Cart(){

        driver.findElement(addCart).click();
        driver.findElement(Basket).click();
        driver.findElement(Check).click();
        driver.navigate().back();
        driver.findElement(Eliminate).click();
        driver.findElement(Continue).click();
    }

}

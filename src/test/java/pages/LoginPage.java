package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    By errorBtn = By.className("error-button");

    public void login( String username,String Password){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(loginBtn).click();
    }
}

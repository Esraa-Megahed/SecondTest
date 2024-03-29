package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private  WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver=driver;

    }

     private By userName = By.id("user-name");
     private By password = By.id("password");
    private  By loginBtn = By.id("login-button");
    private  By errorBtn = By.className("error-button");
    public By getErrorButton(){
        return errorBtn;
    }

    public void login( String username,String Password){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(loginBtn).click();
    }
}

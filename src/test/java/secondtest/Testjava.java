package secondtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testjava {
    WebDriver driver;
    @BeforeMethod

    public void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");

    }
//    @AfterMethod
//
//    public void quit(){
//        driver.quit();
//    }
}

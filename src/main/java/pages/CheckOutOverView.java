package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverView {

    private WebDriver driver;
    public CheckOutOverView(WebDriver driver){
        this.driver=driver;

    }
    private By finishbutton=By.xpath("//a[@class=\"btn_action cart_button\"]");
    public void end(){
        driver.findElement(finishbutton).click();

    }
}

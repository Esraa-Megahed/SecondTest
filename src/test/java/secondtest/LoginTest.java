package secondtest;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    //Data


    @Test
    public void  validLogin(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        HomePage homePage= new HomePage(driver);
        boolean isLogoDisplayed=driver.findElement(homePage.getHeaderArea()).isDisplayed();
        Assert.assertTrue(isLogoDisplayed);

    }


  @Test
    public void invalidLogin(){
      LoginPage inloginPage= new LoginPage( driver) ;
      inloginPage.login("standard_userr","secret_sauce");
      boolean isErrorMessageDisplayed= driver.findElement(inloginPage.getErrorButton()).isDisplayed();
      Assert.assertTrue(isErrorMessageDisplayed);
  }


}

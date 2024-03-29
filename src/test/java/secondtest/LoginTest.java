package secondtest;

import org.testng.annotations.*;
import pages.LoginPage;

public class SecondTest extends Testjava {
    //Data


    @Test
    public void  validLogin(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

    }




}

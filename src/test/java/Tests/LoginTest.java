package Tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    LoginPage loginObject;
    String userName="Admin";
    String password="admin123";

    @Test(priority = 1)
    public void checkLoginSuccessfully() throws InterruptedException {

        loginObject=new LoginPage(driver);

       loginObject.loginByRegisteredUser(userName,password);



        //Assert.assertEquals("Your registration completed",registrationObject.registerSuccessfulMessage.getText());

    }
}

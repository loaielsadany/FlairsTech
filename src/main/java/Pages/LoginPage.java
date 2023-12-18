package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name ="username")
    WebElement usernameTxtBox;

    @FindBy (name ="password")
    WebElement passwordTxtBox;

    @FindBy (css ="button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    WebElement loginBtn;


    public void loginByRegisteredUser(String username,String password) throws InterruptedException {


        sendText(usernameTxtBox,username);
        sendText(passwordTxtBox,password);
        clickButton(loginBtn);


    }


}

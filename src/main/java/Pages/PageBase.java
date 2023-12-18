package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {


Select select;
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public static void clickButton(WebElement button){
        button.click();
    }

    public   static void sendText(WebElement textBox, String value){
        textBox.sendKeys(value);
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement usernameSearch;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]")
    WebElement deleteBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    WebElement yesDeleteBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    WebElement resetBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    public WebElement noOfRecord;


    public void searchUser() throws InterruptedException {

        sendText(usernameSearch,"employee019");
        clickButton(searchBtn);
        Thread.sleep(3000);
        clickButton(deleteBtn);
        clickButton(yesDeleteBtn);
        Thread.sleep(10000);
        clickButton(resetBtn);
        Thread.sleep(5000);
        System.out.println("No Of Record After Removal "+" "+ noOfRecord.getText());


    }




}

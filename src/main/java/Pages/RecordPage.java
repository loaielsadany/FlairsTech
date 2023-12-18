package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecordPage extends PageBase{
    public RecordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
    WebElement adminBtn;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    public  WebElement noOfRecord;


    public void openAdminPage() throws InterruptedException {
        clickButton(adminBtn);
        Thread.sleep(3000);

        System.out.println("Original No Of Record "+" "+noOfRecord.getText());
    }

}

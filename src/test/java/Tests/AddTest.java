package Tests;

import Pages.AddingPage;
import Pages.RecordPage;
import org.testng.annotations.Test;

public class AddTest extends TestBase{

    AddingPage addingObject;


    @Test
    public void checkAddRecord() throws InterruptedException {

        addingObject=new AddingPage(driver);
        addingObject.addRecord();

        Thread.sleep(10000);
        System.out.println("No Of record After Adding"+" "+addingObject.noOfrecord.getText());
    }
}

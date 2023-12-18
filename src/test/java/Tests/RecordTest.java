package Tests;

import Pages.RecordPage;
import org.testng.annotations.Test;

public class RecordTest extends TestBase{

    RecordPage recordObject;

    @Test
    public void checkRecord() throws InterruptedException {
        Thread.sleep(3000);
        recordObject=new RecordPage(driver);
        recordObject.openAdminPage();

    }
}

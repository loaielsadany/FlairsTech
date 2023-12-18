package Tests;

import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    SearchPage searchObject;

    @Test
    public void checkSearch() throws InterruptedException {

        searchObject=new SearchPage(driver);
        searchObject.searchUser();

    }
}

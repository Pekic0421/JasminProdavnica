package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseTests{

    /**
     * Pretraga po Brendu Test
     * steps:
     * 1. Navigiramo BasePage
     * 2. Navodimo da sačeka 30 sekundi
     * 4. Unosimo ime proizvoda
     * 5. Pretražujemo i potvrđujemo
     * 6. Navigiramo na SearchPage
     * Expected result:
     * Verifikujemo da se element pretrage pojavljuje
     */

    @Test
    public  void searchBrendTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            BasePage basePage = new BasePage(driver);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            basePage.searchAndSubmit("Lancom");
            SearchPage searchPage = new SearchPage(driver);
          assert   searchPage.isSerchResultsPresent() : "There are NO search results";

        }finally {
           driver.quit();
        }
    }
}

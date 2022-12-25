package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;

public class PozvatiProdavnicuTests extends BaseTests {

    /**
     * Pozvati prodavnicu
     * steps:
     * 1. Navigiramo BasePage
     * 2.Klikćemo na telefonsku ikonicu
     * Expected result:
     * Verifikujemo da moze izvršiti poziv
     */

    @Test
    public void PozvatiProdavnicuTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            BasePage basePage = new BasePage(driver);
            basePage.clickOnTelefonskaIkonica();
            System.out.println("Poziva");

        }finally {
            driver.quit();
    }

}

   }




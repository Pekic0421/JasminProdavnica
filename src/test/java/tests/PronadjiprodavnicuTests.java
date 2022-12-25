package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ProdavnicePage;
import pages.Strings;

public class PronadjiprodavnicuTests extends BaseTests{

    /**
     * Pronađi prodavnicu Test
     * steps:
     * 1. Navigiramo ProdavnicePage
     * 2.Klikćemo na Pronađi prodavnicu dugme
     * Expected result:
     * Verifikujemo da smo na stranici prodavnice
     *
     * 4.Klikćemo na određenu prodavnicu
     * Expected result:
     * Verifikujemo da nam se na mapi pokazala određena prodavnica
     */

    @Test
    public void PronadjiProdavnicuTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            ProdavnicePage prodavnicePage = new ProdavnicePage(driver);
            prodavnicePage.clikPronadjiProdavnicu();
            assert isCurrentURLEqualTo(driver, Strings.PRODAVNICE_URL) : "User is not on prodavnica page. " +
                    "Expected: https://www.jasmin.rs/prodavnice, Actual:" + driver.getCurrentUrl();
            prodavnicePage.clickOnProdavnica();
            assert prodavnicePage.rezultatiPretrageSePojavljuju() : "There are NO search result.";

        } finally {
           driver.quit();
        }
    }
}

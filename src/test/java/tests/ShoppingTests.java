package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BodyPage;
import pages.ShoppingPage;
import pages.Strings;

import java.util.concurrent.TimeUnit;

public class ShoppingTests extends BaseTests{

    /**
     * Shopping Cart Empty Test
     * steps:
     * 1. Navigiramo ShoppingPage
     * Expected result:
     * Verifikujemo da se prayna korpa pojavljuje
     */

    @Test
    public void shoppingCartEmpty(){
        ChromeDriver driver = openChromeDriver();
        try {
            ShoppingPage shoppingPage = new ShoppingPage(driver);
            assert shoppingPage.isShoppingCartEmptyPresent() : "Element is NOT present";
        }finally {
            driver.quit();
        }
    }

    /**
     * Add one item to shopping cart Test
     * steps:
     * 1. Navigiramo BodyPage
     * 2.Klikćemo na parfem Chloe
     * Expected result:
     * Verifikujemo da smo na stranici Chloe parfema
     * 3.Navodimo čekanje od 10 sekundi
     * 4.Klikćemo na odabir militraže parfema
     * 5.Klikćemo na dugme za dodavanje u korpu
     * 6.Navigiramo na ShoppingPage
     * Expected result:
     * Verifikujemo da smo dodali proiyvod u korpu
     */

    @Test
    public void addOneItemToShoppingCart(){
        ChromeDriver driver = openChromeDriver();
        try {
            BodyPage bodyPage = new BodyPage(driver);
            bodyPage.clickParfemChloe();
            assert isCurrentURLEqualTo(driver, Strings.CHLOE_PARFEM_URL) : "User is NOT on Chloe parfem url.";
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            bodyPage.dodajUkorpu20mmParfema();
            ShoppingPage shoppingPage = new ShoppingPage(driver);
            assert shoppingPage.isNumberOnShoppingCartPresent() : "Element is NOT present.";


        }finally {
            driver.quit();
        }
    }
}



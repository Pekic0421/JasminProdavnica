package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BodyPage;
import pages.Strings;
import pages.WishListPage;

import java.util.concurrent.TimeUnit;

public class WishListTests extends BaseTests{

    /**
     * Wish List Test
     * steps:
     * 1. Navigiramo  WishListPage
     * 2. Klikćemo na wish list ikonicu
     * Expected result:
     * Verifikujemo da smo na stranici Wish list
     */


    @Test
    public void WishListTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            WishListPage wishListPage = new WishListPage(driver);
            wishListPage.clickIconWishList();
            assert isCurrentURLEqualTo(driver, Strings.WISH_LIST_URL) : "User is not on Wihlist page. " +
                    "Expected: https://www.jasmin.rs/guestwish/index/index/, Actual:" + driver.getCurrentUrl();
            print("WishListPage");
        }finally {
            driver.quit();
        }

    }

    /**
     * Ubaci jedan proizvod u listu želja test
     * steps:
     * 1. Navigiramo  BasePage
     * 2. Navodimo na čekanje od 30 sekundi
     * 3. Unosimo ime proizvoda
     * 4. Pretražujemo i prihvatamo
     * 5. Navigiramo BodyPage
     * 6.Navodimo na čekanje od 10 sekundi
     * 7. Klikćemo na određen proizvod
     * Expected result:
     * Verifikujemo da smo na stranici proizvoda (Pupa Balm)
     * 8. Navodimo na čekanje od 10 sekundi
     * 9. Klikćemo na ikonicu dodaj u listu želja
     * Expected result:
     * Verifikujemo da smo na stranici liste želja
     * Verifikujemo da se proizvod pojavljuje u listi želja
     */

    @Test

    public void ubaciJedanProizvodUListuZelja() {
        ChromeDriver driver = openChromeDriver();
        try {
                BasePage basePage = new BasePage(driver);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                basePage.searchAndSubmit("Pupa");
                BodyPage bodyPage = new BodyPage(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                bodyPage.clickPupaBalm();
                assert isCurrentURLEqualTo(driver, Strings.PUPA_BALZAM_URL) : "User is NOT on Pupa balzam page.";
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            bodyPage.clickDodajUListuZeljaIkonica();
            assert isCurrentURLEqualTo(driver, Strings.WISH_LIST_URL);
            assert bodyPage.isSearchResultsPresent() : "Element is NOT present";
        }finally {
            driver.quit();
        }
    }
}

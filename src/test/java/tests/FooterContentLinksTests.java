package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.FooterContentPage;
import pages.Strings;

public class FooterContentLinksTests extends BaseTests{

    /**
     * Facebook Link Test
     * steps:
     * 1. Navigiramo FooterContentPage
     * 2.Klikćemo na Facebook ikonicu
     * Expected result:
     * Verifikujemo da se otvorila Facebook stranica
     */


    @Test
    public void facebookLinkTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            FooterContentPage footerContentPage = new FooterContentPage(driver);
            footerContentPage.clickOnFacebookIcon();

            assert isCurrentURLEqualTo(driver, Strings.FACEBOOK_URL) : "User is NOT on facebook page.";
        }finally {
            driver.quit();
        }
    }

    /**
     * Instagram Link Test
     * steps:
     * 1. Navigiramo FooterContentPage
     * 2.Klikćemo na Instagram ikonicu
     * Expected result:
     * Verifikujemo da se otvorila Instagram stranica
     */

    @Test
    public void instagramLinkTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            FooterContentPage footerContentPage = new FooterContentPage(driver);
            footerContentPage.clickOnInstagramIcon();
            assert isCurrentURLEqualTo(driver, Strings.INSTAGRAM_URL) : "User is NOT on instagram page.";
        }finally {
            driver.quit();
        }
    }

    /**
     * Tik Tok Link Test
     * steps:
     * 1. Navigiramo FooterContentPage
     * 2.Klikćemo na Tik Tok ikonicu
     * Expected result:
     * Verifikujemo da se otvorila Tik Tok stranica
     */

    @Test
    public void tikTokLinkTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            FooterContentPage footerContentPage = new FooterContentPage(driver);
            footerContentPage.clickOnTicktokIcon();
            assert isCurrentURLEqualTo(driver, Strings.TIK_TOK_URL) : "User is NOT on tik-tok page.";
        }finally {
            driver.quit();
        }
    }

    /**
     * Youtube Link Test
     * steps:
     * 1. Navigiramo FooterContentPage
     * 2.Klikćemo na Youtube ikonicu
     * Expected result:
     * Verifikujemo da se otvorila Youtube stranica
     */

    @Test
    public void youtubeLinkTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            FooterContentPage footerContentPage = new FooterContentPage(driver);
            footerContentPage.clickOnYoutubeIcon();
            assert isCurrentURLEqualTo(driver, Strings.YOUTUBE_URL) : "User is NOT on youtube page.";
        }finally {
            driver.quit();
        }
    }

    /**
     * LinkedIn Link Test
     * steps:
     * 1. Navigiramo FooterContentPage
     * 2.Klikćemo na LinkedIn ikonicu
     * Expected result:
     * Verifikujemo da se otvorila LinkedIn stranica
     */

    @Test
    public void linkedInLinkTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            FooterContentPage footerContentPage = new FooterContentPage(driver);
            footerContentPage.clickOnLinkedInIcon();
            assert isCurrentURLEqualTo(driver, Strings.LINCKED_IN_URL) : "User is NOT on linkedIn page.";
        }finally {
            driver.quit();
        }
    }
}

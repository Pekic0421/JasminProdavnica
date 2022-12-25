package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{

    //WebElements
    @FindBy(xpath = "//a[@id = 'wishlist_link']")
    WebElement iconWishListLocator;

    //Konstruktor
    public WishListPage(ChromeDriver driver) {
        super(driver);
        print("WishListPage");
    }

    //Metode nad web elementima
    public void clickIconWishList() {
        print("clickIconWishList");
        iconWishListLocator.click();
    }
}

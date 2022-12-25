package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//a[@class='action showcart active']")
    WebElement shoppingCartIconLocator;

    @FindBy(xpath = "//span[@class = 'counter qty empty']")
    WebElement numberOnShoppingCartEmptyIcon;

    @FindBy(xpath = "//span[@class = 'counter-number']")
    WebElement numberOnShoppingCartIcon;


    public ShoppingPage(ChromeDriver driver) {
        super(driver);
        print("ShoppingPage");
    }

    public boolean isNumberOnShoppingCartPresent() {
        print("isNumberOnShoppingCartPresent");
        return isElementPresent(numberOnShoppingCartIcon);
    }

    public boolean isShoppingCartEmptyPresent() {
        print("isShoppingCartEmptyPresent");
        return isElementPresent(numberOnShoppingCartEmptyIcon);
    }
}




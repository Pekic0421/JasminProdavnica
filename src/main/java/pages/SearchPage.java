package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    //Webeelementi

    @FindBy(xpath = "//div[@class = 'toolbar-sorter sorter']")
    WebElement toolbarSorterLocator;

    //Konstruktor
    public SearchPage (ChromeDriver driver) {
        super(driver);
        print("SerchPage");
    }

    //Metode nad web elementima
    public boolean isSerchResultsPresent() {
        print("isSerchResultsPresent");
        return isElementPresent(toolbarSorterLocator);
    }


}

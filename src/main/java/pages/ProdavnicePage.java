package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ProdavnicePage extends BasePage{

    //Webelementi
    @FindBy(xpath = "//a[@onclick = 'prodavnica(14);']")
    WebElement prodavnica1;

    @FindBy(xpath = "//div[@class = 'mapa-c-0']")
    WebElement rezultatiPretrageProdavnice;


    //Konstruktor
    public ProdavnicePage(ChromeDriver driver) {
        super(driver);
        print("ProdavnicePage");
    }


    //Metode nad webelementima
    public void clickOnProdavnica() {
        print("clickOnProdavnica");
        prodavnica1.click();
    }

    public boolean rezultatiPretrageSePojavljuju(){
        print("rezultatiPretrageSePojavljuju");
        return rezultatiPretrageProdavnice.isDisplayed();
    }
}

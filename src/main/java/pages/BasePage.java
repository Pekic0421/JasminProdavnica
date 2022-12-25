package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    //WebElementi koji se nalaze na svim stranicama
    @FindBy(xpath = "//input[@class = 'amsearch-input']")
    WebElement searchInputLocator;

    @FindBy(xpath = "//button[@class = 'amsearch-button -loupe -clear -icon']")
    WebElement submitButtonLocator;

    @FindBy(xpath = "//a[@id = 'back-to-top']")
    WebElement nazadNaVrhStrane;

    @FindBy(xpath = "//i[@class='fas fa-map-marker-alt']")
    WebElement pronadjiProdavnicu;

    @FindBy(xpath = "//i[@class='fas fa-phone-alt']")
    WebElement telefonIkonica;

    @FindBy(xpath = "//img[@title='Jasmin logo']")
    WebElement logo;

    @FindBy(xpath = "//a[@id='wishlist_link']")
    WebElement listaZelja;


    ChromeDriver driver = null;


    //Konstruktor
    public BasePage(ChromeDriver driver) {
        print("BasePage");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void print(String s) {
        System.out.println(s);
    }


    //Metode nad web elementima

    public void enterTextIntoSearchField(String text) {
        print("enterTextIntoSearchField");
        searchInputLocator.click();
        searchInputLocator.sendKeys(text);
    }

    public void clickSubmitButton() {
        print("clickSubmitButton");
        submitButtonLocator.click();

    }

    public void searchAndSubmit(String text) {
        print("searchAndSubmit");
        enterTextIntoSearchField(text);
        clickSubmitButton();
    }

    public void clikPronadjiProdavnicu() {
        print("PronadjiProdavnicu");
        pronadjiProdavnicu.click();
    }

    public void clickOnTelefonskaIkonica() {
        print("Telefonska Ikonica");
        telefonIkonica.click();
    }


    public boolean clickListaZelja() {
        print("clickListaZelja");
        listaZelja.click();
        return false;
    }

    public boolean isElementPresent(WebElement element) {
        try {
            boolean isPresent = element.isDisplayed();
            return true;
        } catch (Exception e) {
            print(e.getMessage());
            print("Element is not present on page");
            return  false;
        }
    }








    public void clickNaVrhStrane() {
        print("clickNaVrhStrane");
        nazadNaVrhStrane.click();
    }

    public void clickOnPrijaviSeButton(){
        driver.manage().window().maximize();
        WebElement mojJasminIcon = driver.findElement(By.xpath(".//ul.header.links[@class = 'not-logged-in']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mojJasminIcon);
        WebElement submojJasminIcon = driver.findElement(By.xpath(".//a[@href = 'https://www.jasmin.rs/customer/account/login/']"));
        actions.moveToElement(submojJasminIcon).click().build().perform();


    }



}


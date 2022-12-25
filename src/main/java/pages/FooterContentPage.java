package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FooterContentPage extends BasePage {


    //Web elementi
    @FindBy(xpath = "//a[@class = 'social-links-item']" )
    WebElement facebookIconLocator;

    @FindBy (xpath = "//a[@class = 'social-links-item']")
    WebElement instagramIconLocator;

    @FindBy (xpath = "//i[@class = 'fab fa-tiktok']")
    WebElement tiktokIconLocator;

    @FindBy (xpath = "//i[@class = 'fab fa-youtube']")
    WebElement youtubeIconLocator;

    @FindBy(xpath = "//i[@class = 'fab fa-linkedin-in']")
    WebElement linkedInIconLocator;


    //Konstruktor
    public  FooterContentPage(ChromeDriver driver) {
        super(driver);
        print("FooterContentPage");
    }

    //Metode nad Webelementima
    public void clickOnFacebookIcon() {
        print("clickOnFacebookIcon");
        facebookIconLocator.click();
        driver.manage().window().maximize();
        driver.get(Strings.FACEBOOK_URL);
    }

    public void clickOnInstagramIcon() {
        print("clickOnInstagramIcon");
        instagramIconLocator.click();
        driver.manage().window().maximize();
        driver.get(Strings.INSTAGRAM_URL);
    }

    public void clickOnTicktokIcon() {
        print("clickOnTicktokIcon");
        tiktokIconLocator.click();
        driver.manage().window().maximize();
        driver.get(Strings.TIK_TOK_URL);

    }

    public void clickOnYoutubeIcon() {
        print("clickOnYoutubeIcon");
        youtubeIconLocator.click();
        driver.manage().window().maximize();
        driver.get(Strings.YOUTUBE_URL);
    }

    public void clickOnLinkedInIcon() {
        print("clickOnLinkedInIcon");
        linkedInIconLocator.click();
        driver.manage().window().maximize();
        driver.get(Strings.LINCKED_IN_URL);
    }

}

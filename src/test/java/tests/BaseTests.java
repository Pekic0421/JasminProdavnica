package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Strings;

public class BaseTests {

    ChromeDriver driver = null;
    public ChromeDriver openChromeDriver(){
        print("Opening Chrome driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certicifat-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automtion"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.HOME_URL);
        return driver;
    }
    public static void print(String s) {
        System.out.println(s);
    }

    public boolean isCurrentURLEqualTo(ChromeDriver driver,String expectedURL) {
        print("isCurrentURLEqualTo ( " + expectedURL + " )");
        String currentUrl = driver.getCurrentUrl();
        print("User is on " + currentUrl);
        boolean b = currentUrl.equals(expectedURL);
        return b;
    }
}


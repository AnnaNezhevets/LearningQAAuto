package common;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constains.TimeoutVeriables.IMPLICIT_WAIT;

public class CommonActions {

    @BeforeEach
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "GECKODRIVER":
                System.setProperty("webdriver.geckodriver", "C:/Program Files/Java/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "CHROMEDRIVER":
                System.setProperty("webdriver.chrome.driver", "C:/Program Files/Java/chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}

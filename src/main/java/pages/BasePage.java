package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constains.TimeoutVeriables.EXPLICID_WAIT;


public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) { this.driver = driver; }

    public void goToUrl(String url){
        driver.get(url);
        }
    public WebElement waitElementIsVisiable(WebElement element) {
        new WebDriverWait(driver, EXPLICID_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}

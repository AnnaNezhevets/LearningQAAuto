package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage extends BasePage {
    public LinksPage(WebDriver driver) {
        super(driver);

    }

    private final By linksPage = By.xpath("//span[text() = 'Links']");

    public LinksPage enterLinks() {
        driver.findElement(linksPage).click();
        return this;
    }
}

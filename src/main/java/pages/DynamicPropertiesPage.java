package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPropertiesPage extends BasePage {
    public DynamicPropertiesPage(WebDriver driver) {
        super(driver);

    }

    private final By dynamicPropertiesPage = By.xpath("//span[text() = 'Dynamic Properties']");

    public DynamicPropertiesPage enterDynamicProperties() {
        driver.findElement(dynamicPropertiesPage).click();
        return this;
    }
}

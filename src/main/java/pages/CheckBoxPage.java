package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);

    }
    private final By buttonCheckBox = By.xpath("//span[text() = 'Check Box']");

    public CheckBoxPage enterCheckBox() {
        driver.findElement(buttonCheckBox).click();
        return this;
    }
}

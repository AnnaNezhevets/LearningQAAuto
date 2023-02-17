package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonPage extends BasePage{
    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonButtons = By.xpath("//span[text() = 'Buttons']");

    public ButtonPage enterButtons() {
        driver.findElement(buttonButtons).click();
        return this;
    }
}

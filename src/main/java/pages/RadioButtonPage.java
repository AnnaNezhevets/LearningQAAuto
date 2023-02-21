package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);

    }

    private final By radioButton = By.xpath("//span[text() = 'Radio Button']");

    public RadioButtonPage enterRadioButton() {
        driver.findElement(radioButton);
        return this;
    }

}

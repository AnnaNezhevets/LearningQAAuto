package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonTextBox = By.xpath("//span[text()='Text Box']");

    public TextBoxPage enterTexBox() {
        driver.findElement(buttonTextBox).click();
        return this;
    }


}

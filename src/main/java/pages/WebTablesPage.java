package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends BasePage {
    public WebTablesPage(WebDriver driver) {
        super(driver);

    }

    private final By webTablesPage = By.xpath("//span[text() = 'Web Tables']");

    public WebTablesPage enterWebTables() {
        driver.findElement(webTablesPage).click();
        return this;
    }
}

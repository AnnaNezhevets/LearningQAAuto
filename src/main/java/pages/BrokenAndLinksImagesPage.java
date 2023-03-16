package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrokenAndLinksImagesPage extends BasePage {
    public BrokenAndLinksImagesPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonBrokenLinksImages = By.xpath("//span[text() = 'Broken Links - Images']");

        public BrokenAndLinksImagesPage enterBrokenLinksImages() {

        driver.findElement(buttonBrokenLinksImages).click();
        return this;
    }
}


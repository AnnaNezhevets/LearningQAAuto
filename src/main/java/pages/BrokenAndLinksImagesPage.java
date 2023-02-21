package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class BrokenAndLinksImagesPage extends BasePage {
    public BrokenAndLinksImagesPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonBrokenLinksImages = By.xpath("//span[text() = 'Broken Links - Images']");

    public BrokenAndLinksImagesPage enterBrokenLinksImages() {

//        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(buttonBrokenLinksImages);
//        new Actions(driver)
//                .scrollFromOrigin(scrollOrigin, 0, 200)
//                .perform();
        driver.findElement(buttonBrokenLinksImages).click();
        return this;
    }
}


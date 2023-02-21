package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadAndsDownloadPage extends BasePage {
    public UploadAndsDownloadPage(WebDriver driver) {
        super(driver);

    }

    private final By upLoadAndDownloadPage = By.xpath("//span[text() = 'Upload and Download']");

    public UploadAndsDownloadPage enterUploadAndDownload() {
        driver.findElement(upLoadAndDownloadPage).click();
        return this;
    }
}

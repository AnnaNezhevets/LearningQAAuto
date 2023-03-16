package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonTextBox = By.xpath("//span[text()='Text Box']");
    private final By inputFullName = By.xpath("//div/input[@id = 'userName']");
    private final By inputEmail = By.xpath("//div/input[@id = 'userEmail']");
    private final By inputCurrentAddress = By.xpath("//div/textarea[@id = 'currentAddress']");
    private final By inputPermanentAddress = By.xpath("//div/textarea[@id = 'permanentAddress']");
    private final By buttonSubmit = By.xpath("//div/button[@id = 'submit']");


    public TextBoxPage enterTexBox() {
        driver.findElement(buttonTextBox).click();
        return this;
    }

    public TextBoxPage selectFullName() {
        driver.findElement(inputFullName).sendKeys("Semen");
        return this;
    }

    public TextBoxPage selectEmail() {
        driver.findElement(inputEmail).sendKeys("test@gmail.com");
        return this;
    }

    public TextBoxPage selectCurrentAAddress() {
        driver.findElement(inputCurrentAddress).sendKeys("Berlin");
        return this;
    }

    public TextBoxPage selectPermanentAddress() {
        driver.findElement(inputPermanentAddress).sendKeys("Berlin");
        return this;
    }

    public TextBoxPage enterSubmit() {
        driver.findElement(buttonSubmit).click();
        return this;
    }


    public String getFullNameTextBox(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/p[@id = 'name']")));
        return driver.findElement(By.xpath("//div/p[@id = 'name']")).getText();
    }

//    public TextBoxPage createListTextBoxPage() {
//        List<String> expectedlistTextBoxPage = new ArrayList<>();
//        expectedlistTextBoxPage.add("Semen");
//        expectedlistTextBoxPage.add("test@gmail.com");
//        expectedlistTextBoxPage.add("Berlin");
//        expectedlistTextBoxPage.add("Berlin");
//
//        List <String> actualTestBoxPage = new ArrayList<>();
//        actualTestBoxPage.add();
//
//        return this;
//    }

}

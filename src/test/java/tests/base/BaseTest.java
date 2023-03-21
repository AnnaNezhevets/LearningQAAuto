package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.*;

import static common.Config.CLEAR_COOKIES;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TextBoxPage textBoxPage = new TextBoxPage(driver);
    protected BrokenAndLinksImagesPage brokenAndLinksImagesPage = new BrokenAndLinksImagesPage(driver);
    protected ButtonPage buttonPage = new ButtonPage(driver);
    protected CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
    protected DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage(driver);
    protected LinksPage linksPage = new LinksPage(driver);
    protected RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
    protected UploadAndsDownloadPage uploadAndsDownloadPage = new UploadAndsDownloadPage(driver);
    protected WebTablesPage webTablesPage = new WebTablesPage(driver);

    @AfterEach
    void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
//    @AfterAll
//    void close(){
//        driver.close();
//   }
}

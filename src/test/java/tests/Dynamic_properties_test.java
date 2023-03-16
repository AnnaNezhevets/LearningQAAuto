package tests;

import org.junit.jupiter.api.Test;
import pages.ScrollPage;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class Dynamic_properties_test extends BaseTest {

    @Test
    public void testOpenDynamicProperties(){
        basePage.goToUrl(DEMOQA);
        ScrollPage.scrollDown(driver);
        dynamicPropertiesPage.enterDynamicProperties();
    }
}

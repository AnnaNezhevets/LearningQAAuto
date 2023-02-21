package tests;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class Links_test extends BaseTest {

    @Test
    public void testOpenLinks(){
        basePage.goToUrl(DEMOQA);
        linksPage.enterLinks();
    }
}

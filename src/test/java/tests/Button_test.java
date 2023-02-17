package tests;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class Button_test extends BaseTest {
    @Test
        public void testOpenButtons(){
        basePage.goToUrl(DEMOQA);
        buttonPage.enterButtons();
    }
}

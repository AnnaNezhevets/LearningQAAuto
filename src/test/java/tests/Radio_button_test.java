package tests;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class Radio_button_test extends BaseTest {

    @Test
    public void testOpenRadioButton(){
        basePage.goToUrl(DEMOQA);
        radioButtonPage.enterRadioButton();
    }
}

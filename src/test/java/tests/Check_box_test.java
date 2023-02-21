package tests;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class Check_box_test extends BaseTest {

    @Test
    public void testOpenCheckBox() {
       basePage.goToUrl(DEMOQA);
        checkBoxPage.enterCheckBox();
    }
}

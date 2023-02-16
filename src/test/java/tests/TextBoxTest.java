package tests;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class TextBoxTest extends BaseTest {

    @Test
    public void firstTestTextBox(){
        basePage.goToUrl(DEMOQA);
        textBoxPage.enterTexBox();
    }
}

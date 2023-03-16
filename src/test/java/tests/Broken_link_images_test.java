package tests;

import org.junit.jupiter.api.Test;
import pages.ScrollPage;
import tests.base.BaseTest;
import static constants.Constains.Urls.DEMOQA;

public class Broken_link_images_test extends BaseTest {

    @Test
    public void testOpenBrokenLinksImagesAndScrollPage() {
        basePage.goToUrl(DEMOQA);
        ScrollPage.scrollDown(driver);
        brokenAndLinksImagesPage.enterBrokenLinksImages();
    }
}

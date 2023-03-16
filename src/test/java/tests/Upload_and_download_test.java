package tests;

import org.junit.jupiter.api.Test;
import pages.ScrollPage;
import tests.base.BaseTest;

import static constants.Constains.Urls.DEMOQA;

public class Upload_and_download_test extends BaseTest {

    @Test
    public void testOpenUpLoadAndDownload() {
        basePage.goToUrl(DEMOQA);
        ScrollPage.scrollDown(driver);
        uploadAndsDownloadPage.enterUploadAndDownload();
    }
}

package tests;

import org.junit.jupiter.api.Test;

import static constants.Constains.Urls.DEMOQA;

public class Web_tables_test extends Button_test{

    @Test
    public void testOpenWebTables(){
        basePage.goToUrl(DEMOQA);
        webTablesPage.enterWebTables();
    }
}

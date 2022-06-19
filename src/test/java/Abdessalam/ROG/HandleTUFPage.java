package Abdessalam.ROG;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class HandleTUFPage extends CommonAPI {
    @Test
    public void HandleTUFPage(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.clickCookiesAcceptBtn();

        RepublicOfGamers.hovereOverProductsClickSwitchPages(getDriver());

    }
}

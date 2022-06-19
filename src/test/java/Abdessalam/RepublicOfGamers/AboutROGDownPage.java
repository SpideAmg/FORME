package Abdessalam.RepublicOfGamers;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class AboutROGDownPage extends CommonAPI {
    @Test
    public void AboutRogDownPage(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.AboutRogDownPage(getDriver());
    }
}

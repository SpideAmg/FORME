package Abdessalam.ROG;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class AboutROGMidlePage extends CommonAPI {
    @Test
    public void AboutROG(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.AboutROGMidlePage(getDriver());

    }
}

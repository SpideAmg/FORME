package Abdessalam.ROG;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class AsusLogoROGLogo extends CommonAPI {
    @Test
    public void Logos(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.Logos(getDriver());
    }
}

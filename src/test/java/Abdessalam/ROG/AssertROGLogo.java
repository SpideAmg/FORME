package Abdessalam.ROG;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class AssertROGLogo extends CommonAPI {
    @Test
    public void ROGLogo(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.ROGLogo();


    }
}

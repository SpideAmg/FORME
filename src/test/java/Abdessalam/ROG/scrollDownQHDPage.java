package Abdessalam.ROG;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class scrollDownQHDPage extends CommonAPI{
    @Test
    public void Scroll(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.QHDScrollDown(getDriver());

    }
}

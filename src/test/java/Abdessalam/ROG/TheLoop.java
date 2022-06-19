package Abdessalam.ROG;

import Pages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class TheLoop extends CommonAPI {
    @Test
    public void HoverOverLoop() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.TheList(getDriver());




        }
    }

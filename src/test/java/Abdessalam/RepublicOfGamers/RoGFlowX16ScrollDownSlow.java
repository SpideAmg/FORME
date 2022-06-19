package Abdessalam.RepublicOfGamers;

import Pages.RepublicOfGamersHomePage;
import Pages.RogFlowX16Page;
import base.CommonAPI;
import org.testng.annotations.Test;

public class RoGFlowX16ScrollDownSlow extends CommonAPI {
    @Test
    public void X16() {
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        RogFlowX16Page X16 = new RogFlowX16Page(getDriver());

        ROG.RogLow(getDriver());

    }
}
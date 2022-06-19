package Abdessalam.HomeWork;

import Pages.ShittyPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class SuggestionsDropDown extends CommonAPI {
        @Test
        public void SuggestionsDropDown() {
            ShittyPage ShittyPage = new ShittyPage(getDriver());

            ShittyPage.typeSuggestions();
            waitFor(2);
            ShittyPage.suggestDropDown(getDriver());
            waitFor(2);
        }
    }
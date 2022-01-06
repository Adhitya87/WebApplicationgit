package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class FBHomePage {

    @DefaultUrl("https://facebook.com")
    public static class OpenFacebookpage extends PageObject {}
}

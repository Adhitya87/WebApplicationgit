package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class GotoFB {
    public static Performable OpenFacebookpage() {
        return Task.where("{0} Open Facebook page",
                Open.browserOn().the(FBHomePage.OpenFacebookpage.class));
    }
}

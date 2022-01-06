package step;

import PageObject.FacebookLogin;
import facebookStepDefinitions.SerenityStory;
import facebookStepDefinitions.facebookStepDef;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;


@DefaultUrl (value = "https://www.facebook.com/")
public class LoginSteps extends SerenityStory {
    @Steps
    FacebookLogin facebookLogin;

    public void OpenFacebookpage() {
        facebookLogin.open();
    }

    public void InputEmailAndPassword(){
        facebookLogin.InputEmail();
        facebookLogin.InputPassword();
    }
    public void ClickButtonLogin(){
        facebookLogin.ClickButtonLogin();
    }


    //public void CanSeeMyNewsFeed() {
    //    facebookLogin.CanSeeMyNewsFeed();
    //}


}

package facebookStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.FBHomePage;
import step.LoginSteps;

public class facebookStepDef  {
    @Steps
    LoginSteps loginSteps;

    @Steps
    FBHomePage fbHomePage;


    @Given("I open facebook login page")
    public void iOpenFacebookLoginPage() {
        new FBHomePage.OpenFacebookpage();
            }

    @When("I input email and password")
    public void iInputEmailAndPassword() {
        loginSteps.InputEmailAndPassword();
            }



    @When("I click button login")
    public void iClickButtonLogin() {
        loginSteps.ClickButtonLogin();
           }



    @Then("I can see my news feed")
    public void iCanSeeMyNewsFeed() {
        //loginSteps.CanSeeMyNewsFeed();
           }
}

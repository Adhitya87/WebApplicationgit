package PageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin extends PageObject {


    @FindBy(id="email")
    WebElement fieldEmail = $(org.openqa.selenium.By.id("email"));
    public void InputEmail(){
        fieldEmail.sendKeys("adhityadwiprananta@yahoo.co.id");
    }

    @FindBy(id="pass")
    WebElement fieldPassword = $(org.openqa.selenium.By.id("pass"));
    public void InputPassword(){
        fieldPassword.sendKeys("abangJago123");
    }

    @FindBy(name="login")
    WebElement buttonLogin = $ (new By.ByButtonTextSelector("Log In")) ;
    public void ClickButtonLogin(){
        buttonLogin.click();
    }

    //public void CanSeeMyNewsFeed() {
//    }


}

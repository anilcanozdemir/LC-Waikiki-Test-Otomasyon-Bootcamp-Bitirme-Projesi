package chromeStepDefinitions;

import io.cucumber.java.en.When;

public class SignUpPage {
    chromePages.SignUpPage signUpPage= new chromePages.SignUpPage();
    @When("Customer Sign-Up with E-mail {string} and Password {string} and Phone {string}")
    public void customerSignUpWithEMailAndPasswordAndPhone(String Email, String Password, String Phone) {
        signUpPage.HoverOverCard("Giriş Yap");
        signUpPage.clickSignup();
        signUpPage.signUp(Email,Password, String.valueOf(Phone));
    }



}

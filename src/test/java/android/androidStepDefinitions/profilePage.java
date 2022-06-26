package android.androidStepDefinitions;

import io.cucumber.java.en.When;

public class profilePage  {
    android.androidPages.profilePage profilePage=new android.androidPages.profilePage();
    @When("Customer login with E-mail {string} and Password {string} to App")
    public void customerLoginWithEMailAndPasswordToApp(String Email, String Password) {
        profilePage.clickCard("Profil");

        profilePage.login(Email,Password,"E-Posta");
    }

    @When("Customer Sign-Up with E-mail {string} and Password {string} and Phone {string} to App")
    public void customerSignUpWithEMailAndPasswordAndPhoneToApp(String Email, String Password, String Phone) {
        profilePage.signUp(Email,Password,Phone);
    }
}

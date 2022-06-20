package StepDefinitions;

import io.cucumber.java.en.When;

public class LoginPage {
    Pages.LoginPage loginPage = new Pages.LoginPage();

    @When("Customer login with E-mail {string} and Password {string}")
    public void customerLoginWithEMailAndPassword(String Email, String Password) {
        if (!loginPage.checkLoginPage())
            loginPage.clickCard("Giriş Yap");
        loginPage.login(Email,Password,"Email");


    }
}

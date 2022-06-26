package chrome.chromeStepDefinitions;

import io.cucumber.java.en.When;

public class LoginPage {
    chrome.chromePages.LoginPage loginPage = new chrome.chromePages.LoginPage();

    @When("Customer login with E-mail {string} and Password {string}")
    public void customerLoginWithEMailAndPassword(String Email, String Password)  {

            loginPage.clickCard("Giriş Yap");

            loginPage.login(Email,Password,"E-Posta");

    }



}

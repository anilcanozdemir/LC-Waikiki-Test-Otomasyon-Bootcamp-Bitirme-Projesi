package android.androidStepDefinitions;

import android.androidPages.tutorialPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homePage {
    android.androidPages.homePage homePage = new android.androidPages.homePage();
    tutorialPage tutorialPage = new tutorialPage();

    @Then("should see AppHomePage")
    public void shouldSeeAppHomePage() {
        homePage.checkHomePage();
    }

    @Given("Customer is on AppHomePage")
    public void customerIsOnAppHomePage() {
        tutorialPage.clickSkipButton();
        homePage.checkHomePage();
    }
}

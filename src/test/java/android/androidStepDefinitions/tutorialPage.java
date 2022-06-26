package android.androidStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tutorialPage {
    android.androidPages.tutorialPage tutorialPage = new android.androidPages.tutorialPage();
    @Given("Customer  opened LcWaikiki App")
    public void customerOpenedLcWaikikiApp() {
        tutorialPage.IsOpened();
    }

    @Then("should see TvTutorial")
    public void shouldSeeTvTutorial() {
        tutorialPage.checkTvTutorial();
    }

    @Then("should see {string} text")
    public void shouldSeeText(String text) {
        tutorialPage.checkText(text);
    }

    @Then("should see {string} title description")
    public void shouldSeeTitleDescription(String description) {
        tutorialPage.checkTitleDescription(description);
    }

    @Then("should see {string} button")
    public void shouldSeeButton(String button) {
        tutorialPage.checkButton(button);
    }



    @When("drag and drop TvTutorial")
    public void dragAndDropTvTutorial() {
        tutorialPage.dragAndDropTvTutorial();
    }

    @When("click Skip button")
    public void clickSkipButton() {
        tutorialPage.clickSkipButton();
    }


    @Then("should see {string} tutorial-title")
    public void shouldSeeTutorialTitle(String tutorialTitle)  {
        tutorialPage.checkTutorialTitle(tutorialTitle);
    }


}

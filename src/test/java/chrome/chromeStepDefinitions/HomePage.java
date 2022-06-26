package chrome.chromeStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class HomePage {
    chrome.chromePages.HomePage homePage=new chrome.chromePages.HomePage();

    @Given("Customer is on HomePage")
    public void customerIsonHomePage() {
        homePage.checkHomePage();
    }

    @And("should see HomePage")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }


}

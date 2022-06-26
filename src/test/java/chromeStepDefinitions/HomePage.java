package chromeStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class HomePage {
    chromePages.HomePage homePage=new chromePages.HomePage();

    @Given("Customer is on HomePage")
    public void customerIsonHomePage() {
        homePage.checkHomePage();
    }

    @And("should see HomePage")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }
}

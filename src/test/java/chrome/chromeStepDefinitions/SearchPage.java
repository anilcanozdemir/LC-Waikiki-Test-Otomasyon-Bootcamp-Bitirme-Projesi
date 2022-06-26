package chrome.chromeStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;



public class SearchPage {
    chrome.chromePages.SearchPage searchPage = new chrome.chromePages.SearchPage();

    @And("Filter Color to be {string}")
    public void filterColorToBe(String value) {
        searchPage.filterByColor(value);

    }

    @And("Click Product {string}")
    public void clickProduct(String productName) {

        searchPage.clickProductByName(productName);
    }

    @Then("should see SearchPage")
    public void shouldSeeSearchPage() {
    searchPage.checkSearchPage();
    }



}

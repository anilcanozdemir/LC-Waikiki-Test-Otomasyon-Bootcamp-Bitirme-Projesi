package StepDefinitions;

import io.cucumber.java.en.And;


public class SearchPage {
    Pages.SearchPage searchPage = new Pages.SearchPage();

    @And("Filter {string} to be {string}")
    public void filterToBe(String filterName, String value) {
        searchPage.filter(filterName, value);

    }

    @And("Click Product {string}")
    public void clickProduct(String productName) {
        searchPage.clickProductByName(productName);
    }
}

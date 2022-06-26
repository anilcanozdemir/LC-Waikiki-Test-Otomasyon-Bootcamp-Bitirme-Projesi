package android.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class searchPage  {

    android.androidPages.searchPage searchPage=new android.androidPages.searchPage();
    @Then("should see AppSearchPage")
    public void shouldSeeAppSearchPage() {
        searchPage.checkSearchPage();

    }

    @And("Filter Color to be {string} from AppSearchPage")
    public void filterColorToBeFromAppSearchPage(String value) {
        searchPage.filterByColor(value);
    }



    @And("Click Product {string}{string} from AppSearchPage")
    public void clickProductFromAppSearchPage(String brandName, String productName) {
        searchPage.clickProductByName(brandName+" "+productName);
    }
}

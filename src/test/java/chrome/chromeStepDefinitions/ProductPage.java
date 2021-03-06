package chrome.chromeStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ProductPage {
    chrome.chromePages.ProductPage productPage = new chrome.chromePages.ProductPage();

    @And("Choose Size Option {string}")
    public void chooseSizeOption(String size) {
        productPage.chooseSize(size);
    }

    @And("Add to Cart")
    public void addToCart() {
        productPage.addToCart();
    }

    @Then("should see ProductPage")
    public void shouldSeeProductPage() {
        productPage.checkProductPage();
    }
}

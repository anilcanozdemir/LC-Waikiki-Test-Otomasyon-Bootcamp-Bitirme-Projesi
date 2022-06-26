package chrome.chromeStepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPage {

    chrome.chromePages.CartPage cartPage = new chrome.chromePages.CartPage();

    @When("Proceed to CheckOutPage")
    public void proceedToCheckOutPage() {
        cartPage.proceedToCheckOut();
    }

    @Then("should see CartPage")
    public void shouldSeeCartPage() {
        cartPage.checkCartPage();
    }

    @Then("should see product named {string} whose countity {int} and size {string}")
    public void shouldSeeProductNamedWhoseCountityAndSize(String productName, int productCount, String productSize)  {
        cartPage.checkProductName(productName);
        cartPage.checkProductSize(productName,productSize);

        cartPage.checkProductCountity(productName,productCount);

    }
}

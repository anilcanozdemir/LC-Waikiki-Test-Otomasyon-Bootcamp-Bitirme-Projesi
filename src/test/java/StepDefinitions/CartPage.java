package StepDefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPage {

Pages.CartPage cartPage=new Pages.CartPage();
    @Then("should see product named {string}")
    public void shouldSeeProductNamed(String productName) {

        cartPage.checkProductName(productName);
    }

    @And("should see product countity {int}")
    public void shouldSeeProductCountity(int productCount) {
        cartPage.checkProductCountity(productCount);
    }


    @And("should see product size {string}")
    public void shouldSeeProductSize(String productSize) {
        cartPage.checkProductSize(productSize);
        
    }
    @When("Proceed to CheckOutPage")
    public void proceedToCheckOutPage() {
        cartPage.proceedToCheckOut();
    }
}

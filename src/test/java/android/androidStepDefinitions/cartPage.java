package android.androidStepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartPage  {
    android.androidPages.cartPage cartPage=new android.androidPages.cartPage();
    @Then("should see product named {string} whose countity {int} and size {string} and {string} Colored from AppCartPage")
    public void shouldSeeProductNamedWhoseCountityAndSizeFromAppCartPage(String productName, int productCount, String productSize,String productColor) {
        cartPage.checkProductName(productName);
        cartPage.checkProductSize(productSize);
cartPage.checkProductColor(productColor);
        cartPage.checkProductCountity(productCount);


    }
    @Then("should see AppCartPage")
    public void shouldSeeAppCartPage() {
        cartPage.checkCartPage();
    }

    @When("Proceed to AppCheckOutPage")
    public void proceedToAppCheckOutPage() {
        cartPage.proceedToCheckOut();
    }


}

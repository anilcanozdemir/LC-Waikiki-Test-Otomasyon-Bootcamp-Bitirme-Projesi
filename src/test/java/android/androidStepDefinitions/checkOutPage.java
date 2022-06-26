package android.androidStepDefinitions;

import io.cucumber.java.en.Then;

public class checkOutPage {
    android.androidPages.checkOutPage checkOutPage=new android.androidPages.checkOutPage();
    @Then("should see AppCheckOutPage")
    public void shouldSeeAppCheckOutPage() {
        checkOutPage.checkCheckOutPage();
    }
}

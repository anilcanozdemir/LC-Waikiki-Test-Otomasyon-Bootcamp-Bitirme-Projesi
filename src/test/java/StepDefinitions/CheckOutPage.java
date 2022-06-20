package StepDefinitions;


import io.cucumber.java.en.Then;

public class CheckOutPage  {
    Pages.CheckOutPage checkOutPage=new Pages.CheckOutPage();
    @Then("should see CheckOutPage")
    public void shouldSeeCheckOutPage() {
        checkOutPage.checkCheckOutPage();
    }
}

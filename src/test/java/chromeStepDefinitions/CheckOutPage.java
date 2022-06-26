package chromeStepDefinitions;


import io.cucumber.java.en.Then;

public class CheckOutPage  {
    chromePages.CheckOutPage checkOutPage=new chromePages.CheckOutPage();
    @Then("should see CheckOutPage")
    public void shouldSeeCheckOutPage() {
        checkOutPage.checkCheckOutPage();
    }
}

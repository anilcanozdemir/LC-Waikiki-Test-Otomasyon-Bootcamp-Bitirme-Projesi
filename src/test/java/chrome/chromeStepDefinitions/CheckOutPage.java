package chrome.chromeStepDefinitions;


import io.cucumber.java.en.Then;

public class CheckOutPage  {
    chrome.chromePages.CheckOutPage checkOutPage=new chrome.chromePages.CheckOutPage();
    @Then("should see CheckOutPage")
    public void shouldSeeCheckOutPage() {
        checkOutPage.checkCheckOutPage();
    }
}

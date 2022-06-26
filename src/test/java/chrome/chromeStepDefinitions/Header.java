package chrome.chromeStepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Header {

chrome.chromePages.Header header=new chrome.chromePages.Header();

    @When("Select Category as {string} -- {string} -- {string}")
    public void selectCategoryAsMainCategoryCategorySubCategory(String mainCategory, String category,String subCategory) {
        header.selectCategory(mainCategory,category,subCategory);

    }

    @And("Click {string} on NavigationBar")
    public void clickNavigationBar(String Card)  {
        header.clickCard(Card);
    }


    @Then("should see {string} on NavigationBar")
    public void shouldSeeOnNavigationBar(String card) {
        header.checkCard(card);
    }


}

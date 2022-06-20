package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class Header {

Pages.Header header=new Pages.Header();

    @When("Select Category as {string} -- {string} -- {string}")
    public void selectCategoryAsMainCategoryCategorySubCategory(String mainCategory, String category,String subCategory) {
        header.selectCategory(mainCategory,category,subCategory);

    }

    @And("Click {string} NavigationBar")
    public void clickNavigationBar(String Card) {
        header.clickCard(Card);
    }


}

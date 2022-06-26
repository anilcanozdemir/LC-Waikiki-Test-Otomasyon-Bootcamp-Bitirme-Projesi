package android.androidStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class categoriesPage  {
    android.androidPages.categoriesPage categoriesPage=new android.androidPages.categoriesPage();
    @When("Select Category as {string} -- {string} -- {string} from CategoriesPage")
    public void selectCategoryAsFromCategoriesPage(String mainCategory, String category, String subCategory) {
        categoriesPage.clickCard("Kategoriler");
        categoriesPage.selectCategory(mainCategory,category,subCategory);
    }
}

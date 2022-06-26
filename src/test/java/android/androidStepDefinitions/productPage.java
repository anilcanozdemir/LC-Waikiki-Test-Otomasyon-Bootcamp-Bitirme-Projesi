package android.androidStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class productPage  {
android.androidPages.productPage productPage=new android.androidPages.productPage();

    @Then("should see AppProductPage")
    public void shouldSeeAppProductPage() {
        productPage.checkProductPage();
    }

    @And("Choose Size Option {string} from AppProductPage")
    public void chooseSizeOptionFromAppProductPage(String size) {
        productPage.chooseSize(size);
        
    }

    @And("Add to Cart from AppProductPage")
    public void addToCartFromAppProductPage() {
        productPage.addToCart();
        
    }

    @And("Click {string} on SlideDownMenu from AppProductPage")
    public void clickOnSlideDownMenuFromAppProductPage(String button) {
     productPage.clickButtonOnSlideDownMenu(button);
    }
}

package StepDefinitions;

import io.cucumber.java.en.And;


public class ProductPage {
    Pages.ProductPage productPage = new Pages.ProductPage();

    @And("Choose Size Option {string}")
    public void chooseSizeOption(String size) {
        productPage.chooseSize(size);
    }

    @And("Add to Cart")
    public void addToCart() {
        productPage.addToCart();
    }


}

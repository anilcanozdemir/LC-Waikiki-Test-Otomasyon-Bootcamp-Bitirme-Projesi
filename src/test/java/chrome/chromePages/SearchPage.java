package chrome.chromePages;

import org.openqa.selenium.By;


public class SearchPage extends Header{
    By productListContainer=By.className("product-list-container");

    By colorOptionText=By.className("color-filter-option__text");
    By productCardTitle=By.className("product-card__title");

    public void filterByColor(String value) {
        elementHelper.click(elementHelper.findElementByText(colorOptionText,value));
    }

    public void clickProductByName(String productName) {
        elementHelper.waitForElements(productCardTitle,96);
        elementHelper.click(elementHelper.findElementByText(productCardTitle,productName));
    }

    public void checkSearchPage() {
        elementHelper.findElement(productListContainer);
    }


}

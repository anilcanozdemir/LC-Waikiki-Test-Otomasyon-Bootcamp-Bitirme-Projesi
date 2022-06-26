package chromePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CartPage extends Header {
    By itemTitles = By.className("rd-cart-item-title");
    By gotoParentElement = By.xpath("..");
    By itemSize = By.className("rd-cart-item-size");

    By itemQuantity = By.cssSelector(" div.rd-cart-item-quantity-area > div > input");
    By cartContent = By.id("ShoppingCartContent");
    By checkOutButton = By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-4.desktop-price-info > div.col-md-12.pl-20.pr-20 > a");

    public void proceedToCheckOut() {
        elementHelper.click(checkOutButton);
    }

    public void checkProductCountity(String productName, int productCount) {
        WebElement parentElement=elementHelper.findElement(checkProductName(productName),gotoParentElement);
        elementHelper.checkAttribute(elementHelper.findElement(parentElement,itemQuantity),"data-quantity",Integer.toString(productCount));
    }

    public WebElement checkProductName(String productName) {

        return elementHelper.findElementByText(itemTitles,productName);
    }

    public void checkProductSize(String productName, String productSize) {
      elementHelper.checkElementText( elementHelper.findElement( elementHelper.findElement(checkProductName(productName),gotoParentElement),itemSize),"Beden: " + productSize);

    }

    public void checkCartPage() {
        elementHelper.findElement(cartContent);
    }
}

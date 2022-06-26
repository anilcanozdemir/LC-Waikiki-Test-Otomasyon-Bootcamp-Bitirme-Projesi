package chromePages;

import org.openqa.selenium.By;

public class ProductPage extends Header {
    By productTitle = By.className("product-title");
    By toolTipHeader=By.id("evamToolTipTop");
    By optionSize=By.id("option-size");
    By allChilds=By.cssSelector("*");
    By addToCart=By.id("pd_add_to_cart");

    public void addToCart() {
        elementHelper.click(addToCart);
    }

    public void chooseSize(String size) {

        elementHelper.findElements(optionSize,allChilds);
        elementHelper.click(elementHelper.findElementByText(optionSize,allChilds,size));

    }

    public void checkProductPage() {

        try {
            elementHelper.click(toolTipHeader);
        }
        catch (Exception ignored){}
        finally
        {
            elementHelper.findElement(productTitle);
        }


    }
}

package android.androidPages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class productPage extends navigationBar {
    By scrollCardViewOverlay = By.id("com.lcwaikiki.android:id/scrollCardViewOverlay");
    By productSizeText = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/productSizeText\")");
    By basket = By.id("com.lcwaikiki.android:id/basket");
    By productTitleText = By.id("com.lcwaikiki.android:id/productTitleText");

    public void checkProductPage() {
        elementHelper.findElement(productTitleText);
    }

    public void chooseSize(String size) {
        elementHelper.findElement(scrollCardViewOverlay).click();
        elementHelper.findElementByText(productSizeText, size).click();

    }

    public void addToCart() {
        elementHelper.click(basket);
    }

    public void clickButtonOnSlideDownMenu(String button) {
        elementHelper.findAndroidElementByText(button).click();
    }
}

package android.androidPages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class cartPage extends navigationBar {
By itemBasketTitleText= By.id("com.lcwaikiki.android:id/itemBasketTitleText");
    By itemBasketSizeText=By.id("com.lcwaikiki.android:id/itemBasketSizeText");
    By itemBasketColorText=By.id("com.lcwaikiki.android:id/itemBasketColorText");
    By itemBasketCountText= By.id("com.lcwaikiki.android:id/itemBasketCountText");
By goCheckOut=By.id("com.lcwaikiki.android:id/tv_go_checkout");



    public void checkProductName(String productName) {
        elementHelper.checkElementText(itemBasketTitleText,productName);
    }

    public void checkProductSize(String productSize) {

        elementHelper.checkElementText(itemBasketSizeText,productSize);
    }

    public void checkProductCountity(int productCount) {
        elementHelper.checkElementText(itemBasketCountText, String.valueOf(productCount));
    }

    public void checkCartPage() {
    }

    public void proceedToCheckOut() {
        elementHelper.click(goCheckOut);
    }

    public void checkProductColor(String productColor) {
        elementHelper.checkElementText(itemBasketColorText,productColor );
    }
}

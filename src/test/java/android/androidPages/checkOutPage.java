package android.androidPages;

import org.openqa.selenium.By;

public class checkOutPage  extends navigationBar{
    By deliveryTypeContent= By.id("com.lcwaikiki.android:id/deliveryTypeContent");

    public void checkCheckOutPage() {
            elementHelper.findElement(deliveryTypeContent);
    }
}

package android.androidPages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import util.ElementHelper;

public class navigationBar {
    ElementHelper elementHelper;
    By navigationBarButtons = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/textItemTab\")");
    By gotoParent=By.xpath("..");
    public navigationBar() {
        elementHelper = ElementHelper.getInstance();
    }

    public void checkSelectedNavigationButton(String text) {
         elementHelper.checkAttribute( elementHelper.findElementByText(navigationBarButtons, text),"selected","true");
    }

    public void checkNavigationButton(String text) {
        elementHelper.findElementByText(navigationBarButtons, text);
    }

    public void clickCard(String card) {
        elementHelper.findElementByText(navigationBarButtons, card).click();
    }
}

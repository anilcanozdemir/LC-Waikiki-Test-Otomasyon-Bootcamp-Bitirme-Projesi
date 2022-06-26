package android.androidPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DIRECTIONS;

public class searchPage extends navigationBar {
    By filter= By.id("com.lcwaikiki.android:id/filter_product");
    By checkSearchPage=By.id("com.lcwaikiki.android:id/tvProductCount");
    By itemFilterText= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemFilterText\")");
    By searchFilterEditText=By.id("com.lcwaikiki.android:id/searchFilterEditText");
    By checkedColorText=By.id("com.lcwaikiki.android:id/checked_color_text");
    By subFilterButton=By.id("com.lcwaikiki.android:id/subFilterButton");
    By buttonFilter=By.id("com.lcwaikiki.android:id/buttonFilter");

    public void checkSearchPage() {
        elementHelper.findElement(checkSearchPage);
    }

    public void filterByColor(String value) {
        elementHelper.click(filter);
        elementHelper.findElementByText(itemFilterText,"Renk").click();
        elementHelper.sendKeys(searchFilterEditText,value);
        elementHelper.click(checkedColorText);
        elementHelper.click(subFilterButton);
        elementHelper.click(buttonFilter);
    }

    public void clickProductByName(String productName) {
        while (elementHelper.findAndroidElementByText(productName)==null) {
            elementHelper.scrollTo(DIRECTIONS.DOWN);
        }
        System.out.println(elementHelper.findAndroidElementByText(productName).getText());
        elementHelper.tap((AndroidElement)( elementHelper.findAndroidElementByText(productName)));
    }
}

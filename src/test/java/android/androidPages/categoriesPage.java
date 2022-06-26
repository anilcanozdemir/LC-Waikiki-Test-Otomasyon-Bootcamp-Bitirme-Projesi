package android.androidPages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import util.DIRECTIONS;

public class categoriesPage extends navigationBar {
    By mainCategories= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/categoryBannerText\")");
    By categories=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/categoryText\")");
    By subCategories=By.className("android.widget.TextView");;

    public void selectCategory(String mainCategory, String category, String subCategory) {
        elementHelper.findElementByText(mainCategories,mainCategory).click();
        elementHelper.findElementByText(categories,category).click();




        while (elementHelper.findElementByText(subCategories,subCategory,false)==null)
        {
            elementHelper.scrollTo(DIRECTIONS.DOWN);        }
        elementHelper.findElementByText(subCategories,subCategory).click();
        }



}

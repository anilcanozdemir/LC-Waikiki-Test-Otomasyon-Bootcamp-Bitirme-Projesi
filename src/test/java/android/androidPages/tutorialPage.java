package android.androidPages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;


public class tutorialPage extends navigationBar {
    By content= By.id("com.lcwaikiki.android:id/tvContent");
    By tvTitle=By.id("com.lcwaikiki.android:id/tvTitle");
By textView=By.id("com.lcwaikiki.android:id/textView");
By tvNext=By.id("com.lcwaikiki.android:id/tvNext");
  By element1=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
          "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget." +
          "ViewPager/android.widget.FrameLayout[2]/android.widget.ImageView");
 By   element2=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
         "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget." +
         "ViewPager/android.widget.FrameLayout[1]/android.widget.ImageView");

    public void IsOpened() {
elementHelper.findElement(content);
    }

    public void checkTvTutorial() {
        elementHelper.findElement(tvTitle);
    }

    public void checkText(String text) {
        elementHelper.checkElementText(textView,text);
    }

    public void checkTitleDescription(String description) {
        elementHelper.checkElementText(content,description);
    }

    public void checkButton(String button) {
        elementHelper.checkElementText(tvNext,button);
    }

    public void dragAndDropTvTutorial() {
        elementHelper.dragAndDrop(element1,element2);
    }

    public void clickSkipButton() {
        elementHelper.click(tvNext);
    }

    public void checkTutorialTitle(String tutorialTitle) {
        elementHelper.checkElementText(tvTitle,tutorialTitle);
    }
}

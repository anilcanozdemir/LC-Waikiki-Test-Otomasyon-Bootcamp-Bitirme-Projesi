package android.androidPages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class homePage extends navigationBar {

By header= By.id("com.lcwaikiki.android:id/txtWelcomeHeader");
    public void checkHomePage() {
        elementHelper.findElement(header);
    }
}

package chrome.chromePages;

import org.openqa.selenium.By;

public class HomePage extends Header {
    By homePageContainer = By.id("container");
    By couponContainer = By.id("editable-trigger-1503346604");
    By buttonCookies=By.xpath("//*[@id=\"cookieseal-banner\"]/div/button[2]");
    public void checkHomePage() {

        try {

            elementHelper.click(couponContainer);
            elementHelper.click(buttonCookies);
        } catch (Exception ignored) {
        } finally {
            elementHelper.findElement(homePageContainer);
        }

    }

}


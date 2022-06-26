package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import io.appium.java_client.TouchAction;


import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class ElementHelper {
    private static ElementHelper elementHelper = null;
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    private ElementHelper() {
        driver = DriverFactory.getDriver("Android");
        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }

    public static ElementHelper getInstance() {
        if (elementHelper == null) {
            elementHelper = new ElementHelper();
        }
        return elementHelper;
    }

    public void AssertAlert(boolean condition) {
        Assert.assertEquals(condition, true);
    }

    public String getText(By key) {
        return findElement(key).getText();
    }

    public void checkElementText(By key, String text) {
        wait.until(ExpectedConditions.textToBe(key, text));
    }

    public boolean checkElementText(WebElement element, String text) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(element));
        } catch (Exception ignored) {
        }

/*  try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        catch (Exception ignored){}*/
        return element.getText().contains(text);
    }

    public String getAttribute(By key, String attribute) {
        return findElement(key).getAttribute(attribute);
    }

    public String getAttribute(WebElement webElement, String attribute) {
        return webElement.getAttribute(attribute);
    }

    public void checkAttribute(By key, String attr, String text) {
        Assert.assertEquals(getAttribute(key, attr), text);
    }

    public void checkAttribute(WebElement webElement, String attr, String text) {

        Assert.assertEquals(getAttribute(webElement, attr), text);
    }

    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement presenceElement(WebElement element, By key) {
        return wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, key));
    }

    public WebElement presenceElement(By parent, By key) {
        return wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(parent, key));
    }

    public List<WebElement> presenceElements(By key) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(key));
    }

    private List<WebElement> presenceElements(By parent, By key) {
        return wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(parent, key));
    }


    public WebElement findElement(By key) {

        return presenceElement(key);
    }

    public WebElement findElement(WebElement parentElement, By key) {

        return presenceElement(parentElement, key);
    }

    public WebElement findElement(By parentElement, By key) {

        return presenceElement(parentElement, key);
    }

    public List<WebElement> findElements(By key) {

        return presenceElements(key);
    }

    public List<WebElement> findElements(By parent, By key) {

        return presenceElements(parent, key);
    }


    public WebElement findElementByText(By key, String text) {
        boolean find = false;
        for (WebElement element : findElements(key)) {

            if (checkElementText(element, text)) {
                find = true;
                return element;
            }
        }
        Assert.assertTrue(find);
        return null;
    }

    public WebElement findElementByText(By key, String text, boolean warning) {
        boolean find = false;
        for (WebElement element : findElements(key)) {

            if (checkElementText(element, text)) {
                find = true;
                return element;
            }
        }
        if (warning) {
            Assert.assertTrue(find);
        }
        return null;
    }

    public WebElement findElementByText(By parent, By key, String text) {
        boolean find = false;
        for (WebElement element : findElements(parent, key)) {
            if (checkElementText(element, text)) {
                find = true;
                return element;
            }
        }
        Assert.assertTrue(find);
        return null;
    }

    public void click(By key) {
        wait.until(ExpectedConditions.elementToBeClickable(findElement(key))).click();
    }

    public void click(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public void mouseHoverOnElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actions.moveToElement(element).perform();

    }

    public void mouseHoverOnElement(By key) {
        wait.until(ExpectedConditions.elementToBeClickable(findElement(key)));
        actions.moveToElement(findElement(key)).perform();

    }

    public void sendKeys(By key, String text) {
        findElement(key).click();
        findElement(key).sendKeys(text);
    }


    public boolean urlContains(String text) {
        return wait.until(ExpectedConditions.urlContains(text));
    }

    public void waitUrl(String url) {
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void waitForElements(By key, int i) {
        wait.until(ExpectedConditions.visibilityOfAllElements(wait.until(ExpectedConditions.numberOfElementsToBe(key, i))));

    }

    public WebElement findAndroidElementByText(String text) {
        return driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + text + "\")"));
    }

    public void dragAndDrop(By element1, By element2) {
        actions.dragAndDrop(elementHelper.findElement(element1), elementHelper.findElement(element2)).build().perform();
    }


    public void scrollTo(DIRECTIONS direction) {

        if (direction.equals(DIRECTIONS.DOWN)) {

            Dimension dim = driver.manage().window().getSize();

            int width = dim.getWidth() / 2;

            int startY = (int) (dim.getHeight() * 0.8);

            int endY = (int) (dim.getHeight() * 0.7);

            new TouchAction((AppiumDriver) driver).press(point(width, startY)).waitAction(waitOptions(Duration.ofMillis(300)))

                    .moveTo(point(width, endY)).release().perform();


        }
        if (direction.equals(DIRECTIONS.RIGHT)) {

            Dimension dim = driver.manage().window().getSize();

            int height = dim.getHeight() / 2;

            int startX = (int) (dim.getWidth() * 0.8);

            int endX = (int) (dim.getWidth() * 0.7);

            new TouchAction((AppiumDriver) driver).press(point(startX, height)).waitAction(waitOptions(Duration.ofMillis(300)))

                    .moveTo(point(endX, height)).release().perform();


        }
        if (direction.equals(DIRECTIONS.LEFT)) {

            Dimension dim = driver.manage().window().getSize();

            int height = dim.getHeight() / 2;

            int endX = (int) (dim.getWidth() * 0.8);

            int startX = (int) (dim.getWidth() * 0.7);

            new TouchAction((AppiumDriver) driver).press(point(startX, height)).waitAction(waitOptions(Duration.ofMillis(300)))

                    .moveTo(point(endX, height)).release().perform();


        }
        if (direction.equals(DIRECTIONS.UP)) {

            Dimension dim = driver.manage().window().getSize();

            int width = dim.getWidth() / 2;


            int startY = (int) (dim.getHeight() * 0.5);

            int endY = (int) (dim.getHeight() * 0.9);

            new TouchAction((AppiumDriver) driver).press(point(width, startY)).waitAction(waitOptions(Duration.ofMillis(300)))

                    .moveTo(point(width, endY)).release().perform();

        }


    }


    public void tap(AndroidElement element) {
        new TouchAction((AppiumDriver) driver)
                .tap(point(element.getCenter().x, element.getCenter().y + -300)).perform();

    }
}

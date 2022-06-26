package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    private static ElementHelper elementHelper = null;

    private ElementHelper() {
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, 3);
        actions = new Actions(driver);
    }

    public static ElementHelper getInstance() {
        if (elementHelper == null) {
            elementHelper = new ElementHelper();
        }
        return elementHelper;
    }

    public void AssertAlert(boolean condition) {
        Assert.assertEquals(true, condition);
    }

    public String getText(By key) {
        return findElement(key).getText();
    }

    public boolean checkElementText(By key, String text) {
        return wait.until(ExpectedConditions.textToBe(key, text));
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
        Assert.assertEquals(getAttribute(key, attr),text);
    }

    public void checkAttribute(WebElement webElement, String attr, String text) {

        Assert.assertEquals(getAttribute(webElement, attr),text);
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

    public void scrollToElement(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);

    }

    public WebElement findElement(By key) {
        WebElement element = presenceElement(key);
        scrollToElement(element);
        return element;
    }

    public WebElement findElement(WebElement parentElement, By key) {
        WebElement element = presenceElement(parentElement, key);
        scrollToElement(element);
        return element;
    }

    public WebElement findElement(By parentElement, By key) {
        WebElement element = presenceElement(parentElement, key);
        scrollToElement(element);
        return element;
    }

    public List<WebElement> findElements(By key) {
        List<WebElement> elements = presenceElements(key);
        scrollToElement(elements.get(0));
        return elements;
    }

    public List<WebElement> findElements(By parent, By key) {
        List<WebElement> elements = presenceElements(parent, key);
        scrollToElement(elements.get(0));
        return elements;
    }


    public WebElement findElementByText(By key, String text) {
        boolean find = false;
        for (WebElement element : findElements(key)) {
            if (checkElementText(element, text)) {
                find = true;
                return element;
            }
        }
        Assert.assertEquals(true, find);
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
        Assert.assertEquals(true, find);
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
        findElement(key).sendKeys(text);
    }


    public boolean urlContains(String text) {
        return wait.until(ExpectedConditions.urlContains(text));
    }

    public void waitUrl(String url) {
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void waitForElements(By key, int i) {
       wait.until(ExpectedConditions.visibilityOfAllElements( wait.until(ExpectedConditions.numberOfElementsToBe(key,i))));

    }
}

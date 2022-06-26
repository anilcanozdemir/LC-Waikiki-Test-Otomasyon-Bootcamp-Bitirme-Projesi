package chromePages;

import org.openqa.selenium.By;

import util.ElementHelper;

public class Header {
    By dropDownLabel = By.className("dropdown-label");
    By menuHeaderItems = By.className("menu-header-item__title");
    By zoneHeaders = By.className("zone-header__anchor");
    By zoneItems = By.className("zone-item__anchor");
    By signUpButton = By.xpath("//*[@id=\"header__container\"]/header/div[2]/div[3]/div/span/div/div/div/div[2]/a");
    ElementHelper elementHelper;
    public Header() {
        elementHelper = ElementHelper.getInstance();
    }

    public void selectCategory(String mainCategory, String category, String subCategory) {

        elementHelper.mouseHoverOnElement(elementHelper.findElementByText(menuHeaderItems, mainCategory));
        elementHelper.mouseHoverOnElement(elementHelper.findElementByText(zoneHeaders, category));
        elementHelper.click(elementHelper.findElementByText(zoneItems, subCategory));

    }

    public void clickCard(String card) {

        elementHelper.click(elementHelper.findElementByText(dropDownLabel, card));

    }

    public void checkCard(String card) {
        elementHelper.findElementByText(dropDownLabel, card);
    }

    public void HoverOverCard(String card) {
        elementHelper.mouseHoverOnElement(elementHelper.findElementByText(dropDownLabel, card));
    }

    public void clickSignup() {
        elementHelper.click(signUpButton);
    }
}

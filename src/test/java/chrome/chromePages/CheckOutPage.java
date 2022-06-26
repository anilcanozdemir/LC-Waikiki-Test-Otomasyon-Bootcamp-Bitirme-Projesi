package chrome.chromePages;

import org.openqa.selenium.By;

public class CheckOutPage extends Header {
    By orderSummary= By.className("orderSummary");
    public void checkCheckOutPage() {
        //CANT GO TO CHECKOUTPAGE WITHOUT LOGIN
       elementHelper.findElement(orderSummary);
    }
}

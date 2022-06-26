package chromePages;

import org.openqa.selenium.By;

public class LoginPage extends Header {


    By loginFormTitle = By.className("login-form__title");
    By loginType = By.className("login-form__radio-buttons--span");
    By Email = By.name("email");
    By Password = By.name("password");
    By loginButton = By.cssSelector("#login > div > div > div > div > form > button");
    By showPassword = By.className("login-form__show-password-icon");

    public void login(String email, String password, String loginOption) {

        elementHelper.click(elementHelper.findElementByText(loginType, loginOption));


        elementHelper.sendKeys(Email, email);
        elementHelper.sendKeys(Password, password);
        elementHelper.click(showPassword);
        elementHelper.click(loginButton);
        elementHelper.waitUrl("https://www.lcwaikiki.com/tr-TR/TR");



    }

    public void checkLoginPage() {
        elementHelper.checkElementText(loginFormTitle, "GİRİŞ YAP");


    }
}

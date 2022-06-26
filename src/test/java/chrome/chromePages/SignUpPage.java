package chrome.chromePages;

import org.openqa.selenium.By;

public class SignUpPage extends Header{
    By email=By.name("email");
    By password=By.name("password");
    By phone=By.name("phone");
    By signUpButton=By.cssSelector("#register > div > div > div > form > button");
    By memberPrivacyApprove=By.name("memberPrivacyApprove");
    public void signUp(String email, String password, String phone) {
        elementHelper.sendKeys(this.email,email);
        elementHelper.sendKeys(this.password,password);
        elementHelper.sendKeys(this.phone,phone);
        elementHelper.click(memberPrivacyApprove);
        elementHelper.click(signUpButton);
    }
}

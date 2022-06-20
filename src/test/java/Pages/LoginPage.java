package Pages;

import org.openqa.selenium.By;

public class LoginPage extends  Header{

By loginFormTitle=By.className("login-form__title");
    public void login(String email, String password, String loginOption) {

    }

    public boolean checkLoginPage() {
        return this.elementHelper.checkElementText(loginFormTitle,"Giriş Yap");
    }
}

package android.androidPages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class profilePage extends navigationBar {
    By radioBtnEmail = By.id("com.lcwaikiki.android:id/radioBtnEmail");
    By radioBtnPhone = By.id("com.lcwaikiki.android:id/radioBtnPhone");
    By edtPhone = By.id("com.lcwaikiki.android:id/edtPhone");
    By edtPassword = By.id("com.lcwaikiki.android:id/edtPassword");
    By edtEmail = By.id("com.lcwaikiki.android:id/edtEmail");
    By contractChecked = By.id("com.lcwaikiki.android:id/contractChecked");
    By btnRegister = By.id("com.lcwaikiki.android:id/buttonRegister");
    By btnLogin = By.id("com.lcwaikiki.android:id/buttonLogin");
    By autoFillSaveYes = By.id("android:id/autofill_save_yes");

    public void login(String auth, String password, String loginOption) {

        if (loginOption.equals("E-Posta")) {
            elementHelper.click(radioBtnEmail);

            elementHelper.sendKeys(edtEmail, auth);
            elementHelper.sendKeys(edtPassword, password);
        } else {
            elementHelper.click(radioBtnPhone);

            elementHelper.sendKeys(edtPhone, auth);
            elementHelper.sendKeys(edtPassword, password);
        }
        elementHelper.click(btnLogin);
        try {
            elementHelper.click(autoFillSaveYes);
        } catch (Exception ignored) {

        }
    }

    public void signUp(String email, String password, String phone) {
        elementHelper.sendKeys(edtEmail, email);
        elementHelper.sendKeys(edtPassword, password);
        elementHelper.sendKeys(edtPhone, phone);
        elementHelper.click(contractChecked);
        elementHelper.click(btnRegister);
    }
}

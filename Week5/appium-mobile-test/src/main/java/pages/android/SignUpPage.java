package pages.android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignUpPage extends HomePage {

    By signUpImage = By.xpath("//android.view.View[@content-desc='Kayıt Ol']");
    By emailText = By.xpath("(//android.widget.EditText) [2]");
    By passwordText = By.xpath("(//android.widget.EditText) [3]");
    By registrationOk = By.xpath("//*[@text='kaydınızı tamamlayın']");


    public SignUpPage(AndroidDriver driver) {
        super(driver);
    }

    public void signUp(String email, String password) {
        click(signUpImage);
        sendKeysElement(emailText, email);
        sendKeysElement(passwordText, password);
        scrollAndClick("Kayıt Ol", driver);
    }

    public String registrationOkText() {
        return getText(registrationOk);
    }

    public String mailCantBeEmptyMessage() {
        return scrollAndGetText("Email boş olamaz", driver);
    }

    public String passwordCantBeEmptyMessage() {
        return scrollAndGetText("Şifre giriniz", driver);
    }


}

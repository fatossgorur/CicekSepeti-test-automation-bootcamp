package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import java.net.MalformedURLException;

public class SignUpPage extends HomePage {

    By signUpImage = By.xpath("//android.view.View[@content-desc='Kayıt Ol']");
    By emailText = By.xpath("(//android.widget.EditText) [2]");
    By passwordText = By.xpath("(//android.widget.EditText) [3]");
    By registrationOk = By.xpath("//*[@text='kaydınızı tamamlayın']");


    public SignUpPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public void signUp(String email, String password) {
        click(signUpImage);
        sendKeysElement(emailText, email);
        sendKeysElement(passwordText, password);
        scrollAndClick("Kayıt Ol");
    }

    public String registrationOkText() {
        return getText(registrationOk);
    }

    public String mailCantBeEmptyMessage() {
        return scrollAndGetText("Email boş olamaz");
    }

    public String passwordCantBeEmptyMessage() {
        return scrollAndGetText("Şifre giriniz");
    }

    public void verifyRegistrationMessage(String registrationOkMessage) {
        String registrationMessage = "kaydınızı tamamlayın";
        Assert.assertEquals(registrationMessage, registrationOkMessage);
    }

    public void verifyNullEmailAndPasswordMessage(String nullMailMessage, String nullPasswordMessage) {
        String mailMessage = "Email boş olamaz";
        String passwordMessage = "Şifre giriniz";
        Assert.assertEquals(mailMessage, nullMailMessage);
        Assert.assertEquals(passwordMessage, nullPasswordMessage);
    }


}

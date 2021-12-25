package android;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.android.HomePage;
import pages.android.SignUpPage;

public class SignUpPageTest extends BaseTest {

    @Test
    public void successfulSignUp() {
        String registrationMessage = "kaydınızı tamamlayın";
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.clickAccountButton();
        signUpPage.signUp("appium.deneme@hotmail.com", "cicek146sepeti23");
        String registrationOkMessage = signUpPage.registrationOkText();
        Assert.assertEquals(registrationMessage, registrationOkMessage);
    }

    @Test
    public void signUpWithBlankEmailAndPassword() {
        String mailMessage = "Email boş olamaz";
        String passwordMessage = "Şifre giriniz";
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.clickAccountButton();
        signUpPage.signUp("", "");
        String nullMailMessage = signUpPage.mailCantBeEmptyMessage();
        String nullPasswordMessage = signUpPage.passwordCantBeEmptyMessage();
        Assert.assertEquals(mailMessage, nullMailMessage);
        Assert.assertEquals(passwordMessage, nullPasswordMessage);
    }

}

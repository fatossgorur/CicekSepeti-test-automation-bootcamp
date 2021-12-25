package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpPage;

import java.net.MalformedURLException;

public class SignUpPageStep {

    public AndroidDriver driver;
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    public SignUpPageStep() throws MalformedURLException {
    }

    @And("click account button")
    public void clickAccountButton() throws MalformedURLException {
        homePage.clickAccountButton();
    }

    @When("sign up with {string} and {string}")
    public void signUpWithAnd(String email, String password) {
        signUpPage.signUp(email, password);
    }

    @Then("verify registration ok message")
    public void verifyRegistrationOkMessage() {
        String registrationOkMessage = signUpPage.registrationOkText();
        signUpPage.verifyRegistrationMessage(registrationOkMessage);
    }

    @Then("verify null email and password message")
    public void verifyNullEmailAndPasswordMessage() {
        String nullMailMessage = signUpPage.mailCantBeEmptyMessage();
        String nullPasswordMessage = signUpPage.passwordCantBeEmptyMessage();
        signUpPage.verifyNullEmailAndPasswordMessage(nullMailMessage, nullPasswordMessage);

    }
}

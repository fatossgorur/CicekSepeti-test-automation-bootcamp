package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.Driver;

import java.net.MalformedURLException;

public class HomePageStep {

    public AndroidDriver driver;
    HomePage homePage = new HomePage();

    public HomePageStep() throws MalformedURLException {
    }

    @Given("navigate to website")
    public void navigateToWebsite() throws MalformedURLException {
        driver = Driver.getDriver();
    }

    @When("search product name {string}")
    public void searchProductName(String productName) {
        homePage.searchProduct(productName);
    }

    @Then("verify product name {string} and page title")
    public void verifyProductNameAndPageTitle(String keyword) {
        String pageTitle = homePage.getSearchResultTitle();
        homePage.verifyProductNameAndPageTitle(pageTitle, keyword);
    }

    @Then("verify product name {string} and redirected page title")
    public void verifyProductNameAndRedirectedPageTitle(String keyword) {
        String pageTitle = homePage.getRedirectedPageTitle();
        homePage.verifyProductNameAndRedirectedPageTitle(keyword, pageTitle);
    }

    @After
    public void quitDriver() {
        Driver.closeDriver();
    }
}

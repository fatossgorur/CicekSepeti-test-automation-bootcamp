package definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.Driver;

import java.time.Duration;

public class SearchStep {
    private WebDriver driver;
    HomePage homePage = new HomePage();

    @Given("navigate to website")
    public void navigateToWebsiteAndClickPopup() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gratis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("enter product name {string}")
    public void enterProductName(String productName) throws InterruptedException {
        homePage.enterProductName(productName);
        Thread.sleep(2000);
    }

    @And("click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @Then("verify search result {string}")
    public void verifySearchResult(String productList) {
        homePage.verifyProducts(productList);
    }

    @Then("verify failed search result {string}")
    public void verifyFailedSearchResult(String noFound) {
        homePage.verifyNoProducts(noFound);
    }


    @And("click reset button")
    public void clickResetButton() {
        homePage.clickResetButton();
    }

    @Then("verify that the entered product name is deleted")
    public void verifyIsDeleted() {
        homePage.suggestionPopup();
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}

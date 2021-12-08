package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    WebDriver driver;
    Methods methods;

    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        methods = new Methods();
    }

    @FindBy(className = "search-input")
    private WebElement searchBoxField;

    public void enterProductName(String productName) {
        methods.sendKeysElement(searchBoxField, productName);
    }

    @FindBy(css = "button[type='submit']")
    private WebElement searchButton;

    public void clickSearchButton() {
        methods.clickElement(searchButton);
    }

    @FindBy(css = "span[class='info']")
    private WebElement productsFound;

    public void verifyProducts(String productList) {
        String productsFoundText = methods.getText(productsFound);
        Assert.assertTrue(productsFoundText.contains(productList));
    }

    @FindBy(css = "p[class='highlighted']")
    private WebElement noProductsFound;

    public void verifyNoProducts(String noFound) {
        String noFoundText = methods.getText(noProductsFound);
        Assert.assertTrue(noFoundText.contains(noFound));
    }

    @FindBy(css = "span[class='typeahead__cancel-button']")
    private WebElement resetSearchButton;

    public void clickResetButton() {
        methods.clickElement(resetSearchButton);
    }


    @FindBy(className = "typeahead__result")
    private WebElement suggestionPopup;

    public void suggestionPopup() {
        Boolean value = methods.isDisplayed(suggestionPopup);
        Assert.assertTrue(value);
    }

}

package pages.android;

import helper.android.Helper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends Helper {

    By accountButton = By.xpath("(//android.widget.Image) [4]");
    By searchField = By.xpath("//*[@text='Neyi en ucuza almak istersin?']");
    By searchFieldText = By.xpath("(//android.widget.EditText) [2]");
    By searchResultTitle = By.xpath("//*[@text=\"Kahve Makinesi Fiyatları\"]");
    By redirectedPageTitle = By.xpath("(//android.view.View[2]) [4]");

    public HomePage(AndroidDriver driver) {
        super(driver);
    }


    public SignUpPage clickAccountButton() {
        click(accountButton);
        return new SignUpPage(driver);
    }

    public void searchProduct(String value) {
        clickElement(searchField);
        sendKeysElement(searchFieldText, value);
        pressEnter(driver);
    }

    public String getSearchResultTitle() {
        return getText(searchResultTitle);
    }

    public String getRedirectedPageTitle() {
        return getText(redirectedPageTitle);
    }


}

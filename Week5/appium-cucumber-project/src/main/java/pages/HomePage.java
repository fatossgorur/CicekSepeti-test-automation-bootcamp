package pages;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.Helper;

import java.net.MalformedURLException;

public class HomePage extends Helper {

    By accountButton = By.xpath("(//android.widget.Image) [4]");
    By searchField = By.xpath("//*[@text='Neyi en ucuza almak istersin?']");
    By searchFieldText = By.xpath("(//android.widget.EditText) [2]");
    By searchResultTitle = By.xpath("//*[@text=\"Kahve Makinesi Fiyatları\"]");
    By redirectedPageTitle = By.xpath("(//android.view.View[2]) [4]");

    public HomePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public SignUpPage clickAccountButton() throws MalformedURLException {
        click(accountButton);
        return new SignUpPage();
    }

    public void searchProduct(String value) {
        clickElement(searchField);
        sendKeysElement(searchFieldText, value);
        pressEnter(AndroidKey.ENTER);
    }

    public String getSearchResultTitle() {
        return getText(searchResultTitle);
    }

    public void verifyProductNameAndPageTitle(String pageTitle, String keyword) {
        Assert.assertTrue(pageTitle.toLowerCase().contains(keyword));
    }

    public String getRedirectedPageTitle() {
        return getText(redirectedPageTitle);
    }

    public void verifyProductNameAndRedirectedPageTitle(String keyword, String pageTitle) {
        Assert.assertEquals(keyword, pageTitle.toLowerCase());
    }


}

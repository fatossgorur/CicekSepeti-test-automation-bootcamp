package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class Helper {

    public Helper() throws MalformedURLException {
    }

    private AndroidDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);


    public void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void clickElement(By elementBy) {
        AndroidElement element = (AndroidElement) driver.findElement(elementBy);
        element.click();
    }

    public void sendKeysElement(By elementBy, String value) {
        AndroidElement element = (AndroidElement) driver.findElement(elementBy);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public void pressEnter(AndroidKey KEY) {
        driver.pressKey(new KeyEvent(KEY));
    }

    public String getText(By elementBy) {
        AndroidElement element = (AndroidElement)driver.findElement(elementBy);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void scrollAndClick(String visibleText) {

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
    }

    public String scrollAndGetText(String visibleText) {

        return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").getText();
    }
}


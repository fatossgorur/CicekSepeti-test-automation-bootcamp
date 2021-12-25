package helper.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    public Helper(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }


    public void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void clickElement(By elementBy) {
        MobileElement element = driver.findElement(elementBy);
        element.click();
    }

    public void sendKeysElement(By elementBy, String value) {
        MobileElement element = driver.findElement(elementBy);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public static void pressEnter(AndroidDriver driver) {
        driver.getKeyboard().pressKey(Keys.ENTER);
    }

    public String getText(By elementBy) {
        MobileElement element = driver.findElement(elementBy);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void scrollAndClick(String visibleText, AndroidDriver driver) {

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
    }

    public String scrollAndGetText(String visibleText, AndroidDriver driver) {

        return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").getText();
    }
}


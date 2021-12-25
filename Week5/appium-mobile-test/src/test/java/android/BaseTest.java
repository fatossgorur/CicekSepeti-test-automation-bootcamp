package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("devicename", "emulator-5554");
        capabilities.setCapability("appPackage", "com.cimrimobilevoyager");
        capabilities.setCapability("appActivity", "com.cimrimobilevoyager.MainActivity");
        capabilities.setCapability("app", "\\Users\\FATOS\\Downloads\\com.cimrimobilevoyager.395.apk");
        capabilities.setCapability("fullReset", "true");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}

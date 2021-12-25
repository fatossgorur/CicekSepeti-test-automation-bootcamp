package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        if (driver == null) {
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
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

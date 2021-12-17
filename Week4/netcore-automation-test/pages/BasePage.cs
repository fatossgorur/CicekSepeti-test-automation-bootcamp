using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace netcore_automation_test
{

    public class BasePage
    {
        public static IWebDriver driver;
        public void SetupDriver()
        {
            ChromeOptions options = new ChromeOptions();
            options.AddArguments("--test-type", "--start-maximized");
            driver = new ChromeDriver(options);
            driver.Navigate().GoToUrl("https://www.amazon.com.tr/");
            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(40);
        }

        public void TearDown()
        {
            driver.Quit();
        }

    }
}
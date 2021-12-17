using System;
using OpenQA.Selenium;


namespace netcore_automation_test
{

    public class HomePage : Methods
    {
        public IWebDriver webDriver;
        public HomePage(IWebDriver driver) : base(driver)
        {
            webDriver = driver;
        }

        public IWebElement Cookie => webDriver.FindElement(By.ClassName("a-button-primary"));
        public IWebElement AccountandList => webDriver.FindElement(By.Id("nav-link-accountList"));
        public IWebElement LoginButton => webDriver.FindElement(By.CssSelector("#nav-flyout-ya-signin .nav-action-inner"));
        public IWebElement AccountName => webDriver.FindElement(By.Id("nav-link-accountList-nav-line-1"));
        public IWebElement ElectronicMenu => webDriver.FindElement(By.XPath("//a[text()= 'Elektronik']"));

        public LoginPage GetLoginPage()
        {
            ClickElement(Cookie);
            HoverElement(AccountandList);
            ClickElement(LoginButton);
            return new LoginPage(webDriver);
        }

        public String GetAccountName()
        {
            return GetTextElement(AccountName);
        }
        public ProductsPage SelectElectronicMenu()
        {
            ClickElement(ElectronicMenu);
            return new ProductsPage(webDriver);
        }

    }


}
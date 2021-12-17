using System;
using OpenQA.Selenium;


namespace netcore_automation_test
{

    public class LoginPage : HomePage
    {
        public LoginPage(IWebDriver driver) : base(driver)
        {
            webDriver = driver;
        }

        public IWebElement emailLabel => webDriver.FindElement(By.Id("ap_email"));
        public IWebElement continueButton => webDriver.FindElement(By.ClassName("a-button-primary"));
        public IWebElement passwordLabel => webDriver.FindElement(By.Id("ap_password"));
        public IWebElement loginButton => webDriver.FindElement(By.Id("signInSubmit"));
        public HomePage login(String email, String password)
        {
            SendKeysElement(emailLabel, email);
            ClickElement(continueButton);
            SendKeysElement(passwordLabel, password);
            ClickElement(loginButton);
            return new HomePage(webDriver);
        }

    }

}
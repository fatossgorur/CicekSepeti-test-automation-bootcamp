using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Interactions;

using SeleniumExtras.PageObjects;

namespace netcore_automation_test
{

    public class Methods
    {

        protected static IWebDriver driver;
        Actions actions;
        IJavaScriptExecutor js;


        public Methods(IWebDriver driver)
        {
            Methods.driver = driver;
            PageFactory.InitElements(driver, this);
            actions = new Actions(driver);
            js = (IJavaScriptExecutor)driver;


        }


        public void ClickElement(IWebElement element)
        {
            element.Click();
        }
        public void SendKeysElement(IWebElement element, String value)
        {
            element.SendKeys(value);
        }

        public void HoverElement(IWebElement element)
        {
            actions.MoveToElement(element).Perform();
        }

        public String GetTextElement(IWebElement element)
        {
            return element.Text;

        }
        public void ClickElementWithJs(IWebElement element)
        {
            js.ExecuteScript("arguments[0].click();", element);
        }

        public void ScrollToElement(IWebElement element)
        {
            js.ExecuteScript("arguments[0].scrollIntoView(true);", element);

        }

        public String GetAttributeElement(IWebElement element, String attributeElement)
        {
            return element.GetAttribute(attributeElement);
        }


    }
}
using System;
using OpenQA.Selenium;


namespace netcore_automation_test
{

    public class ProductDetailPage : HomePage
    {
        public ProductDetailPage(IWebDriver driver) : base(driver)
        {
            webDriver = driver;
        }

        public IWebElement ProductTitle => webDriver.FindElement(By.Id("productTitle"));
        public IWebElement AddCartButton => webDriver.FindElement(By.Id("add-to-cart-button"));

        public String GetProductTitle()
        {
            return GetTextElement(ProductTitle);
        }
        public CartPage ClickAddCart()
        {
            ClickElementWithJs(AddCartButton);
            return new CartPage(webDriver);
        }

    }

}
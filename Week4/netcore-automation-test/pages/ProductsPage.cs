using System;
using OpenQA.Selenium;


namespace netcore_automation_test
{

    public class ProductsPage : HomePage
    {
        public ProductsPage(IWebDriver driver) : base(driver)
        {
            webDriver = driver;
        }

        public IWebElement MobilePhonesAccessories => webDriver.FindElement(By.CssSelector("img[alt='Cep Telefonları ve Aksesuarlar']"));
        public IWebElement BestSellers => webDriver.FindElement(By.CssSelector("a[href*='bestsellers/electronics/13709880031']"));
        public IWebElement BestSellersPageTitle => webDriver.FindElement(By.ClassName("zg_banner_text"));
        public IWebElement BestSellersResultsTitle => webDriver.FindElement(By.ClassName("a-spacing-medium"));
        public IWebElement BestSellersFirstProductName => webDriver.FindElement(By.CssSelector("#zg-ordered-list >li:first-of-type .p13n-sc-truncated"));
        public void ShopByCategory()
        {
            ClickElementWithJs(MobilePhonesAccessories);
        }

        public void ClickBestSellers()
        {
            ClickElementWithJs(BestSellers);
        }

        public String GetBestSellersPageTitle()
        {
            return GetTextElement(BestSellersPageTitle);
        }
        public String GetBestSellersResultsTitle()
        {
            return GetTextElement(BestSellersResultsTitle);
        }
        public String GetBestSellersFirstProductName()
        {
            ScrollToElement(BestSellersFirstProductName);
            return GetTextElement(BestSellersFirstProductName);
        }
        public ProductDetailPage SelectFirstProduct()
        {
            ClickElementWithJs(BestSellersFirstProductName);
            return new ProductDetailPage(webDriver);
        }

    }

}
using System;
using NUnit.Framework;


namespace netcore_automation_test
{

    [TestFixture]
    public class ProductDetailTest : BasePage
    {

        HomePage homePage;
        User user;

        [OneTimeSetUp]
        public void SetUp()
        {
            SetupDriver();
            user = new User();
            homePage = new HomePage(driver);
        }

        [Test]
        public void SelectedProductNameTest()
        {
            LoginPage loginPage = homePage.GetLoginPage();
            String email = user.GetEmail();
            String password = user.GetPassword();
            loginPage.login(email, password);
            ProductsPage productsPage = homePage.SelectElectronicMenu();
            productsPage.ShopByCategory();
            productsPage.ClickBestSellers();
            String BestSellersFirstProductName = productsPage.GetBestSellersFirstProductName();
            ProductDetailPage productDetailPage = productsPage.SelectFirstProduct();
            String SelectProductName = productDetailPage.GetProductTitle();
            //Check selected product name 
            Assert.AreEqual(BestSellersFirstProductName, SelectProductName);

        }

        [OneTimeTearDown]
        protected void Close()
        {
            TearDown();
        }

    }

}
using System;
using NUnit.Framework;


namespace netcore_automation_test
{

    [TestFixture]
    public class ProductTest : BasePage
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
        public void BestSellersCategoryTest()
        {
            LoginPage loginPage = homePage.GetLoginPage();
            String email = user.GetEmail();
            String password = user.GetPassword();
            loginPage.login(email, password);
            ProductsPage productsPage = homePage.SelectElectronicMenu();
            productsPage.ShopByCategory();
            productsPage.ClickBestSellers();
            String BestSellersPageTitle = productsPage.GetBestSellersPageTitle();
            String BestSellersResultsTitle = productsPage.GetBestSellersResultsTitle();
            //Check best sellers category page for mobile phones and accessories
            Assert.That(BestSellersResultsTitle.Contains(BestSellersPageTitle));
        }

        [OneTimeTearDown]
        protected void Close()
        {
            TearDown();
        }

    }

}
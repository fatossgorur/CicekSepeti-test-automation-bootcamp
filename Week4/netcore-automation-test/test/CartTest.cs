using System;
using NUnit.Framework;


namespace netcore_automation_test
{

    [TestFixture]
    public class CartTest : BasePage
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
        public void CheckCartStatusTest()
        {
            String EmptyCart = "Amazon sepetiniz boş.";
            LoginPage loginPage = homePage.GetLoginPage();
            String email = user.GetEmail();
            String password = user.GetPassword();
            loginPage.login(email, password);
            ProductsPage productsPage = homePage.SelectElectronicMenu();
            productsPage.ShopByCategory();
            productsPage.ClickBestSellers();
            ProductDetailPage productDetailPage = productsPage.SelectFirstProduct();
            CartPage cartPage = productDetailPage.ClickAddCart();
            cartPage.ClickShoppingCart();
            String TotalProduct = cartPage.TotalProduct();
            String EmptyCartText = cartPage.EmptyCart();
            if (!TotalProduct.Contains("0"))
            {
                Assert.Pass("You have product in your cart.");
            }
            else
            {
                Assert.AreEqual(EmptyCart, EmptyCartText);
            }

        }

        [OneTimeTearDown]
        protected void Close()
        {
            TearDown();
        }

    }

}
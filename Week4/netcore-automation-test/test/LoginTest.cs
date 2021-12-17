using System;
using NUnit.Framework;


namespace netcore_automation_test
{

    [TestFixture]
    public class LoginTest : BasePage
    {

        HomePage homePage;
        User user;

        [OneTimeSetUp]
        public void SetUp()
        {
            SetupDriver();
            homePage = new HomePage(driver);
            user = new User();
        }

        [Test]
        public void SuccessLoginTest()
        {
            LoginPage loginPage = homePage.GetLoginPage();
            String email = user.GetEmail();
            String password = user.GetPassword();
            loginPage.login(email, password);
            String name = homePage.GetAccountName();
            //username is visible on home page and not null
            Assert.IsNotNull(name);
        }

        [OneTimeTearDown]
        protected void Close()
        {
            TearDown();
        }

    }

}
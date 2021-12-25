package android;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.android.HomePage;


public class HomePageTest extends BaseTest {

    @Test
    public void successSearchProduct() {
        String keyword = "kahve makinesi";
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct(keyword);
        String pageTitle = homePage.getSearchResultTitle();
        Assert.assertTrue(pageTitle.toLowerCase().contains(keyword));
    }

    @Test
    public void successfulPageRedirect() {
        String keyword = "kahve makinesi";
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct(keyword);
        String pageTitle = homePage.getRedirectedPageTitle();
        Assert.assertEquals(keyword, pageTitle.toLowerCase());

    }

}

package com.ciceksepeti;

import com.ciceksepeti.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void CheckHomePageTitle() {
        String homePageTitle = "ÇiçekSepeti - Online Çiçek & Hediye Sitesi";
        HomePage homePage = new HomePage(webDriver);
        String driverTitle = homePage.getHomePageTitle();
        Assert.assertEquals(driverTitle, homePageTitle);
    }

    @Test
    public void CheckMemberShipTitle() {
        String memberShip = "Üyelik";
        HomePage homePage = new HomePage(webDriver);
        String memberShipTitle = homePage.getMemberShipTitle();
        Assert.assertEquals(memberShipTitle, memberShip);
    }
}

package com.ciceksepeti;

import com.ciceksepeti.pages.HomePage;
import com.ciceksepeti.pages.ProductDetailPage;
import com.ciceksepeti.pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;

public class ProductDetailTest extends BaseTest {

    @Test
    public void CheckProductPrice() {
        String keyword = "orkide";
        HomePage homePage = new HomePage(webDriver);
        SearchResultPage searchResultPage = homePage.search(keyword);
        String selectProductPriceSR = searchResultPage.getProductPrice();
        ProductDetailPage productDetailPage = searchResultPage.getProductDetail();
        String selectProductPriceD = productDetailPage.getSelectProductPrice();
        //System.out.printf(selectProductPriceSR);
        //System.out.printf(selectProductPriceD);
        Assert.assertEquals(selectProductPriceSR, selectProductPriceD);
    }

    @Test
    public void CheckProductName() {
        String keyword = "orkide";
        HomePage homePage = new HomePage(webDriver);
        SearchResultPage searchResultPage = homePage.search(keyword);
        String selectProductNameSR = searchResultPage.getProductName();
        ProductDetailPage productDetailPage = searchResultPage.getProductDetail();
        String selectProductNameD = productDetailPage.getSelectProductName();
        //System.out.printf(selectProductNameSR);
        //System.out.printf(selectProductNameD);
        Assert.assertEquals(selectProductNameSR, selectProductNameD);
    }

}


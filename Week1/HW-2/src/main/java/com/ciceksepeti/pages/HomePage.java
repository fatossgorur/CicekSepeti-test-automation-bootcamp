package com.ciceksepeti.pages;

import com.ciceksepeti.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebDriverHelper {

    private By routePointsBy = By.className("js-subheader-close");
    private By cookiesBy = By.className("js-policy-close");
    private By searchBoxBy = By.className("js-product-search-input");
    private By findButtonBy = By.className("product-search__button");
    private By memberShipBy = By.cssSelector(".user-menu__items  li:nth-child(2) .user-menu__title");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void routePointsClick() {
        click(routePointsBy, 1);
    }

    public void cookiesClick() {
        click(routePointsBy, 2);
    }

    public String getHomePageTitle() {
        return getTitle();
    }

    public String getMemberShipTitle() {
        String memberShip = webDriver.findElement(memberShipBy).getText();
        return memberShip;
    }

    public SearchResultPage search(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword);
        webDriver.findElement(findButtonBy).click();
        return new SearchResultPage(webDriver);
    }

}
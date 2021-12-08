package com.ciceksepeti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends HomePage {

    private By PriceIntegerBy = By.className("js-price-integer");
    private By PriceDecimalBy = By.className("js-price-decimal");
    private By productNameBy = By.className("js-product-title");

    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getSelectProductPrice() {
        String integerPrice = webDriver.findElement(PriceIntegerBy).getText();
        String decimalPrice = webDriver.findElement(PriceDecimalBy).getText();
        return integerPrice + decimalPrice;
    }

    public String getSelectProductName() {
        String productName = webDriver.findElement(productNameBy).getText();
        return productName;
    }
}

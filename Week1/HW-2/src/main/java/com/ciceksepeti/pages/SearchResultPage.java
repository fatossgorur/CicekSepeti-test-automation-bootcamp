package com.ciceksepeti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class SearchResultPage extends HomePage {

    private String randomSelect;
    private String priceInteger;
    private String priceDecimal;
    private By PriceIntegerBy;
    private By PriceDecimalBy;
    private String selectProductName;
    private By productNameBy;

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getRandomSelectProduct() {
        Random random = new Random();
        int rand = random.nextInt(50) + 1;
        return ".products__item:nth-child(" + rand + ")";
    }

    public ProductDetailPage getProductDetail() {
        By randomSelectProduct = By.cssSelector(randomSelect);
        click(randomSelectProduct, 10);
        return new ProductDetailPage(webDriver);
    }

    public String getProductPrice() {
        randomSelect = getRandomSelectProduct();
        priceInteger = randomSelect + " .price--now .price__integer-value";
        priceDecimal = randomSelect + " .price--now .price__decimal-value-with-currency";
        PriceIntegerBy = By.cssSelector(priceInteger);
        PriceDecimalBy = By.cssSelector(priceDecimal);

        String integerPrice = webDriver.findElement(PriceIntegerBy).getText();
        String decimalPrice = webDriver.findElement(PriceDecimalBy).getText();
        return integerPrice + decimalPrice;
    }

    public String getProductName() {
        randomSelect = getRandomSelectProduct();
        selectProductName = randomSelect + " .products__item-title";
        productNameBy = By.cssSelector(selectProductName);
        String productName = webDriver.findElement(productNameBy).getText();
        return productName;
    }
}

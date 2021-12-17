# netcore-automation-test

◻️ Bu projeler **.NET Core** ve kullanılarak www.amazon.com.tr için yazılmış web test projesidir. Projede Page Object Pattern kullanılmıştır.

◻️ Ide olarak **Visual Studio Code** kullanılmıştır. 

◻️ **NuGet Package Manager: Add Package** ile ilgili paketlerimizi eklememiz gerekmektedir. 
(Selenium.WebDriver, Selenium.WebDriver.ChromeDriver (Chrome sürümünüz ile uyumlu olmalıdır), Microsoft.TestPlatform.TestHost (release versiyonu))

◻️ Proje hakkında daha fazla bilgi için medium yazımı okuyabilirsiniz. -->[.NET Core ile Test Otomasyon](https://fatosgorur.medium.com/net-core-ile-test-otomasyon-df1558dfd965)


> **LoginTest : SuccessLoginTest()**

**Assertion : Username is visible on home page and not null**

```
   Assert.IsNotNull(name);
```


> **ProductTest :  BestSellersCategoryTest()**

**Assertion : Check best sellers category page for mobile phones and accessories**

```
  Assert.That(BestSellersResultsTitle.Contains(BestSellersPageTitle));
```

> **ProductDetailTest : SelectedProductNameTest()**

**Assertion : Check selected product name**

```
   Assert.AreEqual(BestSellersFirstProductName, SelectProductName);
```

> **CartTest : CheckCartStatusTest()**

**Assertion : Check the status in the cart** 

```
    if (!TotalProduct.Contains("0"))
            {
                Assert.Pass("You have product in your cart.");
            }
            else
            {
                Assert.AreEqual(EmptyCart, EmptyCartText);
            }
```





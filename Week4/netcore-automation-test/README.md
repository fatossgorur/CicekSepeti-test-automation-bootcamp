# netcore-automation-test

◻️ Bu proje **.NET Core** kullanılarak www.amazon.com.tr için yazılmış web test projesidir. Projede Page Object Pattern kullanılmıştır.

◻️ Ide olarak **Visual Studio Code** kullanılmıştır. 

◻️ **NuGet Package Manager: Add Package** ile ilgili paketlerimizi eklememiz gerekmektedir. 
(Selenium.WebDriver, Selenium.WebDriver.ChromeDriver (Chrome sürümünüz ile uyumlu olmalıdır), Microsoft.TestPlatform.TestHost (release versiyonu))

◻️ Proje hakkında daha fazla bilgi için medium yazımı okuyabilirsiniz. -->[.NET Core ile Test Otomasyon](https://fatosgorur.medium.com/net-core-ile-test-otomasyon-df1558dfd965)


> ## **LoginTest : SuccessLoginTest()**

◻️ Navigate to "https://www.amazon.com.tr"

◻️ Hover to "Hesap ve Listeler"

◻️ Login is done by entering e-mail and password

◻️ The login process is checked

**Assertion : Username is visible on home page and not null**

```
   Assert.IsNotNull(name);
```


> ## **ProductTest :  BestSellersCategoryTest()**

◻️ Navigate to "https://www.amazon.com.tr"

◻️ Hover to "Hesap ve Listeler"

◻️ Login is done by entering e-mail and password

◻️ Click on "Elektronik" menu

◻️ Click shop by category "Cep Telefonları ve Aksesuarlar"

◻️ Click bestsellers "Daha fazla gör"

◻️ Page title is checked

**Assertion : Check best sellers category page for mobile phones and accessories**

```
  Assert.That(BestSellersResultsTitle.Contains(BestSellersPageTitle));
```

> ## **ProductDetailTest : SelectedProductNameTest()**

◻️ Navigate to "https://www.amazon.com.tr"

◻️ Hover to "Hesap ve Listeler"

◻️ Login is done by entering e-mail and password

◻️ Click on "Elektronik" menu

◻️ Click shop by category "Cep Telefonları ve Aksesuarlar"

◻️ Click bestsellers "Daha fazla gör"

◻️ Select the first product on the search result page 

◻️ Check selected product name

**Assertion : Check selected product name**

```
   Assert.AreEqual(BestSellersFirstProductName, SelectProductName);
```

> ## **CartTest : CheckCartStatusTest()**

◻️ Navigate to "https://www.amazon.com.tr"

◻️ Hover to "Hesap ve Listeler"

◻️ Login is done by entering e-mail and password

◻️ Click on "Elektronik" menu

◻️ Click shop by category "Cep Telefonları ve Aksesuarlar"

◻️ Click bestsellers "Daha fazla gör"

◻️ Select the first product on the search result page 

◻️ Click shopping cart

◻️ Check the status in the cart


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





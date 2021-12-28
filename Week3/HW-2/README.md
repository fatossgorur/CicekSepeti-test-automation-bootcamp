# gratis-cucumber-project

◻️ Bu proje **Cucumber framework** kullanılarak **https://www.gratis.com/** için yazılmış web test projesidir. 

◻️ **IntelliJ IDEA** ’da bir maven projesi oluşturulmuştur. **pom.xml**’e gerekli kütüphaneler yüklenmiştir. Cucumber kullanımı için gerekli pluginler eklenmiştir. (**Cucumber for java, Gherkin**)

◻️ **Runner Sınıfının Oluşturulması**

Test projemizi çalıştırabilmemiz için daha önce oluşturduğumuz **runner package**’nın altına **RunnerAll** adında bir sınıf oluşturdum. **@CucumberOptions** etiketinde yer alan **features** için yol olarak feature dosyalarınızın yer aldığı package’ın yolunu, **glue** için ise test senaryolarınızın olduğu package’ın ismini vermelisiniz.

> ## **Scenario :** Product search in the search box

◼️ Enter product name "parfüm"

◼️ Click search button

◼️ Verify search result in "ürün listeleniyor"

***Assertion : Search result in "ürün listeleniyor"***

```
   Assert.assertTrue(productsFoundText.contains(productList));
```


> ## **Scenario Outline :** Product search with alphanumeric characters and special characters in the search box

◼️ Enter product name "productName"
 
◼️ Click search button
 
◼️ Verify failed search result "için sonuç bulunamamıştır."
 
     Examples:
      | productName |
      | 1234q5w6    |
      | ..,-*/      |
      

***Assertion : failed search result "için sonuç bulunamamıştır."***

```
   Assert.assertTrue(noFoundText.contains(noFound));
```


> ## **Scenario :** Clearing the entered product name

◼️ Enter product name "oje"

◼️ Click reset button

◼️ Verify that the entered product name is deleted


***Assertion : When the product name is deleted, the suggestion pop up is checked***

```
   Boolean value = methods.isDisplayed(suggestionPopup);
   Assert.assertTrue(value);
```

![ssss](https://user-images.githubusercontent.com/55894683/144934347-5ced7f60-6c25-4199-9d59-1bcf6cf08be2.PNG)

◻️ Cucumber Scenario çalıştırdığımızda oluşan **rapor** için dosya yolunuzdaki **\target\default-html-reports** ile ulaşabilirsiniz.

![image](https://user-images.githubusercontent.com/55894683/145225994-e4139bdf-ff1b-4fb6-b516-34a1ed6c2db3.png)







# gratis-cucumber-project

◻️ Bu proje **Cucumber framework** kullanılarak **https://www.gratis.com/** için yazılmış web test projesidir. 

◻️ **IntelliJ IDEA** ’da bir maven projesi oluşturulmuştur. **pom.xml**’e gerekli kütüphaneler yüklenmiştir. Cucumber kullanımı için gerekli pluginler eklenmiştir. (**Cucumber for java, Gherkin**)

◻️ **Runner Sınıfının Oluşturulması**

Test projemizi çalıştırabilmemiz için daha önce oluşturduğumuz **runner package**’nın altına **RunnerAll** adında bir sınıf oluşturdum. **@CucumberOptions** etiketinde yer alan **features** için yol olarak feature dosyalarınızın yer aldığı package’ın yolunu, **glue** için ise test senaryolarınızın olduğu package’ın ismini vermelisiniz.

> **Test1:**

**Scenario :** Product search in the search box

**Result :** Aratılan ürünle ilgili **başarılı** bir arama sonucu döndüğü görülmüştür.

![image](https://user-images.githubusercontent.com/55894683/145225135-262d9b14-25dd-4678-9bf5-f7dfea221c49.png)

> **Test2:**

**Scenario Outline :** Product search with alphanumeric characters and special characters in the search box

**Result :** Aratılan alfanumerik ve özel karakter içeren ürünle ilgili **başarısız** bir arama sonucu döndüğü görülmüştür.

![image](https://user-images.githubusercontent.com/55894683/145225382-760ecc01-a209-46fe-b8e2-af1a1109e0d9.png)
![image](https://user-images.githubusercontent.com/55894683/145225400-eca4ca59-3a2d-413b-baa6-97982ac353ad.png)

> **Test3:**

**Scenario :** Clearing the entered product name

**Result :** Girilen ürün adının doğru bir şekilde silindiği görülmüştür.

![image](https://user-images.githubusercontent.com/55894683/145225754-69c2fa43-dd27-487c-a02c-b85a6aeb5f6b.png)

 ![image](https://user-images.githubusercontent.com/55894683/145225772-cbdba1fa-4dd9-412a-b8c9-80c41c041240.png)
 


![ssss](https://user-images.githubusercontent.com/55894683/144934347-5ced7f60-6c25-4199-9d59-1bcf6cf08be2.PNG)

◻️ Cucumber Scenario çalıştırdığımızda oluşan **rapor** için dosya yolunuzdaki **\target\default-html-reports** ile ulaşabilirsiniz.

![image](https://user-images.githubusercontent.com/55894683/145225994-e4139bdf-ff1b-4fb6-b516-34a1ed6c2db3.png)







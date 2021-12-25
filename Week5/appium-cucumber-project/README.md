# appium-cucumber-project

⬛ Bu proje **Java** ile **Cucumber Framework** kullanılarak cimri.com Android uygulaması için yazılmış **Appium mobil test** projesidir. Projede Page Object Pattern kullanılmıştır.

⬛ Ide olarak **Intellij IDEA** kullanılmıştır. 

⬛ Bilgiayarınızda **Android Studio** ve **Appium** kurulu olmalıdır.


## Feature: Home Page Test

> **Scenario: Success Search Product**

◻️ Arama butonuna tıklanır.

◻️ Arama butonunda "kahve makinesi" kelimesi aratılır.

**Assertion : Arama sonucu sayfasının başlığı, arananan ürün adını içerir.**

```
  Assert.assertTrue(pageTitle.toLowerCase().contains(keyword));
```

> **Scenario: Success Page Redirect**

◻️ Arama butonuna tıklanır.

◻️ Arama butonunda "kahve makinesi" kelimesi aratılır.

**Assertion : Arananan ürün adı ile sayfa yönlendirme başlığı eşittir.**

```
  Assert.assertEquals(keyword, pageTitle.toLowerCase());
```
## Feature: Sign Up Page Test

> **Scenario: Success Sign Up**

◻️ Anasayfada hesap image tıklanır.

◻️ Yönlendirilen sayfada "Kayıt ol" butonuna tıklanır.

◻️ Yönlendirilen sayfada "email" ve "password" alanları doldurulur ve "Kayıt ol" butonuna  tıklanır.

**Assertion : Yönlendirilen sayfada "kaydınızı tamamlayın" metni bulunur.**

```
   Assert.assertEquals(registrationMessage, registrationOkMessage);
```

> **Scenario: Sign Up With Null Email And Password**

◻️ Anasayfada hesap image tıklanır.

◻️ Yönlendirilen sayfada "Kayıt ol" butonuna tıklanır.

◻️ Yönlendirilen sayfada "email" ve "password" alanları boş bırakılır ve "Kayıt ol" butonuna  tıklanır.

**Assertion : Sayfa içeriğinde verilen uyarıda "Email boş olamaz" ve "Şifre giriniz" metinleri bulunur.**

```
   Assert.assertEquals(mailMessage, nullMailMessage);
   Assert.assertEquals(passwordMessage, nullPasswordMessage);
   
```












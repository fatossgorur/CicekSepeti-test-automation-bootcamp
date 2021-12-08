# CicekSepeti-automation-test

🔲 Bu proje Selenium ve JUnit kullanılarak ciceksepeti.com için yazılmış web otomasyon projesidir.

🔲 Projede Page Object Pattern kullanılmıştır ve OOP (Object Oriented Programming) prensiplerine uygun yazılmıştır. 

>**İlk testimiz ana sayfanın açıldığını kontrol etmek için yazılmıştır. *(HomePageTest)***

**Test1:** *(CheckHomePageTitle)*

⚪️ www.ciceksepeti.com sitesi açılır.

⚪️ Gönderim adresi popup kapatılır.

⚪️ Ana sayfa başlığının doğruluğu kontrol edilir.

**Test2:** *(CheckMemberShipTitle)*

⚪️ www.ciceksepeti.com sitesi açılır.

⚪️ Gönderim adresi popup kapatılır.

⚪️ Ana sayfada üyelik işlemleri yapabileceği bir butonun varlığı kontrol edilir.



>**İkinci testimiz ise listelenen ürünler arasında seçtiğimiz ürünün, detay bilgileri ile aynı olduğunu kontrol etmek için yazılmıştır. *(ProductDetailTest)***

**Test1:** *(CheckProductPrice)*

⚪️ www.ciceksepeti.com sitesi açılır.

⚪️ Gönderim adresi popup kapatılır.

⚪️ Arama kutucuğuna "orkide" kelimesi girilir.

⚪️ Arama sonuçları sayfasındaki ürünlerden biri rastgele seçilir.

⚪️ Ürün detay sayfasındaki fiyat ile arama sonuçları sayfasındaki ürün fiyatının doğruluğu karşılaştırılır.

**Test2:** *(CheckProductName)*

⚪️ www.ciceksepeti.com sitesi açılır.

⚪️ Gönderim adresi popup kapatılır.

⚪️ Arama kutucuğuna "orkide" kelimesi girilir.

⚪️ Arama sonuçları sayfasındaki ürünlerden biri rastgele seçilir.

⚪️ Ürün detay sayfasındaki ürün adı ile arama sonuçları sayfasındaki ürün adının doğruluğu karşılaştırılır.



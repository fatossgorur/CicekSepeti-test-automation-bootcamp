# python-automation-test

◻️ Bu proje **Python** kullanılarak www.amazon.com.tr için yazılmış web test projesidir. Projede Page Object Pattern kullanılmıştır.

◻️ Ide olarak **PyCharm** kullanılmıştır. 

◻️ Bir test projesi oluşturacağımız için ilk olarak **pytest import** etmemiz gerekmektedir.

◻️ Proje hakkında daha fazla bilgi için medium yazımı okuyabilirsiniz. -->[Python ile Otomasyon Testi](https://fatosgorur.medium.com/python-ile-otomasyon-testi-821ea8a533e3)


> **TestLogin : test_login()**

**Assertion : My username is the same as the username on the home page**

```
   assert account_name == my_account_name
```


> **TestProduct : test_best_sellers_category()**

**Assertion : Check best sellers category page for mobile phones and accessories**

```
   assert page_title != result_page
```

> **TestProductDetail :  test_selected_product_name()**

**Assertion : Check selected product name**

```
     assert first_product_name == product_name
```

> **TestCart() : test_check_cart_status()**

**Assertion : Check the status in the cart** 

```
    if '0' not in total_product:
            print("You have product in your cart.")
        else:
            assert empty_cart == empty_cart_text
```





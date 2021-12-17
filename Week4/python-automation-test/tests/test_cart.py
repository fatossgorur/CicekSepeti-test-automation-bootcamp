from selenium import webdriver
from pages.home_page import HomePage
from pages.login_page import LoginPage
from pages.products_page import ProductsPage
from pages.product_detail_page import ProductDetailPage
from pages.cart_page import CartPage


class TestCart():
    def setup_method(self, method):
        self.driver = webdriver.Chrome(executable_path= "C:\driver\chromedriver.exe")

    def teardown_method(self, method):
        self.driver.quit()

    def test_check_cart_status(self):
        self.driver.get("https://www.amazon.com.tr/")
        self.driver.maximize_window()
        home = HomePage(self.driver)
        login = LoginPage(self.driver)
        products = ProductsPage(self.driver)
        product_detail = ProductDetailPage(self.driver)
        cart = CartPage(self.driver)
        empty_cart = "Amazon sepetiniz boş."
        home.get_login_page()
        login.login()
        home.select_electronic_menu()
        products.shop_by_category()
        products.click_best_sellers()
        products.select_first_product()
        product_detail.click_add_cart()
        cart.click_shopping_cart()
        total_product = cart.total_product()
        empty_cart_text = cart.empty_cart()
        if '0' not in total_product:
            print("You have product in your cart.")
        else:
            assert empty_cart == empty_cart_text





from selenium import webdriver
from pages.home_page import HomePage
from pages.login_page import LoginPage
from pages.products_page import ProductsPage
from pages.product_detail_page import ProductDetailPage

class TestProductDetail():
    def setup_method(self, method):
        self.driver = webdriver.Chrome(executable_path="C:\driver\chromedriver.exe")

    def teardown_method(self, method):
        self.driver.quit()

    def test_selected_product_name(self):
        self.driver.get("https://www.amazon.com.tr/")
        self.driver.maximize_window()
        home = HomePage(self.driver)
        login = LoginPage(self.driver)
        products = ProductsPage(self.driver)
        product_detail = ProductDetailPage(self.driver)
        home.get_login_page()
        login.login()
        home.select_electronic_menu()
        products.shop_by_category()
        products.click_best_sellers()
        first_product_name = products.get_best_sellers_first_product_name()
        products.select_first_product()
        product_name = product_detail.get_product_title()
        assert first_product_name == product_name



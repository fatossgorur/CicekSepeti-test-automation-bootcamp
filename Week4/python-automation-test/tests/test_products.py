from selenium import webdriver
from pages.home_page import HomePage
from pages.login_page import LoginPage
from pages.products_page import ProductsPage


class TestProduct():
    def setup_method(self, method):
        self.driver = webdriver.Chrome(executable_path="C:\driver\chromedriver.exe")

    def teardown_method(self, method):
        self.driver.quit()

    def test_best_sellers_category(self):
        self.driver.get("https://www.amazon.com.tr/")
        self.driver.maximize_window()
        self.driver.implicitly_wait(30)
        home = HomePage(self.driver)
        login = LoginPage(self.driver)
        products = ProductsPage(self.driver)
        home.get_login_page()
        login.login()
        home.select_electronic_menu()
        products.shop_by_category()
        products.click_best_sellers()
        page_title = products.get_best_sellers_page_title()
        result_page = products.get_best_sellers_results_title()
        assert page_title != result_page





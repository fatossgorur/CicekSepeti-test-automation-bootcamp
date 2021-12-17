from selenium import webdriver
from pages.home_page import HomePage
from pages.login_page import LoginPage


class TestLogin():
    def setup_method(self, method):
        self.driver = webdriver.Chrome(executable_path="C:\driver\chromedriver.exe")

    def teardown_method(self, method):
        self.driver.quit()

    def test_login(self):
        self.driver.get("https://www.amazon.com.tr/")
        self.driver.maximize_window()
        my_account_name = "SELENIUMTEST"
        home = HomePage(self.driver)
        login = LoginPage(self.driver)
        home.get_login_page()
        login.login()
        account_name = login.get_account_name()
        assert account_name == my_account_name



from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By


class HomePage():
    def __init__(self, driver):
        self.driver = driver

        self.cookie_class_name = "a-button-primary"
        self.account_list_id = "nav-link-accountList"
        self.login_button_css = "#nav-flyout-ya-signin .nav-action-inner"
        self.electronic_menu_xpath = "//a[text()= 'Elektronik']"

    def get_login_page(self):
        self.driver.find_element(By.CLASS_NAME, self.cookie_class_name).click()
        element = self.driver.find_element(By.ID, self.account_list_id)
        actions = ActionChains(self.driver)
        actions.move_to_element(element).perform()
        self.driver.find_element(By.CSS_SELECTOR, self.login_button_css).click()

    def select_electronic_menu(self):
        self.driver.find_element(By.XPATH, self.electronic_menu_xpath).click()
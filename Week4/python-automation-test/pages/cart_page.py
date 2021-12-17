from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By


class CartPage():
    def __init__(self, driver):
        self.driver = driver

        self.shopping_cart_button_id = "hlb-view-cart-announce"
        self.delete_text_class = "submit.delete.Cd2d85578-c821-4b5d-be07-b809cb41a7e1"
        self.total_product_text_id = "sc-subtotal-label-activecart"
        self.empty_cart_text_css = ".a-row .a-spacing-top-base"

    def click_shopping_cart(self):
        self.driver.find_element(By.ID, self.shopping_cart_button_id).click()

    def click_delete_product(self):
        self.driver.find_element(By.CLASS_NAME, self.delete_text_class).click()

    def total_product(self):
        return self.driver.find_element(By.ID, self.total_product_text_id).text

    def empty_cart(self):
        return self.driver.find_element(By.CSS_SELECTOR, self.empty_cart_text_css).text

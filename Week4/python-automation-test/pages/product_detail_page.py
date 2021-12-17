from selenium.webdriver.common.by import By


class ProductDetailPage():
    def __init__(self, driver):
        self.driver = driver

        self.product_title_id = "productTitle"
        self.add_cart_button_id = "add-to-cart-button"

    def get_product_title(self):
        return self.driver.find_element(By.ID, self.product_title_id).text

    def click_add_cart(self):
        self.driver.find_element(By.ID, self.add_cart_button_id).click()

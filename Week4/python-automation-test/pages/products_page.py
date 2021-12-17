from selenium.webdriver.common.by import By


class ProductsPage():
    def __init__(self, driver):
        self.driver = driver

        self.mobile_phones_accessories_css = "img[alt='Cep Telefonları ve Aksesuarlar']"
        self.best_sellers_css = "a[href*='bestsellers/electronics/13709880031']"
        self.best_sellers_page_title_class = "zg-banner-text"
        self.best_sellers_results_title_class = "a-spacing-medium"
        self.first_product_name_css = "#zg-ordered-list >li:first-of-type .p13n-sc-truncated"

    def shop_by_category(self):
        element = self.driver.find_element(By.CSS_SELECTOR, self.mobile_phones_accessories_css)
        self.driver.execute_script("arguments[0].click();", element)

    def click_best_sellers(self):
        element = self.driver.find_element(By.CSS_SELECTOR, self.best_sellers_css)
        self.driver.execute_script("arguments[0].click();", element)

    def get_best_sellers_page_title(self):
        return self.driver.find_element(By.CLASS_NAME, self.best_sellers_page_title_class).text

    def get_best_sellers_results_title(self):
        return self.driver.find_element(By.CLASS_NAME, self.best_sellers_results_title_class).text

    def get_best_sellers_first_product_name(self):
        element = self.driver.find_element(By.CSS_SELECTOR, self.first_product_name_css)
        return element.text

    def select_first_product(self):
        element = self.driver.find_element(By.CSS_SELECTOR, self.first_product_name_css)
        self.driver.execute_script("arguments[0].click();", element)

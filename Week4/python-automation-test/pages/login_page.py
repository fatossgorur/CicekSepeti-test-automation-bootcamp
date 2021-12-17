from selenium.webdriver.common.by import By


class LoginPage():
    def __init__(self, driver):
        self.driver = driver

        self.email_id = "ap_email"
        self.continue_classname = "a-button-primary"
        self.password_id = "ap_password"
        self.sign_id = "signInSubmit"
        self.account_name_id = "nav-link-accountList-nav-line-1"

    def login(self):
        self.driver.find_element(By.ID, self.email_id).send_keys("fatos.98gorur@hotmail.com")
        self.driver.find_element(By.CLASS_NAME, self.continue_classname).click()
        self.driver.find_element(By.ID, self.password_id).send_keys("fats98gorur")
        self.driver.find_element(By.ID, self.sign_id).click()

    def get_account_name(self):
        return self.driver.find_element(By.ID,self.account_name_id).text

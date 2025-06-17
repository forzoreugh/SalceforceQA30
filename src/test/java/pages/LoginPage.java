package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private static final By USER_NAME_FIELD = By.id("username");
    private static final By PASSWORD_FIELD = By.id("password");
    private static final By LOG_IN_BUTTON = By.id("Login");
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage open() {
        log.info("Open login page");
        driver.get(BASE_URL + ".my.salesforce.com/");
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Login']")));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Login page isn't opened");
        }
        return this;
    }

    public HomePage authorization(String user, String password) {
        log.info("Authorization with data: User: '{}', Password: '{}'", user, password);
        driver.findElement(USER_NAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        log.info("Clicking the authorization button 'Login'");
        driver.findElement(LOG_IN_BUTTON).click();
        return new HomePage(driver);
    }
}

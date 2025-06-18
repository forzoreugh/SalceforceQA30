package pages;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class AccountsPage extends BasePage {

    public static final By ACCOUNT_NAME_TITLE = By.xpath("//lightning-formatted-text[@slot='primaryField']");
    private static final Logger log = LogManager.getLogger(AccountsPage.class);

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountsPage open() {
        log.info("Open accounts page");
        driver.get(BASE_URL + ".lightning.force.com/lightning/o/Account/list?filterName=__Recent");
        return this;
    }

    @Override
    public AccountsPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Accounts']")));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Accounts page isn't opened");
        }
        return this;
    }

    public void assertAccountName() {
        log.info("Comparing the actual text of the user name with the expected text for the Account_Name field");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_NAME_TITLE));
        assertEquals(driver.findElement(ACCOUNT_NAME_TITLE).getText(), "SVIDZINSKI");
    }
}

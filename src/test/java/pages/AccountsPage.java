package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class AccountsPage extends BasePage {

    public static final By ACCOUNT_NAME_TITLE = By.xpath("//lightning-formatted-text[@slot='primaryField']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountsPage open() {
        driver.get(BASE_URL + ".lightning.force.com/lightning/o/Account/list?filterName=__Recent");
        return this;
    }

    @Override
    public AccountsPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Accounts']")));
        return this;
    }

    public void assertAccountName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_NAME_TITLE));
        assertEquals(driver.findElement(ACCOUNT_NAME_TITLE).getText(), "Тест");
    }
}

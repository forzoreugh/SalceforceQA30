package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.newAccountPage.Checkbox;
import wrappers.newAccountPage.Input;
import wrappers.newAccountPage.Picklist;
import wrappers.newAccountPage.TextArea;

public class NewAccountModal extends BasePage {

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModal open() {
        driver.get(BASE_URL + ".lightning.force.com/lightning/o/Account/new");
        return this;
    }

    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[text()='Account Owner']")));
        return this;
    }

    public NewAccountModal createAccount(Account account) {
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountSite());
        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        actions.scrollToElement(driver.findElement(By.xpath("//span[text()='TeachMeSkills']")))
                .perform();
        new Picklist(driver, "Type").select(account.getType());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Picklist(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "SIC Code").write(account.getSicCode());
        actions.scrollToElement(driver.findElement(By.xpath("//span[text()='Address Information']")))
                .perform();
        new Checkbox(driver, "VIP Client").choose(account.isVipClient());
        new Checkbox(driver, "TeachMeSkills").choose(account.isTeachMeSkills());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        return new NewAccountModal(driver);
    }

    public NewAccountModal clickSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toastMessage")));
        return new NewAccountModal(driver);
    }
}

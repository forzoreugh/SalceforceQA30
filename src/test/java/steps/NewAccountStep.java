package steps;

import dto.Account;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountsPage;
import pages.NewAccountModal;

import static org.testng.Assert.assertEquals;

public class NewAccountStep {

    WebDriver driver;
    NewAccountModal newAccountModal;
    AccountsPage accountsPage;

    public NewAccountStep(WebDriver driver) {
        this.driver = driver;
        newAccountModal = new NewAccountModal(driver);
        accountsPage = new AccountsPage(driver);
    }

    public void createAccount(Account account) {
        newAccountModal.open()
                .isPageOpened()
                .createAccount(account)
                .clickSaveButton();
        accountsPage.assertAccountName();
    }
}

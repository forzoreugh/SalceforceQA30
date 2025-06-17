package steps;

import dto.Account;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;
import pages.NewAccountModal;

public class NewAccountStep {

    private static final Logger log = LogManager.getLogger(NewAccountStep.class);
    WebDriver driver;
    NewAccountModal newAccountModal;
    AccountsPage accountsPage;

    public NewAccountStep(WebDriver driver) {
        this.driver = driver;
        newAccountModal = new NewAccountModal(driver);
        accountsPage = new AccountsPage(driver);
    }

    public void createAccount(Account account) {
        log.info("Execution New Account Step [create account]");
        newAccountModal.open()
                .isPageOpened()
                .createAccount(account)
                .clickSaveButton();
        accountsPage.assertAccountName();
    }
}

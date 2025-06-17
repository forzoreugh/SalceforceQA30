package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import wrappers.Button;

public class ContactsPage extends BasePage {

    private static final Logger log = LogManager.getLogger(ContactsPage.class);

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactsPage open() {
        log.info("Open contacts page");
        driver.get(BASE_URL + ".lightning.force.com/lightning/o/Contact/list?filterName=__Recent");
        return this;
    }

    @Override
    public ContactsPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//div[text()='New']/ancestor::li")));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Contacts page isn't opened");
        }
        return this;
    }

    public ContactsPage openFormNewContact() {
        log.info("Pressing the \"New\" button when going to the form for creating a new contact.");
        new Button(driver, "New").clickButton();
        return new ContactsPage(driver);
    }
}

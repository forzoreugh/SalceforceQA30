package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.accountPage.Button;

public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactsPage open() {
        driver.get(BASE_URL + ".lightning.force.com/lightning/o/Contact/list?filterName=__Recent");
        return this;
    }

    @Override
    public ContactsPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[text()='New']/ancestor::li")));
        return this;
    }

    public ContactsPage openFormNewContact() {
        new Button(driver, "New").clickButton();
        return new ContactsPage(driver);
    }
}

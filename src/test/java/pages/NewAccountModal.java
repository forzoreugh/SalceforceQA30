package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    private final String SEARCH_PATH = "//span[text()='%s']";

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
    }

    public void createAccount(String name, String accountNumber, String accountSite, String phone, String annualRevenue,
                              String fax, String website, String rating, String ownership, String type,
                              boolean vipClient, String billingStreet, String shippingStreet) {
        inputsField(name, accountNumber, accountSite, phone, annualRevenue, fax, website);
        picklistField(rating, ownership, type);
        actions.scrollToElement(driver.findElement(By.xpath(String.format(SEARCH_PATH, "Address Information"))))
                .perform();
        checkboxsField(vipClient);
        actions.scrollToElement(driver.findElement(By.xpath(String.format(SEARCH_PATH, "Additional Information"))))
                .perform();
        textAreasField(billingStreet, shippingStreet);
    }

    public void inputsField(String name, String accountNumber, String accountSite, String phone, String annualRevenue,
                            String fax, String website) {
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(website);
    }

    public void picklistField(String rating, String ownership, String type) {
        new Picklist(driver, "Rating").select(rating);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Type").select(type);
    }

    public void checkboxsField(boolean vipClient) {
        new Checkbox(driver, "VIP Client").choose(vipClient);
    }

    public void textAreasField(String billingStreet, String shippingStreet) {
        new TextArea(driver, "Billing Street").write(billingStreet);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
    }

    public void clickSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toastMessage")));
    }
}

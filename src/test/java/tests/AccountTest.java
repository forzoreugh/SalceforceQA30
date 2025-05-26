package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAcoount90() throws InterruptedException {
        loginPage.openLoginPage();
        loginPage.authorization("tborodich@tms.sandbox", "Password002!");
        newAccountModal.open();
        newAccountModal.createAccount("Artsiom Svidzinski", "551ISO/2", "hello@gmail.com",
                "+375(25)8293304", "50000", "hello@gmail.com", "hello@gmail.com",
                "Warm", "Public", "Other", true,
                "г. Минск, ул. Сурганова", "г. Минск, ул. Ленина");
        newAccountModal.clickSaveButton();
        assertEquals(driver.findElement(By.cssSelector(".toastMessage")).getText(),
                "Account \"Artsiom Svidzinski\" was created.");
    }
}

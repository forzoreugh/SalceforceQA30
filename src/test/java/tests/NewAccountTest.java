package tests;

import dto.Account;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class NewAccountTest extends BaseTest {

    Account account = new Account("Тест", "Тест", "Тест",
            "3456", "Тест", "Тест", "Тест", "Тест", "33",
            "Тест", "Prospect", "Apparel", "Hot", "Private", true,
            true, "Тестовая", "Тестовая");

    @Test (testName = "Создание нового аккаунта", groups = {"end-to-end"})
    @Severity(SeverityLevel.BLOCKER)
    public void createNewValideAccount() {
        loginStep.autorization(user, password);
        newAccountStep.createAccount(account);
    }
}

package tests;

import dto.Account;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class NewAccountTest extends BaseTest {

    @Test (testName = "Создание нового аккаунта")
    @Severity(SeverityLevel.BLOCKER)
    public void createNewValideAccount() {
        Account account = Account.builder()
                .rating("Hot")
                .accountName("SVIDZINSKI")
                .phone("+37544")
                .fax("Тест")
                .accountNumber("Тест")
                .build();
        loginStep.autorization(user, password);
        newAccountStep.createAccount(account);
    }
}

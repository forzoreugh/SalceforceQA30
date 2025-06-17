package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep {

    private static final Logger log = LogManager.getLogger(LoginStep.class);
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    public LoginStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

    }

    public void autorization(String user, String password) {
        log.info("Execution login step [autorization]");
        loginPage.open()
                .isPageOpened()
                .authorization("tborodich@tms.sandbox", "Password002!")
                .isPageOpened();
    }
}

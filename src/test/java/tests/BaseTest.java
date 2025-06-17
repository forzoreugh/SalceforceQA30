package tests;

import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.*;
import steps.LoginStep;
import steps.NewAccountStep;

import java.util.HashMap;

import static utils.AllureUtils.takeScreenshot;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    SoftAssert softAssert;
    LoginStep loginStep;
    NewAccountStep newAccountStep;
    ContactsPage contactsPage;
    String user = System.getProperty("user");
    String password = System.getProperty("password");

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true, description = "Открытие браузера")
    public WebDriver setup(@Optional("chrome") String browser, ITestContext context) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("credentials_enable_service", false);
            chromePrefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-infobars");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        softAssert = new SoftAssert();
        contactsPage = new ContactsPage(driver);
        loginStep = new LoginStep(driver);
        newAccountStep = new NewAccountStep(driver);
        return driver;
    }

    @AfterMethod(alwaysRun = true, description = "Закрытие браузера")
    public void quitBrowser(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(driver);
        }
        driver.quit();
    }

}

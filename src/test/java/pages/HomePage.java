package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage open() {
        log.info("Open home page");
        driver.get(BASE_URL + ".lightning.force.com/lightning/setup/SetupOneHome/home");
        return this;
    }

    @Override
    public HomePage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//span[text()='Home']/ancestor::div[@class='setup-header-element']")));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Home page isn't opened");
        }
        return this;
    }
}

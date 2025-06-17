package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public abstract class BasePage {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    public static final String BASE_URL = "https://tms9-dev-ed.develop";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public abstract BasePage open();

    public abstract BasePage isPageOpened();
}

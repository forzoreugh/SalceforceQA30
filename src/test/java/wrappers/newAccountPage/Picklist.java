package wrappers.newAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Picklist {

    private final WebDriverWait wait;
    WebDriver driver;
    String label;
    String selectPattern = "//label[text()='%s']/ancestor::lightning-picklist//";

    public Picklist(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void select(String option) {
        driver.findElement(By.xpath(
                String.format(selectPattern + "button", label))).click();
        Duration.ofSeconds(10);
        driver.findElement(By.xpath(String.format(selectPattern + "lightning-base-combobox-item//span[text()='%s']",
                label, option))).click();
    }
}
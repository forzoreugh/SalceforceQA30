package wrappers.newAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Checkbox {

    WebDriver driver;
    String label;
    Actions actions;
    WebElement element;

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        this.element = driver.findElement(By.xpath(
                String.format("//span[text()='%s']/ancestor::lightning-input//input", label)));
        actions = new Actions(driver);
    }

    public void choose(boolean choose) {
        if (choose) {
            element.click();
        }
    }
}

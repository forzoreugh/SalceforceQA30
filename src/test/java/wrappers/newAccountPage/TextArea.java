package wrappers.newAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea {

    WebDriver driver;
    String label;
    WebElement element;

    public TextArea(WebDriver driver, String label) {
        this.label = label;
        this.driver = driver;
        this.element = driver.findElement(By.xpath(String.format("//label[text()='%s']/ancestor::lightning-textarea//textarea", label)));
    }

    public void write(String text) {
        element.click();
        element.sendKeys(text);
    }
}

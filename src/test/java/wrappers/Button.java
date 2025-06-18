package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {

    WebDriver driver;
    String label;
    WebElement element;

    public Button(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        this.element = driver.findElement(By.xpath
                (String.format("//div[text()='%s']/ancestor::li", label)));
    }

    public void clickButton() {
        element.click();
    }
}

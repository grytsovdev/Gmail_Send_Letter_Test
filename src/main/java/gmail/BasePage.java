package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void implicitWait(int time) {
        driver.manage().timeouts().implicitlyWait(time, java.util.concurrent.TimeUnit.SECONDS);
    }
    public void waitForElementToBeClickable(WebElement element, int time) {
        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(element));
    }


}

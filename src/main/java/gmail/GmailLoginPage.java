package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginPage extends BasePage {

    public static final String EMAIL_FIELD = "//input[@type = 'email']";
    public static final String PASSWORD_FIELD = "#password input";
    public static final String NEXT_BUTTON_EMAIL_ID = "identifierNext";
    public static final String NEXT_BUTTON_PASSWORD = "//div[@id = 'passwordNext']";


    public GmailLoginPage(WebDriver driver) {
       super(driver);
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath(EMAIL_FIELD)).sendKeys(email);
    }
    public void clickEmailNext() {
        driver.findElement(By.id(NEXT_BUTTON_EMAIL_ID)).click();
    }
    public void enterPassword(String password) {
        driver.findElement(By.cssSelector(PASSWORD_FIELD)).sendKeys(password);
    }

    public void clickPasswordNext() {
        driver.findElement(By.xpath(NEXT_BUTTON_PASSWORD)).click();
    }
}

package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailHomePage extends BasePage {
   public static final String SIGN_IN_BUTTON= "//a[@data-action = 'sign in']";

    public GmailHomePage(WebDriver driver) {
        super(driver);

    }

     public void clickSignIn() {
        driver.findElement(By.xpath(SIGN_IN_BUTTON)).click();
    }

}

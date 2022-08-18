package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailMailPage extends BasePage{

    private static final  String WRITE_BUTTON = "//div[@class = 'T-I T-I-KE L3']";
    private static final String TO_TEXT_FIELD_NAME = "to";
    private static final String SUBJECT_TEXT_FIELD = "//input[@name = 'subjectbox']";
    private static final String BODY_TEXT_FIELD = "//div[@class = 'Am Al editable LW-avf tS-tW']";

    private static final String SEND_BUTTON = "//*[@id=\":eq\"]";


    public GmailMailPage(WebDriver driver) {
        super(driver);
    }

    public void clickWriteButton() {
        driver.findElement(By.xpath(WRITE_BUTTON)).click();
    }

    public void enterToTextField(String to) {
        driver.findElement(By.name(TO_TEXT_FIELD_NAME)).sendKeys(to);
    }

    public void enterSubjectTextField(String subject) {
        driver.findElement(By.xpath(SUBJECT_TEXT_FIELD)).sendKeys(subject);
    }

    public void enterBodyTextField(String body) {
        driver.findElement(By.xpath(BODY_TEXT_FIELD)).sendKeys(body);
    }

    public void Send() {
        driver.findElement(By.xpath(BODY_TEXT_FIELD)).sendKeys( Keys.CONTROL , Keys.ENTER);
    }

    public WebElement getWriteButton() {
        return driver.findElement(By.xpath(WRITE_BUTTON));
    }



}

package gmailTest;

import gmailTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GmailTests extends BaseTest {

    private static final String SENDER_EMAIL = "bgray9013@gmail.com";
    private static final String PASSWORD = "Strong_Password";
    private static final String RECIPIENT_EMAIL = "grayben91@yahoo.com";

    @Test
    public void sendEmail()  {
        getHomePage().clickSignIn();
        getLoginPage().enterEmail(SENDER_EMAIL);
        getLoginPage().clickEmailNext();
        getLoginPage().implicitWait(30);
        getLoginPage().enterPassword(PASSWORD);
        getLoginPage().clickPasswordNext();
        getLoginPage().waitForElementToBeClickable(getMailPage().getWriteButton(), 30);
        getMailPage().clickWriteButton();
        getMailPage().enterToTextField(RECIPIENT_EMAIL);
        getMailPage().enterSubjectTextField("Test");
        getMailPage().enterBodyTextField("Hello World!");
        getMailPage().Send();


    }
}

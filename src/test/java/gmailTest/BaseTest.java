package gmailTest;

import gmail.GmailHomePage;
import gmail.GmailLoginPage;
import gmail.GmailMailPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String GMAIL_URL = "https://www.google.com/intl/uk/gmail/about/";

    @BeforeTest
    public void setUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void TestSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GMAIL_URL);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @AfterTest
    public void tearDownTest() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public GmailLoginPage getLoginPage() {
        return new GmailLoginPage(driver);
    }

    public GmailHomePage getHomePage() {
        return new GmailHomePage(driver);
    }
    public GmailMailPage getMailPage() {
       return new GmailMailPage(driver);
    }

}

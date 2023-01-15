package Base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class CommonAPI {
    public WebDriver driver;


    public void getLocalDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
    }

    @Parameters({"url", "browserName"})
    @BeforeMethod
    public void setUp(String url, String browserName) throws InterruptedException {
        getLocalDriver(browserName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }
    @AfterMethod
    public void tearDown() {driver.close();}


    //generic methods
    public WebDriver getDriver() {
        return driver;
    }

    public String getCurrentTitle() {
        return driver.getTitle();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public void clickOn(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }
    public void typeAndEnter(WebElement element, String text) {
        element.sendKeys(text, Keys.ENTER);
    }

}








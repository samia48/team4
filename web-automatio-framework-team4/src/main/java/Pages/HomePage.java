package Pages;

import Base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //object
   @FindBy(xpath ="//body[@class='page-template-default page page-id-2777 custom-background']" )
    WebElement alert;
    public void testWebAlert() throws InterruptedException {
        // clicking on try it button
        driver.findElement(By.xpath("//body[@class='page-template-default page page-id-2777 custom-background']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    @FindBy(xpath = "//a[@href='/angularJs-protractor/registration-login-example']")
    WebElement RegistrationLoginButton;


    //reusable steps


    public void clickOnRegistratioLoginBotton(){
        clickOn(RegistrationLoginButton);
        LOG.info("click on login button success");
    }
}

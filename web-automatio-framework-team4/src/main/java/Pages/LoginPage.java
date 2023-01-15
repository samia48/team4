package Pages;

import Base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement PasswordField;
    @FindBy(xpath = "//div[@class='form-actions']")

    WebElement LoginButton;


    @FindBy(xpath = "//span[@class='ns-6pkzg-e-16']" )
    WebElement CloseButton;

        //reusable methods
    public void typeUserName(String username){
        type(usernameField, username);
        LOG.info("type username success");
    }
    public void typePassword(String username){
        type(PasswordField, username);
        LOG.info("type username success");
    }
    public void clickOnLoginButton(){
        clickOn(LoginButton);
        LOG.info("click Login button success");
    }


    public void clickOnCloseButton(){
        clickOn(CloseButton);
        LOG.info("click Close button success");
    }

}

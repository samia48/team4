package tests;

import Base.CommonAPI;
import Pages.HomePage;
import Pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends CommonAPI {
    Logger LOG = LogManager.getLogger(tests.TestLogin.class.getName());
    @Test
    public void validLogin() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "AngularJS Protector Practice Site Online - Global SQA");
        LOG.info("login title page validation success");

        homePage.clickOnRegistratioLoginBotton();

        loginPage.typeUserName("Admin");
        loginPage.typePassword("admin123");
        loginPage.clickOnLoginButton();

    }
}
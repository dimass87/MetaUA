import common.Steps;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;
import utils.SeleniumBase;
import utils.WebDriverListener;

import static org.testng.Assert.assertEquals;

@Listeners(WebDriverListener.class)
public class LoginTests extends SeleniumBase {

    private Steps step;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;


    @BeforeClass
    public void setUp() {
        step = new Steps(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }


    @Test(dataProvider = "getDataForLoginForm")
    @Description("Test with incorrect credentials / empty fields")
    public void test_001(String login, String password, String expectedErrorMessage) {
        step.goToUrl(homePage.getPageURL());
        step.clearField(homePage.getLoginField());
        step.setField(homePage.getLoginField(), login);
        step.clearField(homePage.getPasswordField());
        step.setField(homePage.getPasswordField(), password);
        step.click(homePage.getEnterButton());
            String actualErrorMessage =
        step.getText(loginPage.getErrorMessageField());
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @Test
    @Description("Test with correct credentials")
    public void test_002() {
        step.goToUrl(homePage.getPageURL());
        step.clearField(homePage.getLoginField());
        step.setField(homePage.getLoginField(), "test20171022@meta.ua");
        step.clearField(homePage.getPasswordField());
        step.setField(homePage.getPasswordField(),"test123");
        step.click(homePage.getEnterButton());
            String actualUserName =
        step.getText(accountPage.getUserName());
        assertEquals("test20171022", actualUserName);
    }
    @DataProvider
    public Object[][] getDataForLoginForm(){
        String incorrectLogin = loginPage.getINCORRECT_LOGIN_MESSAGE();
        String incorrectPassword = loginPage.getINCORRECT_PASSWORD_MESSAGE();
        return new Object[][]{
                {"", "", incorrectLogin},
                {"", "test", incorrectLogin},
                {"test", "", incorrectPassword},
                {"test", "test", incorrectPassword},
                {"test20171022@meta.ua", "", incorrectPassword},
                {"test20171022@meta.ua", "test", incorrectPassword}
        };
    }

}

import common.Steps;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.HomePage;
import utils.SeleniumBase;
import utils.WebDriverListener;

import static org.testng.Assert.assertTrue;

@Listeners(WebDriverListener.class)
public class HomepageElementsTests extends SeleniumBase{

    private Steps step;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        step = new Steps(driver);
        homePage = new HomePage(driver);
        step.goToUrl(homePage.getPageURL());
    }

    @Test(dataProvider = "getElement")
    @Description("Test homepage elements are present")
    public void test_001(WebElement element) {
            Boolean webElement =
        step.elementIsPresent(element, 10);
        assertTrue(webElement);
    }

    @DataProvider
    public Object[] getElement(){
        return new Object[]{
                homePage.getLoginField(),
                homePage.getPasswordField(),
                homePage.getRememberMeCheckbox(),
                homePage.getEnterButton(),
                homePage.getForgetPassLink(),
                homePage.getRegisterLink(),
                homePage.getSearchField(),
                homePage.getSearchButton(),
                homePage.getTabInternet(),
                homePage.getTabRegistry(),
                homePage.getTabNews(),
                homePage.getTabMap(),
                homePage.getTabEssays(),
                homePage.getTabGoods(),
                homePage.getLinkNews(),
                homePage.getTabStrip(),
                homePage.getTabMain(),
                homePage.getTabOdessa(),
                homePage.getTabSport(),
                homePage.getLinkAllitems(),
                homePage.getTranslateBlock(),
                homePage.getWeatherBlock()
        };
    }
}

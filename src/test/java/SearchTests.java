import common.Steps;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.HomePage;
import page.SearchResultPage;
import utils.SeleniumBase;
import utils.WebDriverListener;

import static org.testng.Assert.assertTrue;

@Listeners(WebDriverListener.class)
public class SearchTests extends SeleniumBase {

    private Steps step;
    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @BeforeClass
    public void setUp() {
        step = new Steps(driver);
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    @Description("Test search info string without data")
    public void test_001() {
        step.goToUrl(homePage.getPageURL());
        step.clearField(homePage.getSearchField());
        step.click(homePage.getSearchButton());
            String actualRequestInfo =
        step.getText(searchResultPage.getEmptyRequestMessage());
        assertTrue(actualRequestInfo.contains(searchResultPage.getEmptyRequestTextInfo()));
    }

    @Test
    @Description("Test search info string with data")
    public void test_002() {
        step.goToUrl(homePage.getPageURL());
        step.clearField(homePage.getSearchField());
        step.setField(homePage.getSearchField(), "Petrosoft");
        step.click(homePage.getSearchButton());
            String actualRequestInfo =
        step.getText(searchResultPage.getResultsFoundInfoString());
        assertTrue(actualRequestInfo.contains(searchResultPage.getResultsFoundTextInfo()));
    }

    @Test
    @Description("Test failed search result")
    public  void test_003() {
        step.goToUrl(homePage.getPageURL());
        step.clearField(homePage.getSearchField());
        step.setField(homePage.getSearchField(), "@@@@");
        step.click(homePage.getSearchButton());
            String actualResultText =
        step.getText(searchResultPage.getResultsNotFoundInfoString());
        assertTrue(actualResultText.contains(searchResultPage.getResultsNotFoundTextInfo()));
    }

    @Test
    @Description("Test success search result")
    public  void test_004() {
        step.goToUrl(homePage.getPageURL());
        step.clearField(homePage.getSearchField());
        step.setField(homePage.getSearchField(), "Petrosoft");
        step.click(homePage.getSearchButton());
            String actualResultText =
        step.getText(searchResultPage.getSearchResults().get(0));
        assertTrue(actualResultText.contains("Petrosoft"));
    }
}
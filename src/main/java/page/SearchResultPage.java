package page;

import common.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends Steps{

    private final static String PAGE_URL = "http://search.meta.ua/search.asp";
    private final static String EMPTY_REQUEST_TEXT_INFO = "Пустой запрос";
    private final static String RESULTS_FOUND_TEXT_INFO = "Найдено результатов: примерно";
    private final static String RESULTS_NOT_FOUND_TEXT_INFO = "Результатов нет";

    @FindBy(id = "mainQ")
    private WebElement searchField;

    @FindBy(xpath = "//input[@class = 'buttQ']")
    private WebElement searchButton;

    @FindBy(id = "resl")
    private WebElement emptyRequestMessage;

    @FindBy(id = "resInfo-0")
    private WebElement resultsFoundInfoString;

    @FindBy(className = "gs-snippet")
    private WebElement resultsNotFoundInfoString;

    @FindBy(xpath = "//div[@class = 'gsc-resultsbox-visible']//div[@class = 'gsc-webResult gsc-result']//td[@class = 'gsc-table-cell-snippet-close']//a[@class = 'gs-title']")
    private List<WebElement> searchResults;


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }


    public String getEmptyRequestTextInfo() {
        return EMPTY_REQUEST_TEXT_INFO;
    }

    public String getResultsFoundTextInfo() {
        return RESULTS_FOUND_TEXT_INFO;
    }

    public String getResultsNotFoundTextInfo() {
        return RESULTS_NOT_FOUND_TEXT_INFO;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getSearchResults() {
        List<WebElement> elements = new ArrayList();
        elements.addAll(searchResults);
        return elements;
    }

    public WebElement getEmptyRequestMessage() {
        return emptyRequestMessage;
    }

    public WebElement getResultsFoundInfoString() {
        return resultsFoundInfoString;
    }

    public WebElement getResultsNotFoundInfoString() {
        return resultsNotFoundInfoString;
    }
}

package page;

import common.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Steps{

    private final static String PAGE_URL = "http://meta.ua/";

//  Login form elements
    @FindBy(xpath = "//input[contains(@name, 'login')]")
    private WebElement loginField;

    @FindBy(xpath = "//input[contains(@name, 'password')]")
    private WebElement passwordField;

    @FindBy(id = "lifetime")
    private WebElement rememberMeCheckbox;

    @FindBy(xpath = "//input[contains(@value, 'Войти')]")
    private WebElement enterButton;

    @FindBy(xpath = "//a[contains(text(), 'Забыли пароль')]")
    private WebElement forgetPassLink;

    @FindBy(xpath = "//a[contains(text(), 'Регистрация')]")
    private WebElement registerLink;

//  Search elements
    @FindBy(id = "mainQ")
    private WebElement searchField;

    @FindBy(id = "sb")
    private WebElement searchButton;

//  Tabs above the search field
    @FindBy(id = "sel-")
    private WebElement tabInternet;

    @FindBy(id = "sel-dir")
    private WebElement tabRegistry;

    @FindBy(id = "sel-news")
    private WebElement tabNews;

    @FindBy(id = "sel-map")
    private WebElement tabMap;

    @FindBy(id = "sel-edu")
    private WebElement tabEssays;

    @FindBy(id = "sel-market")
    private WebElement tabGoods;

//  News block tabs
    @FindBy(xpath = "//div[@id = 'hc_news']/a")
    private WebElement linkNews;

    @FindBy(id = "news_0")
    private WebElement tabStrip;

    @FindBy(id = "news_1")
    private WebElement tabMain;

    @FindBy(id = "news_2")
    private WebElement tabOdessa;

    @FindBy(id = "news_3")
    private WebElement tabSport;

    @FindBy(xpath = "//div[@id = 'box_news']//a[@class = 'mo']")
    private WebElement linkAllitems;

//  Translator
    @FindBy(className = "translate_block")
    private WebElement translateBlock;

//  Weather
    @FindBy(id = "box_info")
    private WebElement weatherBlock;






    public HomePage(WebDriver driver) {
        super(driver);
    }


    public String getPageURL() {
        return PAGE_URL;
    }
//  Login form
    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }

    public WebElement getEnterButton() {
        return enterButton;
    }

    public WebElement getForgetPassLink() {
        return forgetPassLink;
    }

    public WebElement getRegisterLink() {
        return registerLink;
    }

//  Search
    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

//  Tabs above the search
    public WebElement getTabInternet() {
        return tabInternet;
    }

    public WebElement getTabRegistry() {
        return tabRegistry;
    }

    public WebElement getTabNews() {
        return tabNews;
    }

    public WebElement getTabMap() {
        return tabMap;
    }

    public WebElement getTabEssays() {
        return tabEssays;
    }

    public WebElement getTabGoods() {
        return tabGoods;
    }

//  News block
    public WebElement getLinkNews() {
        return linkNews;
    }

    public WebElement getTabStrip() {
        return tabStrip;
    }

    public WebElement getTabMain() {
        return tabMain;
    }

    public WebElement getTabOdessa() {
        return tabOdessa;
    }

    public WebElement getTabSport() {
        return tabSport;
    }

    public WebElement getLinkAllitems() {
        return linkAllitems;
    }


    public WebElement getTranslateBlock() {
        return translateBlock;
    }

    public WebElement getWeatherBlock() {
        return weatherBlock;
    }

}

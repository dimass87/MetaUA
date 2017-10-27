package page;

import common.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Steps{

    private final static String PAGE_URL = "https://passport.meta.ua/";
    private String INCORRECT_LOGIN_MESSAGE = "Неверное имя пользователя";
    private String INCORRECT_PASSWORD_MESSAGE = "Введенный пароль неверен";

    @FindBy(id = "login")
    private WebElement loginField;

    @FindBy(xpath = "//input[contains(@name, 'password')]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[contains(@value, 'Войти')]")
    private WebElement enterButton;

    @FindBy(xpath = "//div[@id='b3_cnt']//b")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getEnterButton() {
        return enterButton;
    }

    public WebElement getErrorMessageField() {
       return errorMessage;
    }

    public String getINCORRECT_LOGIN_MESSAGE() {return INCORRECT_LOGIN_MESSAGE;}

    public String getINCORRECT_PASSWORD_MESSAGE() {return INCORRECT_PASSWORD_MESSAGE;}


}

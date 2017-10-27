package page;

import common.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Steps {

    private final static String PAGE_URL = "http://passport.meta.ua/account/";

    @FindBy(xpath = "//div[@id='_cnt']//b")
    private WebElement userName;

    public AccountPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getUserName() {return userName;}


}

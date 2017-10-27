package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    private final static String PAGE_URL = "http://passport.meta.ua/?mode=reg&ref=main";

    private WebDriver driver;

    @FindBy(xpath = "//strong[contains(.//a, 'ПАСПОРТ')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@class='regged']/a")
    private WebElement loginLink;

    @FindBy(xpath = "//div[contains(.//label, 'Имя')]//input")
    private WebElement firstNameField;

    @FindBy(xpath = "//div[contains(.//label, 'Фамилия')]//input")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[contains(.//label, 'Логин')]//input")
    private WebElement loginField;

    @FindBy(xpath = "//div[contains(.//label, 'Пароль')]//input")
    private WebElement passwordField;

    @FindBy(xpath = "//div[contains(.//label, 'Повторите пароль')]//input")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//span[@id='recaptcha-anchor']")
    private WebElement capcha;

    @FindBy(xpath = "//input[@id='check_agree']")
    private WebElement AgreementCheckbox;

    @FindBy(id = "register_btn")
    private WebElement registerButton;

}

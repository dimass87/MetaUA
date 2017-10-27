package common;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Steps extends DriverWait {

    public Steps(WebDriver driver) {
        super(driver);
    }

    @Step
    public void click(WebElement element) {
        waitForElementToClick(element).click();
    }

    @Step
    public String getText(WebElement element) {
        return element.getText();
    }

    @Step
    public void clearField(WebElement element) {
        element.clear();
    }

    @Step
    public void setField(WebElement element, String text) {
        element.sendKeys(text);
    }

    @Step
    public void goToUrl(String url) {
        driver.get(url);
    }

    @Step
    public boolean elementIsPresent(WebElement element, int seconds) {
        try {
            driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
            waitForElementIsVisible(element);
            return true;
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
    }

    @Step
    private String setFileDestination() {
        return "./target/screenshots/" + new Date().toString() + ".png";
    }
}


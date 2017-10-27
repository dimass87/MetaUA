package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DriverWait extends Constructor {

    private static final int EXPLICIT_WAIT_TIME = 15;

    public DriverWait(WebDriver driver) {
        super(driver);
    }


    protected WebElement waitForElementToClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected int waitForListElement(List<WebElement> elements) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        List<WebElement> elementList = wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        return elementList.size();
    }

    protected WebElement waitForElementIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}



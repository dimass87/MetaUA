package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class Constructor {

    public WebDriver driver;

    Constructor(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

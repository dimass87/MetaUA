package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.nio.file.FileSystems;

public class DriverUtil {

    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String SEPARATOR = FileSystems.getDefault().getSeparator();
    private static final String DRIVER_PATH = PROJECT_PATH + SEPARATOR + "src" + SEPARATOR + "main" + SEPARATOR + "resources" + SEPARATOR + "drivers" + SEPARATOR;
    private static final String GECKO_DRIVER_NAME = "webdriver.gecko.driver";
    private static final String CHROME_DRIVER_NAME = "webdriver.chrome.driver";
    private static final String CHROME_DRIVER_FILE_NAME = "chromedriver";
    private static final String GECKO_DRIVER_FILE_NAME = "geckodriver";
    protected WebDriver driver1;
    protected EventFiringWebDriver driver;

    @Attachment(value = "Page screenshot", type = "image/png")
    static byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }


    public void setUpWebDriver() {
        String browserName = System.getProperty("browser_name");

        try {
            switch (browserName) {
                case "firefox":
                    System.setProperty(GECKO_DRIVER_NAME, DRIVER_PATH + GECKO_DRIVER_FILE_NAME);
                    driver1 = new FirefoxDriver();
                    driver = new EventFiringWebDriver(driver1);
                    WebDriverListener listener1 = new WebDriverListener(driver1);
                    driver.register(listener1);


                    break;
                case "chrome":
                    System.setProperty(CHROME_DRIVER_NAME, DRIVER_PATH + CHROME_DRIVER_FILE_NAME);
//                    ChromeOptions options = new ChromeOptions();
//                    options.setHeadless(true);
//                    options.addArguments("--disable-gpu");
//                    driver1 = new ChromeDriver(options);
                    driver1 = new ChromeDriver();
                    driver = new EventFiringWebDriver(driver1);
                    WebDriverListener listener = new WebDriverListener(driver1);
                    driver.register(listener);


            }
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Failed to create Driver for " + browserName);
            System.out.println(e.getMessage());
        }
    }

    public void tearDownWebDriver(){
        try {
            driver.manage().deleteAllCookies();
            driver.quit();
        }catch (Exception e){
            System.out.println("Cannot quit driver, cause: " + e.getMessage());
        }
    }
}

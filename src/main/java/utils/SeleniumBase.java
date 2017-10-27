package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SeleniumBase extends DriverUtil {

    @BeforeClass
    public void beforeClass(){
        setUpWebDriver();
    }
    @AfterClass
    public void afterClass(){
        tearDownWebDriver();
    }

//    public void sleepALoop(int seconds) {
//        for (int c = 0; c < seconds; c++) { //looped sleeps are better
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
}

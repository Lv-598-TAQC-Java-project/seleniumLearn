package com.greencity.econews;

import com.greencity.elements.BaseWebElement;
import com.greencity.pages.WelcomePage;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.ref.WeakReference;

public class TestRunner {
    private final String BASE_URL = "https://ita-social-projects.github.io/GreenCityClient/#/";

    // private Map<Long, WebDriver> drivers;


    protected WebDriver getDriver() {
            String webDriverPath = System.getenv("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", "C:/Users/nadia/Desktop/chromedriver/chromedriver.exe");
        WebDriver currentWebDriver = new ChromeDriver();
        WaitWrapper.setDefaultImplicitlyWait(currentWebDriver);
//        if (currentWebDriver == null) {
//            currentWebDriver = new ChromeDriver();
//            WaitWrapper.setDefaultImplicitlyWait(currentWebDriver);
//            drivers.put(Thread.currentThread().getId(), currentWebDriver);
//        }
        return currentWebDriver;
    }

    protected WelcomePage loadApplication() {
        // return new HomePage(driver);
        WebDriver driver = getDriver();
        driver.get(BASE_URL);
        return new WelcomePage(driver);

    }
}

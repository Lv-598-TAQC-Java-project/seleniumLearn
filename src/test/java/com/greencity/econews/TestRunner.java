package com.greencity.econews;

import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestRunner {
    private final String BASE_URL = "https://ita-social-projects.github.io/GreenCityClient/#";
   // private Map<Long, WebDriver> drivers;
    protected static WebDriver webDriver;
    @AfterClass
    public void tearDownClass(){
//        webDriver.close();
//        webDriver.quit();
    }

    @BeforeClass
    protected void getDriver() {
        String webDriverPath = System.getenv("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        webDriver = new ChromeDriver();
        WaitWrapper.setDefaultImplicitlyWait(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get(BASE_URL);
    }
}

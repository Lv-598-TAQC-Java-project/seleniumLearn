package com.greencity.utils;

import com.greencity.elements.BaseWebElement;
import com.greencity.elements.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitWrapper {
    private static final long IMPLICITLY_WAIT_SECONDS = 10L;
    private static final long EXPLICITLY_WAIT_SECONDS = 10L;
    private WebDriverWait webDriverWait;
    public static void setDefaultImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
    }

    public static void setCustomImplicitlyWait(WebDriver driver, long implicitlyWait) {
        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
    }

    public static void setEmptyImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static void setDefaultExplicitlyWait(WebDriver driver, long explicitlyWait, BaseWebElement webElement){
        setEmptyImplicitlyWait(driver);
        (new WebDriverWait(driver,explicitlyWait)).until(ExpectedConditions.visibilityOf(webElement.webElement));
        setDefaultImplicitlyWait(driver);
    }



}

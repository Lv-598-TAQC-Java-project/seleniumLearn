package com.greencity.utils;

import com.greencity.elements.BaseWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitWrapper {
    private static final long IMPLICITLY_WAIT_SECONDS = 10L;
    private static final long EXPLICITLY_WAIT_SECONDS = 10L;
    private WebDriver webDriver;

    public WaitWrapper(WebDriver driver) {
        this.webDriver = driver;
    }

    public static void setDefaultImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
    }

    public static void setCustomImplicitlyWait(WebDriver driver, long implicitlyWait) {
        if (implicitlyWait > 0) {
            driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
        }
    }

    public static void setEmptyImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static <V> V setExplicitlyWait(WebDriver driver, long explicitlyWait, Function<? super WebDriver, V> expectedCondition) {
        setEmptyImplicitlyWait(driver);
        WebDriverWait driverWait = new WebDriverWait(driver, explicitlyWait);
        V res = driverWait.until(expectedCondition);
        setDefaultImplicitlyWait(driver);
        return res;
    }



}

package com.greencity.utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WaitWrapper {
    private static final long IMPLICITLY_WAIT_SECONDS = 10L;
    private static final long EXPLICITLY_WAIT_SECONDS = 10L;

    public static void setDefaultImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
    }

    public static void setCustomImplicitlyWait(WebDriver driver, long implicitlyWait) {
        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
    }

    public static void setEmptyImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }



}

package com.greencity.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ScrollWrapper {


    public static void scrollPageToDown(By path, WebDriver webDriver) {
        WaitWrapper.setEmptyImplicitlyWait(webDriver);
        Actions actionScrollDown = new Actions(webDriver);
        try {
            do {
                actionScrollDown.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
                WebElement webElement = webDriver.findElement(path);
                if (webElement == null) {
                    actionScrollDown.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
                    break;
                }
            } while (true);
        } catch (NoSuchElementException e) {
            actionScrollDown.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        }
        WaitWrapper.setDefaultImplicitlyWait(webDriver);
    }
}

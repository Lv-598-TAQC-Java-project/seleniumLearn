package com.greencity.test;

import com.greencity.elements.BaseWebElement;
import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListElement extends BaseWebElement {

    public ListElement(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public ListElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public ListElement(WebElement webElement) {
        super(webElement);
    }

}

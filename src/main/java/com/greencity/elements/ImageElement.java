package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageElement extends BaseWebElement{
    public ImageElement(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public ImageElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public ImageElement(WebElement webElement) {
        super(webElement);
    }


    }


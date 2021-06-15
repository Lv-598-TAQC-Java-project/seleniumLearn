package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LabelElement extends BaseWebElement {

    public LabelElement(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public LabelElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public LabelElement(WebElement webElement) {
        super(webElement);
    }

    public String getText() {
        return this.webElement.getText();
    }
}


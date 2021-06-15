package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Label extends BaseWebElement{
    public Label(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public Label(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public Label(WebElement webElement) {
        super(webElement);
    }
    public String getText(){return this.webElement.getText();}
}

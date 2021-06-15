package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputElement extends BaseWebElement {

    public InputElement(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public InputElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public InputElement(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        this.webElement.click();
    }

    public void sendKeys(String keys) {
        this.webElement.sendKeys(keys);
    }

    public void clear() {
        webElement.clear();
    }

    public String getText() {
        return webElement.getText();
    }
}

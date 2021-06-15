package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonElement extends BaseWebElement {


    public ButtonElement(BaseLocator locator, WebDriver webDriver) {
        super(locator, webDriver);
    }

    public ButtonElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public ButtonElement(WebElement webElement) {
        super(webElement);
    }

    public void clickOnButton() {
        webElement.click();
    }
}

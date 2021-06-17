package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownElement extends BaseWebElement {

    public DropdownElement(BaseLocator locator, WebDriver webDriver) {
        super(locator, webDriver);
    }

    public DropdownElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public DropdownElement(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        webElement.click();
    }

    public void clickOnMenuElement(BaseLocator locator) {
        ButtonElement button = new ButtonElement(locator,webElement);
        button.clickOnButton();
    }
}

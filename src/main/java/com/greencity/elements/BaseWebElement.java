package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseWebElement {

    protected By path;
    protected WebDriver driver;
    public WebElement webElement;

    public BaseWebElement(BaseLocator locator, WebDriver driver) {
        this.path = locator.getPath();
        this.driver = driver;
        this.webElement = driver.findElement(path);
    }

    public BaseWebElement(BaseLocator locator, WebElement webElement) {
        this.path = locator.getPath();
        this.webElement = webElement.findElement(path);
    }

    public BaseWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public boolean isDisplayed() {
        return this.webElement.isDisplayed();
    }

    public boolean isSelected() {
        return this.webElement.isSelected();
    }

}

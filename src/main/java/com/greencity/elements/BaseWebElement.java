package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseWebElement {
    protected WebElement element;
    protected WebDriver driver;
    protected By path;

    public BaseWebElement(BaseLocator path, WebDriver driver) {
        this.path = path.getPath();
        this.driver = driver;
        this.element = driver.findElement(this.path);
    }
}


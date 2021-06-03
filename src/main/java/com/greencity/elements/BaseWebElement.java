package com.greencity.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseWebElement {

    private By path;
    private WebDriver driver;

    public BaseWebElement(By path, WebDriver driver) {
        this.path = path;
        this.driver = driver;
    }
}

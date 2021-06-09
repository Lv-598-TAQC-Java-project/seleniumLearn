package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link extends BaseWebElement{
    public Link(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public Link(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public Link(WebElement webElement) {
        super(webElement);
    }

    public void click(){
        this.webElement.click();
    }
    public String getLinkPath(){
        return webElement.getAttribute("href");
    }
}

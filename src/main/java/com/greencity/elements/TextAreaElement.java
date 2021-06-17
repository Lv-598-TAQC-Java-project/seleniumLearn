package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextAreaElement extends BaseWebElement{
    public TextAreaElement(BaseLocator locator, WebDriver driver) {
        super(locator, driver);
    }

    public TextAreaElement(BaseLocator locator, WebElement webElement) {
        super(locator, webElement);
    }

    public TextAreaElement(WebElement webElement) {
        super(webElement);
    }
    public String getText(){return this.webElement.getText();}
    public void enterText(String text){ this.webElement.sendKeys(text);}
    public void click(){
        this.webElement.click();
    }
    public void clear() {
        webElement.clear();
    }
}

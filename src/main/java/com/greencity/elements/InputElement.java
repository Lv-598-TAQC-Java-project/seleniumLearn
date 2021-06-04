package com.greencity.elements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputElement extends BaseWebElement {

    public InputElement(BaseLocator path, WebDriver driver) {
        super(path, driver);
    }
    public void click (){
        element.click();
    }
    public void setText(String str){
        element.sendKeys(str);
    }
    public String getText (){
        return element.getText();
    }

}

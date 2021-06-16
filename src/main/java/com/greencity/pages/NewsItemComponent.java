package com.greencity.pages;

import com.greencity.elements.ImageElement;
import com.greencity.elements.LabelElement;
import com.greencity.elements.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsItemComponent extends BaseCommon {

    public NewsItemComponent(WebDriver webDriver, WebElement newsItem) {
        super(webDriver);
    }
}
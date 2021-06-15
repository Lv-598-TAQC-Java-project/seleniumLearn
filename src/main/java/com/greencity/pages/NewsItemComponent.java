package com.greencity.pages;

import com.greencity.elements.Link;
import org.openqa.selenium.WebDriver;

public class NewsItemComponent extends BaseCommon{

    private Link ecoNewsImg;
    private Link ecoNewsTag;
    private Link ecoNewsTitle;
    private Link ecoNewsDescription;
    private Link ecoNewsCreationDate;
    private Link ecoNewsAuthor;


    public NewsItemComponent(WebDriver webDriver) {
        super(webDriver);
    }
}

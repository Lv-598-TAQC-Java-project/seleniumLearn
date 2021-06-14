package com.greencity.test;

import com.greencity.elements.BaseWebElement;
import com.greencity.elements.Link;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentNewsComponent extends BaseCommon {
    private Link titleNews;
    private WebElement rootWebElement;

    CurrentNewsComponent(WebDriver webDriver, WebElement rootWebElement) {
        super(webDriver);
        this.rootWebElement = rootWebElement;
        initElements();
    }

    private void initElements() {
        titleNews = new Link(CurrentNewsLocators.NEWS_TITLE, rootWebElement); //????
    }

    public String getTitleText() {
        return titleNews.getText();
    }

    //return type must be CurrentNewsPage!
    public void clickOnCurrentNewsTitle() {
        titleNews.click();
    }
}

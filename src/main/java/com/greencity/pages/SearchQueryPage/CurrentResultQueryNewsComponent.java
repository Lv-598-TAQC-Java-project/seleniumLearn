package com.greencity.pages.SearchQueryPage;

import com.greencity.elements.Link;
import com.greencity.locators.CurrentResultQueryNewsLocators;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentResultQueryNewsComponent extends BaseCommon {
    private Link titleNews;
    private WebElement rootWebElement;

    CurrentResultQueryNewsComponent(WebDriver webDriver, WebElement rootWebElement) {
        super(webDriver);
        this.rootWebElement = rootWebElement;
        initElements();
    }

    private void initElements() {
        titleNews = new Link(CurrentResultQueryNewsLocators.NEWS_TITLE, rootWebElement); //????
    }

    public String getTitleText() {
        return titleNews.getText();
    }

    //return type must be CurrentNewsPage!
    public void clickOnCurrentNewsTitle() {
        titleNews.click();
    }
}

package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcoNewsPage extends BaseCommon {
    ///region WebElements
    private Link createNewsBtn;
    ///endregion

    public EcoNewsPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        //createNewsBtn = new Link(NewsPageLocator.CREATE_NEWS_BUTTON, this.webDriver);
    }

//    public CreateNewsPage clickOnCreateNewsBtn() {
//        createNewsBtn.click();
//        return new CreateNewsPage();
//    }
}

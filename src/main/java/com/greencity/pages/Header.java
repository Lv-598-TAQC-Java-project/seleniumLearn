package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.HeaderLocators;
import com.greencity.pages.EcoNewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
    ///region webElements
    private Link logo;
    private Link ecoNewsLink;//or WebElement
    ///endregion
    protected WebDriver webDriver;

    public Header(WebDriver webDriver) {
        this.webDriver = webDriver;
        initElements();
    }

    ///region goToPages
    public EcoNewsPage goToEcoNewsPage() {
        ecoNewsLink.click();
        return new EcoNewsPage(webDriver);
    }


    ///endregion

    protected void initElements() {
        logo = new Link(HeaderLocators.LOGO,this.webDriver);
        ecoNewsLink = new Link(HeaderLocators.ECO_NEWS,this.webDriver);
    }
}

package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.Link;
import com.greencity.locators.HeaderLocators;
import org.openqa.selenium.WebDriver;


public class Header {
    ///region webElements
    private Link logo;
    private Link ecoNewsLink;//or WebElement
    private ButtonElement searchButton;
    private Link signUpBtn;
    private Link signInBtn;
    ///endregion
    protected WebDriver webDriver;

    public Header(WebDriver webDriver) {
        this.webDriver = webDriver;
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initElements();
    }

    ///region goToPages
    public EcoNewsPage goToEcoNewsPage() {
        ecoNewsLink.click();
        return new EcoNewsPage(webDriver);
    }

    public SignInPage goToSignInPage(){
        signInBtn.click();
        return new SignInPage(webDriver);
    }

    ///endregion

    protected void initElements() {
        logo = new Link(HeaderLocators.LOGO,this.webDriver);
        ecoNewsLink = new Link(HeaderLocators.ECO_NEWS,this.webDriver);
        searchButton = new ButtonElement(HeaderLocators.SEARCH, webDriver);
    }
}

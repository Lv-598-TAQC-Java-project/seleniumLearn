package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.Link;
import com.greencity.locators.HeaderLocators;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class Header {
    ///endregion
    protected WebDriver webDriver;
    ///region webElements
    private Link logo;
    private Link ecoNewsLink;//or WebElement
    private ButtonElement searchButton;
    private Link signUpBtn;
    private Link signInBtn;

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
        //зробити перевірку на присутність на цій сторінці
        ecoNewsLink.click();
        return new EcoNewsPage(webDriver);
    }


    public SignInPage goToSignInPage() {
        signInBtn = new Link(HeaderLocators.SIGN_IN, this.webDriver);
        signInBtn.click();
        return new SignInPage(webDriver);
    }

    public SearchPopup goToSearchPopup() {
        searchButton.clickOnButton();
        return new SearchPopup(webDriver);
    }


    ///endregion

    protected void initElements() {

        logo = new Link(HeaderLocators.LOGO,this.webDriver);
        ecoNewsLink = new Link(HeaderLocators.ECO_NEWS,this.webDriver);
        searchButton = new ButtonElement(HeaderLocators.SEARCH, webDriver);

    }
}

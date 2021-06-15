package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.HeaderLocators;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Header {
    ///region webElements
    private Link logo;
    private Link ecoNewsLink;//or WebElement
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
        signInBtn = new Link(HeaderLocators.SIGN_IN,this.webDriver);
        signInBtn.click();

        return new SignInPage(webDriver);
    }
    public SignInPage goToSignUpPage(){
        signUpBtn = new Link(HeaderLocators.SIGN_UP,this.webDriver);
        signUpBtn.click();
        return new SignInPage(webDriver);
    }
    ///endregion

    protected void initElements() {
        logo = new Link(HeaderLocators.LOGO,this.webDriver);
        ecoNewsLink = new Link(HeaderLocators.ECO_NEWS,this.webDriver);


    }
}

package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.Link;
import com.greencity.locators.HeaderLocators;
import org.openqa.selenium.WebDriver;


public class Header extends BasePage  {
    ///region webElements
    private Link logo;
    private Link ecoNewsLink;//or WebElement
    private ButtonElement searchButton;
    private Link signUpBtn;
    private Link signInBtn;
    ///endregion
    protected WebDriver webDriver;

    public Header(WebDriver webDriver) {
        super(webDriver);
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

    public RegistrationPage clickOnSignUp(){
        signUpBtn.click();
        return new RegistrationPage(webDriver);
    }

    protected void initElements() {

        logo = new Link(HeaderLocators.LOGO,this.webDriver);
        searchButton = new ButtonElement(HeaderLocators.SEARCH, webDriver);
        ecoNewsLink = new Link(HeaderLocators.ECO_NEWS,this.webDriver);
        signUpBtn = new Link(HeaderLocators.SIGN_UP,this.webDriver);
        signInBtn = new Link(HeaderLocators.SIGN_IN,this.webDriver);
    }
}

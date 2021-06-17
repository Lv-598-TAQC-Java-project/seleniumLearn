package com.greencity.pages;

import com.greencity.elements.InputElement;
import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import com.greencity.locators.SignInLocators;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePopUp{

    private InputElement email;
    private InputElement password;
    private InputElement sighInBtn;
    private Link closeBtn;

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        email = new InputElement(SignInLocators.EMAIL,this.webDriver);
        password = new InputElement(SignInLocators.PASSWORD,this.webDriver);
        sighInBtn = new InputElement(SignInLocators.SIGN_IN_BTN,this.webDriver);

    }
    public MySpacePage signIn(){
        email.sendKeys("viyim18256@vvaa1.com");
        password.sendKeys("Qwe!qwe1");
        sleep();
        clickOnSignInBtn();
        return new MySpacePage(webDriver);
    }
    public void clickOnSignInBtn(){
        sighInBtn.click();
    }

    public void sleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public Header clickOnCloseBtn(){
        closeBtn = new Link(SignInLocators.CLOSE_BTN,this.webDriver);
        closeBtn.click();
        return getHeader();
    }
}

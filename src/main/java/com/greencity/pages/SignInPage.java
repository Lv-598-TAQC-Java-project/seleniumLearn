package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import com.greencity.locators.SignInLocators;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePopUp{

    private Link email;
    private Link password;
    private Link sighInBtn;


    public SignInPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        email = new Link(SignInLocators.EMAIL,this.webDriver);
        password = new Link(SignInLocators.PASSWORD,this.webDriver);
        sighInBtn = new Link(SignInLocators.SIGN_IN_BTN,this.webDriver);

    }
    public MySpacePage signIn() throws InterruptedException {
        email.sendKeys("viyim18256@vvaa1.com");
        password.sendKeys("Qwe!qwe1");
       // sleep();
        clickOnSignInBtn();
        return new MySpacePage(webDriver);
    }
    public void clickOnSignInBtn(){
        sighInBtn.click();
    }
    public void sleep() throws InterruptedException {
        Thread.sleep(3000);
    }
}

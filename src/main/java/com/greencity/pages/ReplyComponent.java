package com.greencity.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.greencity.locators.ReplyLocator.*;

public class ReplyComponent {
    protected WebDriverWait wait;
    private WebElement replyItem;
    private WebDriver driver;

    public ReplyComponent(WebDriver driver, WebElement replyItem) {
        this.driver = driver;
        this.replyItem = replyItem;
    }

    public ReplyComponent clickReplyEditButton() {
        getReplyEditButton().click();
        return this;
    }

    public WebElement getReplyEditButton() {
        return replyItem.findElement(REPLY_EDIT_BUTTON.getPath());
    }

    public WebElement getReplyEditField() {
        return replyItem.findElement(REPLY_EDIT_TEXTAREA.getPath());
    }

    public WebElement getReplyComment() {
        return replyItem.findElement(REPLY_CURRENT_TEXT.getPath());
    }

    public boolean isReplyButtonDisplayed() {
        return replyItem.findElements(REPLY_REPLY_BUTTON.getPath()).size() > 0;
    }

    public WebElement getViewReplyButton(){
        return  replyItem.findElement(VIEW_REPLY_BUTTON.getPath());
    }

    public boolean isReplyPresent() {
        try {
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            ExpectedConditions.visibilityOf(getReplyComment());
            return true;
        } catch (StaleElementReferenceException e) {
            return false;
        }
    }
}

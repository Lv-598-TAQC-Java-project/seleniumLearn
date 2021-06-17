package com.greencity.locators;

import org.openqa.selenium.By;

public enum ReplyLocator implements BaseLocator {
    REPLY_EDIT_BUTTON(By.cssSelector("//*[@id=\"main-content\"]/div/app-comments-container/app-comments-list/div[1]/div[4]/app-reply-comment/div/button")),
    REPLY_EDIT_TEXTAREA(By.cssSelector("//*[@id=\"main-content\"]/div/app-comments-container/app-comments-list/div[1]/app-comments-container/app-add-comment/form/div/textarea")),
    REPLY_REPLY_BUTTON(By.cssSelector("form[class='main-wrapper wrapper-reply ng-dirty ng-valid ng-touched'] button[class='primary-global-button']")),
    VIEW_REPLY_BUTTON(By.cssSelector("span[class='btn-text']")),//*[@id="main-content"]/div/app-comments-container/app-comments-list/div[1]/div[4]/div/app-view-replies/button[1]
//    REPLY_DELETE_BUTTON(By.cssSelector(".cta-btn.delete")),
    REPLY_CURRENT_TEXT(By.cssSelector("div[class='comment-body-wrapper wrapper-reply ng-star-inserted'] p[class='comment-text ng-star-inserted']"));

    private final By path;

    ReplyLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return null;
    }
}

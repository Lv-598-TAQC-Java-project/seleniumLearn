package com.greencity.locators;

import org.openqa.selenium.By;

public enum ReplyLocator implements BaseLocator {
    REPLY_AUTHOR(By.cssSelector(".author-name")),
    REPLY_DATE(By.cssSelector(".comment-date-month")),
    REPLY_CURRENT_TEXT(By.cssSelector(".comment-text")),

    REPLY_EDIT_BUTTON(By.cssSelector(".cta-btn.edit")),
    REPLY_EDIT_TEXTAREA(By.cssSelector(".edit-text-input")),
    REPLY_REPLY_BUTTON(By.cssSelector(".cta-btn.reply")),
    REPLY_DELETE_BUTTON(By.cssSelector(".cta-btn.delete"));

    private final By path;

    ReplyLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return null;
    }
}

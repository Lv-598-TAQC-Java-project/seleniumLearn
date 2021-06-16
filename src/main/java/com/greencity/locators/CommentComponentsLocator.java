package com.greencity.locators;

import org.openqa.selenium.By;

public enum CommentComponentsLocator implements BaseLocator {


    ADD_COMMENT(By.cssSelector(".input-submit textarea")),
    COMMENT_BUTTON(By.cssSelector(".input-submit button")),
    ALL_BUTTON(By.cssSelector(".cta-btn"));


    private final By path;

    CommentComponentsLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

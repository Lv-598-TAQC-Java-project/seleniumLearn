package com.greencity.locators;

import org.openqa.selenium.By;

public enum CommentItemComponentLocator implements BaseLocator{

    OWNER_OF_COMMENT(By.cssSelector(".author-name")),
    DATE_CREATION(By.cssSelector(".comment-date-month")),
    DELETE_BUTTON(By.xpath(".//button[@class='cta-btn delete']")),

    ;

private By path;

    CommentItemComponentLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return null;
    }
}

package com.greencity.locators;

import org.openqa.selenium.By;

public enum CurrentEcoNewsLocator implements BaseLocator {
    BACK_TO_NEWS(By.cssSelector(".button-text")),
    TAGS_LIST(By.cssSelector("app-tag-filter>div.wrapper>ul>a")),
    NEWS_TITLE(By.cssSelector(".news-title-container")),
    CREATION_DATE(By.cssSelector(".news-info-date")),
    OWNER_OF_NEWS(By.cssSelector(".news-info-author")),
    NEWS_IMAGE(By.cssSelector(".news-image-img")),
    DESCRIPTION_NEWS(By.cssSelector(".news-text")),
    LINK_SOURCE(By.cssSelector("div.source-field.ng-star-inserted > a"));







    private final By path;

    CurrentEcoNewsLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

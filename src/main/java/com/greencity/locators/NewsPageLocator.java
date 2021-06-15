package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsPageLocator implements BaseLocator{
    CREATE_NEWS_BUTTON(By.cssSelector(".secondary-global-button span")),
    FILTER_NEWS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(1)")),
    FILTER_ADS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(2)")),
    FILTER_EVENTS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(3)")),
    FILTER_INITIATIVES_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(4)")),
    FILTER_EDUCATION_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(5)")),
    TABLE_VIEW_BTN(By.cssSelector(".fa.fa-th-large")),
    LIST_VIEW_BTN(By.cssSelector(".fa.fa-bars")),
    ITEMS_LABEL(By.cssSelector(".main-wrapper h2")),
    NEWS_ITEM(By.cssSelector(".ng-star-inserted.list-view-li-active")),
    LIST_WRAPPER(By.cssSelector(".list-wrapper"));

    private final By path;

    NewsPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

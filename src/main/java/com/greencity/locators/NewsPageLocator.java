package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsPageLocator implements BaseLocator {
    CREATE_NEWS_BUTTON(By.id("create-button")),
    FILTER_NEWS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(1)")),
    FILTER_ADS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(2)")),
    FILTER_EVENTS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(3)")),
    FILTER_INITIATIVES_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(4)")),
    FILTER_EDUCATION_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(5)")),
    TABLE_VIEW_BTN(By.cssSelector(".fa.fa-th-large")),
    LIST_VIEW_BTN(By.cssSelector(".fa.fa-bars")),
    CURRENT(By.cssSelector("div.list-wrapper >ul > li:nth-child(1)")),
    DISPLAYED_ARTICLES(By.cssSelector("ul.list>li")),
    DISPLAYED_FILTERS(By.cssSelector(".ul-eco-buttons a")),
    ITEMS_LBL(By.cssSelector(".main-wrapper h2")),
    LOAD_CIRCLE(By.xpath("//app-spinner")),
    ALL_NEWS(By.cssSelector("#main-content > div > div.list-wrapper > ul > li")),
    FILTER_NEWS_BTN_PRESSED(By.cssSelector(".ul-eco-buttons a:nth-child(1) [class='custom-chip global-tag global-tag-clicked']")),
    CURRENT_NEWS(By.cssSelector("#main-content > div > div.list-wrapper > ul > li:nth-child(1)"));

    private final By path;

    NewsPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

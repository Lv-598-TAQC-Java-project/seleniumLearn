package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsPageLocator implements BaseLocator{
    CREATE_NEWS_BUTTON(By.xpath("//span[text()='Create news'")),
    FILTER_NEWS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(1)")),
    FILTER_ADS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(2)")),
    FILTER_EVENTS_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(3)")),
    FILTER_INITIATIVES_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(4)")),
    FILTER_EDUCATION_BTN(By.cssSelector(".ul-eco-buttons a:nth-child(5)")),
    TABLE_VIEW_BTN(By.cssSelector(".fa.fa-th-large")),
    LIST_VIEW_BTN(By.cssSelector(".fa.fa-bars")),
    DISPLAYED_ARTICLES(By.cssSelector("ul.list>li")),
    LOAD_CIRCLE(By.xpath("//app-spinner"));
    private final By path;

    NewsPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

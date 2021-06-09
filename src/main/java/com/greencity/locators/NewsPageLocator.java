package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsPageLocator implements BaseLocator{
    CREATE_NEWS_BUTTON(By.xpath("//span[text()='Create news'"));
    private final By path;

    NewsPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

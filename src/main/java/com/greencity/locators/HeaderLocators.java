package com.greencity.locators;

import org.openqa.selenium.By;

public enum HeaderLocators implements BaseLocator {
    LOGO(By.cssSelector(".header_logo")),
    ECO_NEWS(By.xpath("//header[@role = 'banner']//a[@href = '#/news']")),
    SEARCH(By.xpath("//header[@role = 'banner']//li[contains(@class, 'search')]"));

    private final By path;

    HeaderLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}




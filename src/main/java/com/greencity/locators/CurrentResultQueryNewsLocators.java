package com.greencity.locators;

import org.openqa.selenium.By;

public enum CurrentResultQueryNewsLocators implements BaseLocator {
    NEWS_TITLE(By.xpath(".//div[contains(@class, 'title')]//a"));

    private By path;

    CurrentResultQueryNewsLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

package com.greencity.test;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum CurrentNewsLocators implements BaseLocator {
    NEWS_TITLE(By.xpath(".//div[contains(@class, 'title')]//a"));

    private By path;

    CurrentNewsLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

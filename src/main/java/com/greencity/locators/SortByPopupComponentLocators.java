package com.greencity.locators;

import org.openqa.selenium.By;

public enum SortByPopupComponentLocators implements BaseLocator {
    SORT_MENU(By.xpath("//div[contains(@class, 'sort')]//button")),
//    SORT_NEWEST(By.xpath("//div[contains(@class, 'sort')]//a[position() = 1]")),
//    SORT_OLDEST(By.xpath("//div[contains(@class, 'sort')]//a[position() = 2]"));
    SORT_NEWEST(By.xpath("./following-sibling::div/a[position() = 1]")),
    SORT_OLDEST(By.xpath(".//a[position() = 2]"));

    private By path;

    SortByPopupComponentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}

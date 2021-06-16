package com.greencity.locators;

import org.openqa.selenium.By;

public enum ListResultQueryNewsComponentLocators implements BaseLocator {
    LIST_NEWS(By.xpath("//app-search-all-results//div[@class = 'search_action-wrp']/following-sibling::div/app-search-item"));

    private By path;

    ListResultQueryNewsComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

}

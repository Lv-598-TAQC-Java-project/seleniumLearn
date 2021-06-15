package com.greencity.test;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;

public enum ListNewsComponentLocators implements BaseLocator {
    LIST_NEWS(By.xpath("//app-search-all-results//div[@class = 'search_action-wrp']/following-sibling::div/app-search-item"));

    private By path;

    ListNewsComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

}

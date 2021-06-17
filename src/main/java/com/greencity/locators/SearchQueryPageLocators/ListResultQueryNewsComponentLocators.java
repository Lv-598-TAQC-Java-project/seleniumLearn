package com.greencity.locators.SearchQueryPageLocators;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;

public enum ListResultQueryNewsComponentLocators implements BaseLocator {
    LIST_NEWS(By.xpath("//app-search-all-results//div[@class = 'search_action-wrp']/following-sibling::div/app-search-item")),
    SORT_MENU(By.xpath("//div[contains(@class, 'sort')]//button")),
    SORT_NEWEST(By.xpath("./following-sibling::div/a[position() = 1]")),
    SORT_OLDEST(By.xpath("./following-sibling::div/a[position() = 2]"));
    private By path;

    ListResultQueryNewsComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

}

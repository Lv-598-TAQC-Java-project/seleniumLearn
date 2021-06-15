package com.greencity.locators;

import org.openqa.selenium.By;

public enum SearchQueryPageLocators implements BaseLocator {
    BLOCK_RESULT_COMPONENTS(By.xpath("//app-search-all-results//div[@class = 'search_action-wrp']/following-sibling::div/app-search-item"));

    private By path;

    SearchQueryPageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}

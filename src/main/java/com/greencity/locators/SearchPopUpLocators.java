package com.greencity.locators;

import org.openqa.selenium.By;

public enum SearchPopUpLocators implements BaseLocator {
    SEARCH_FIELD(By.xpath("//app-search-popup//input")),
    BLOCK_NEWS(By.xpath("//app-search-popup//a[@class = 'all-results-link']/preceding-sibling::div")),
    ALL_NEWS(By.xpath("//app-search-popup//a[@class = 'all-results-link']"));

    private By path;

    SearchPopUpLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }

}

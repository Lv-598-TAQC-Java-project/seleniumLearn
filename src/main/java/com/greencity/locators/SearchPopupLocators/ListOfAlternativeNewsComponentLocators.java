package com.greencity.locators.SearchPopupLocators;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;

public enum ListOfAlternativeNewsComponentLocators implements BaseLocator {
    SEARCH_NOT_FOUND_TEXT(By.xpath("//p[@class = 'search_not-found-text']")),
    SEARCH_ALTERNATIVE_TEXT(By.xpath("//app-search-not-found//p[contains(@class, 'choose-alternative')]")),
    BLOCK_ALTERNATIVE_NEWS(By.xpath("//app-search-not-found//div[contains(@class, 'not-found-item-wrp')]/a"));

    private By path;

    ListOfAlternativeNewsComponentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }

}

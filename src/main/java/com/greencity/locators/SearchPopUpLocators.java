package com.greencity.locators;

import org.openqa.selenium.By;

public enum SearchPopUpLocators {
    SEARCH_FIELD(By.xpath("//app-search-popup//input"));

    private By path;

    SearchPopUpLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }

}

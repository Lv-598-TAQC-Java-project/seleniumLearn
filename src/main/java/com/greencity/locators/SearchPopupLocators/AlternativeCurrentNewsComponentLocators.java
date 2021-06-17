package com.greencity.locators.SearchPopupLocators;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.By;

public enum AlternativeCurrentNewsComponentLocators implements BaseLocator {
    IMAGE(By.xpath(".//img")),
    TITLE(By.xpath(".//*[contains(@class, 'header')]")),
    DESCRIPTION(By.xpath(".//p"));
    private By path;

    AlternativeCurrentNewsComponentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}

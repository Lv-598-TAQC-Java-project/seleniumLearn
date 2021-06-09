package com.greencity.locators;

import org.openqa.selenium.By;

public enum HeaderLocators implements BaseLocator {
    LOGO(By.cssSelector(".header_logo")),
    ECO_NEWS(By.xpath("//header//li[ a [ text() = \" Eco news \" ] ]"));


    private final By path;

    HeaderLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}




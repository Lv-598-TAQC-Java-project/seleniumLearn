package com.greencity.locators;

import org.openqa.selenium.By;

public enum HeaderLocators implements BaseLocator {
    LOGO(By.cssSelector(".header_logo")),
    ECO_NEWS(By.xpath("//header//li[ a [ text() = \" Eco news \" ] ]")),
    SIGN_UP(By.cssSelector(".header_sign-up-link.ng-star-inserted")),
    SIGN_IN(By.cssSelector(".header_sign-in-link"));


    private final By path;

    HeaderLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}




package com.greencity.locators;

import org.openqa.selenium.By;

public enum SignInLocators implements BaseLocator {
    EMAIL(By.id("email")),
    PASSWORD(By.id("password")),
    SIGN_IN_BTN(By.cssSelector(".primary-global-button[type=\"submit\"]")),
    CLOSE_BTN(By.cssSelector(".cross-btn"));

    private final By path;

    SignInLocators(By path) {
        this.path = path;
    }
    @Override
    public By getPath() {
        return path;
    }
}

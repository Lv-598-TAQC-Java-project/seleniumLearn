package com.greencity.locators;
import org.openqa.selenium.By;

public enum RegistrationsLocator implements BaseLocator {

    FIRST_NAME(),
    LAST_NAME(),
    EMAIL(),
    private final By path;

    RegistrationsLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

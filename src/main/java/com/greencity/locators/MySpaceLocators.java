package com.greencity.locators;

import org.openqa.selenium.By;

public enum MySpaceLocators implements BaseLocator {

    PROFILE_NAME(By.cssSelector(".name")),
    ADD_NEW_HABIT_BTN(By.cssSelector("#create-button"));

    private By path;

    MySpaceLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return null;
    }
}

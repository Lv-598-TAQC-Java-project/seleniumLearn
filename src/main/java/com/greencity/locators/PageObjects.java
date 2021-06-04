package com.greencity.locators;

import org.openqa.selenium.By;

public enum PageObjects {
    FIRST_NAME(By.id("input-firstname")),
    LAST_NAME(By.id("input-lastname")),
    EMAIL(By.id("input-email")),
    TELEPHONE(By.id("input-telephone")),
    PASSWORD_FOR_REGISTRATION(By.id("input-password")),
    PASSWORD_FOR_CONFIRMATION(By.id("input-confirm")),
    CHECKBOX(By.xpath("//input[@type='checkbox']")),
    SUBMIT(By.xpath("//input[@type='submit']"));

    private By path;

    PageObjects(By path) {
        this.path=path;
    }
}

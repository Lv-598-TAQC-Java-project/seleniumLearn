package com.greencity.locators;

import org.openqa.selenium.By;

public enum RegistrationFormLocator implements BaseLocator {
    USER_NAME(By.xpath("//input[@id='firstName']")),
    EMAIL(By.xpath("//input[@id='email']")),
    PASSWORD_FOR_REGISTRATION(By.xpath("//input[@id='password']")),
    PASSWORD_FOR_CONFIRMATION(By.xpath("//input[@id='repeatPassword']")),
    SIGN_UP(By.xpath("//button[@type='submit']")),
    USER_REGISTERED(By.xpath("//simple-snack-bar[@class = 'mat-simple-snackbar ng-star-inserted']")),
    EMAIL_ERROR(By.xpath("//div[@class='error-message error-message-show ng-star-inserted']")),
    PASSWORD_ERROR(By.xpath("//div[@id='password-err-msg']"));



    private final By path;

    RegistrationFormLocator(By path) {
        this.path=path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

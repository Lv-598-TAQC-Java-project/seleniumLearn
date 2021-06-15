package com.greencity.locators;

import org.openqa.selenium.By;

public enum DeletePopUpCommentLocator implements BaseLocator{
    WARNING_MESSAGE(By.xpath(".//div[@class='warning-title ng-star-inserted']")),
    CANCEL_BUTTON(By.xpath(".//button[@class='secondary-global-button']")),
    YES_DELETE_BUTTON(By.xpath(".//div[@class='buttons-container']//button[@class='primary-global-button']")),
    CLOSE_BUTTON(By.cssSelector("div.main-container .close"))

    ;

    private By path;

    DeletePopUpCommentLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

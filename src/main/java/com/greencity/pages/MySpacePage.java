package com.greencity.pages;

import com.greencity.elements.Label;
import com.greencity.elements.Link;
import com.greencity.locators.MySpaceLocators;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MySpacePage extends BaseCommon {
    private Label profileName;
    private Link addNewHabitButton;

    public MySpacePage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        addNewHabitButton = new Link(MySpaceLocators.ADD_NEW_HABIT_BTN,this.webDriver);
    }

    public String getProfileNameText() {
        profileName = new Label(MySpaceLocators.PROFILE_NAME, this.webDriver);
        WaitWrapper.setExplicitlyWait(webDriver,2L, ExpectedConditions.visibilityOf(profileName.webElement));
        return profileName.getText();
    }

}

package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.MySpaceLocators;
import org.openqa.selenium.WebDriver;


public class MySpacePage extends BaseCommon {
    private Link profileName;
    private Link addNewHabitButton;

    public MySpacePage(WebDriver webDriver) {

        super(webDriver);
        initElements();
    }

    private void initElements() {

      profileName = new Link(MySpaceLocators.PROFILE_NAME, this.webDriver);
        //addNewHabitButton = new Link(MySpaceLocators.ADD_NEW_HABIT_BTN,this.webDriver);
    }

    public String getProfileNameText(){
        profileName = new Link(MySpaceLocators.PROFILE_NAME, this.webDriver);
        return profileName.getText();
    }

}

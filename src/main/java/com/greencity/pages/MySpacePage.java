package com.greencity.pages;

import com.greencity.elements.Label;
import com.greencity.elements.Link;
import com.greencity.locators.MySpaceLocators;
import org.openqa.selenium.WebDriver;


public class MySpacePage extends BaseCommon {
    private Label profileName;
    private Link addNewHabitButton;

    public MySpacePage(WebDriver webDriver) {

        super(webDriver);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initElements();
    }

    private void initElements() {
       // profileName = new Link(MySpaceLocators.PROFILE_NAME, this.webDriver);
        //addNewHabitButton = new Link(MySpaceLocators.ADD_NEW_HABIT_BTN,this.webDriver);
    }

    public String getProfileNameText() throws InterruptedException {
        Thread.sleep(5000);
        profileName = new Label(MySpaceLocators.PROFILE_NAME, this.webDriver);
       return profileName.getText();
    }

}

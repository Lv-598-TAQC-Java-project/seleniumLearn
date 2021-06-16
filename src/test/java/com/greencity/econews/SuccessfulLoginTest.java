package com.greencity.econews;

import com.greencity.elements.Label;
import com.greencity.locators.MySpaceLocators;
import com.greencity.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends TestRunner {

    @Test
    public void successfulLoginTest() {
        WelcomePage welcomePage = new WelcomePage(webDriver);
        String expected = "hahaha";
        String actual = welcomePage.getHeader()
                .goToSignInPage()
                .signIn().getProfileNameText();
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(new Label(MySpaceLocators.ADD_NEW_HABIT_BTN, webDriver).isDisplayed());
    }
}

package com.greencity.econews;

import com.greencity.pages.WelcomePage;
import org.testng.annotations.Test;

import java.awt.*;

public class SmokeTest extends TestRunner {
    @Test
    public void smokeTest() throws InterruptedException, AWTException {
        WelcomePage welcomePage = loadApplication();
        welcomePage.getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter()
                .clickOnListWiewBtn()
                .clickOnAdsFilter().clickOnCreateNewsBtn()               ;


    }


}

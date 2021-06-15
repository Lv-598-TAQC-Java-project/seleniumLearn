package com.greencity.econews;

import com.greencity.pages.WelcomePage;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends TestRunner {

    @Test
    public void successfulLoginTest() throws InterruptedException {
        WelcomePage welcomePage = loadApplication();
        welcomePage.getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage();
    }

}

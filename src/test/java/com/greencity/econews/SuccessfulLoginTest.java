package com.greencity.econews;

import com.greencity.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends TestRunner {

    @Test
    public void successfulLoginTest() throws InterruptedException {
        WelcomePage welcomePage = loadApplication();
        //String s =
                welcomePage
                .getHeader()
                .goToSignInPage()
                .signIn();
                //.getProfileNameText(); не працює
     //   System.out.println(s);
    }


}

package com.greencity.econews;

import com.greencity.pages.WelcomePage;
import org.testng.annotations.Test;

public class SmokeTest extends TestRunner {
    @Test
    public void smokeTest() throws InterruptedException {
        WelcomePage welcomePage = loadApplication();
       int a = welcomePage.getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter()
                .clickOnListWiewBtn()
                .clickOnAdsFilter()
                .goToNewsItemContainer()
                .getItemsSize();
                System.out.println(a);
//                .clickOnCreateNewsBtn();


    }


}

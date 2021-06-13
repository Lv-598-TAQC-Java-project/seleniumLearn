package com.greencity.econews;

import com.greencity.pages.WelcomePage;
import org.testng.annotations.Test;

public class SmokeTest extends TestRunner {
    @Test
    public void smokeTest() {
        WelcomePage page = loadApplication();
        page.getHeader()
                .goToEcoNewsPage();
    }


}

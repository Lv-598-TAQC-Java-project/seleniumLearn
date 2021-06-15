package com.greencity.econews;

import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.Header;
import com.greencity.pages.WelcomePage;
import org.testng.annotations.Test;

@Test
public class ClickTest extends TestRunner{
    WelcomePage welcomePage = new WelcomePage(getDriver());
    Header header = welcomePage.getHeader();
    EcoNewsPage ecoNewsPage = header.goToEcoNewsPage();

}

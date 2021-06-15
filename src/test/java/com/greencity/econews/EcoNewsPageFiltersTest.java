package com.greencity.econews;

import com.greencity.pages.NewsItemComponent;
import com.greencity.pages.WelcomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class EcoNewsPageFiltersTest extends TestRunner{

    @Test
    public void filtersTest() throws AWTException {
        WelcomePage welcomePage = loadApplication();
       welcomePage
                .getHeader()
                .goToEcoNewsPage();


//                .clickOnAdsFilter()
//                .clickOnNewsFilter()
//                .clickOnEducationFilter()
//                .clickOnEventsFilter()
//                .clickInitiativesFilter()
//                .pressEndBtn().getItemsLabelText();


    }

}

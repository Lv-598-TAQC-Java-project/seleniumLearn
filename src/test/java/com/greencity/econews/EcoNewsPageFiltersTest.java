package com.greencity.econews;

import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.NewsItemsContainer;
import com.greencity.pages.WelcomePage;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;

public class EcoNewsPageFiltersTest extends TestRunner {
    NewsItemsContainer newsItemsContainer;
    EcoNewsPage ecoNewsPage;

    @Test(priority = 1)
    public void newsFilterTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        newsItemsContainer = new WelcomePage(webDriver)
                .getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter()
                .goToNewsItemContainer()
                .pressEndBtn();
        String[] s = newsItemsContainer
                .getItemsLblText()
                .split(" ");
        System.out.println(Arrays.toString(s));
        int expected = Integer.parseInt(s[0]);
        int actual = newsItemsContainer
                .getItemComponentsCount();

        softAssert.assertEquals(actual, expected);
        ecoNewsPage = newsItemsContainer.goToEcoNewsPage();
        ecoNewsPage.uncheckFilters();
//        ecoNewsPage.refresh();
//        ecoNewsPage.clickOnNewsFilterPressed();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    @Description("Verifies that number of news and description are the same")
    public void newTest() {
        String[] s = ecoNewsPage
                .getItemsLblText()
                .split(" ");
        int expected = Integer.parseInt(s[0]);
        int actual = ecoNewsPage
                .goToNewsItemContainer()
                .pressEndBtn()
                .getItemsSize();
        Assert.assertEquals(actual, expected);
    }
}

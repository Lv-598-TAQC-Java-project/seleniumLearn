package com.greencity.econews;

import com.greencity.locators.SortByPopupComponentLocators;
import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.SearchPopup;
import com.greencity.pages.SearchQueryPage;
import com.greencity.pages.WelcomePage;
import com.greencity.utils.ScrollWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTypeTest extends TestRunner {

    @Test
    public void sortByNewestTest() throws InterruptedException {
        SearchPopup searchPopup = loadApplication()
                .getHeader()
                .goToSearchPopup();
        searchPopup.searchComponents("Title");
        SearchQueryPage searchResult  = searchPopup.clickOnAllSearchResultsButton();
        searchResult.sortNews(SortByPopupComponentLocators.SORT_NEWEST);
    }

    @Test
    public void testingTest() {
        EcoNewsPage ecoNewsPage = loadApplication().getHeader().goToEcoNewsPage();
        ecoNewsPage.scroll();
    }

    @Test
    public void testingSecondTest() {
        String actualResult = "Test";
        SearchPopup searchPopup = loadApplication()
                .getHeader()
                .goToSearchPopup();
        searchPopup.searchComponents("Test");
        SearchQueryPage searchResult = searchPopup.clickOnAllSearchResultsButton();
        searchResult = searchResult.sortNews(SortByPopupComponentLocators.SORT_NEWEST);

        String resultText = searchResult.getTitleOfCurrentNewsByIndex(0);
        Assert.assertTrue(actualResult.contains(resultText));
    }

}

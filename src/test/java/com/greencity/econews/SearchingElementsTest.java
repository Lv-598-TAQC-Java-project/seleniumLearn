package com.greencity.econews;

import com.greencity.locators.SearchQueryPageLocators.ListResultQueryNewsComponentLocators;
import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.SearchPopup.SearchPopup;
import com.greencity.pages.SearchQueryPage.SearchQueryPage;
import com.greencity.pages.WelcomePage;
import com.greencity.utils.RandomTextWrapper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchingElementsTest extends TestRunner {

    WelcomePage welcomePage;

    @BeforeMethod
    public void loadInitialPage() {
        welcomePage = new WelcomePage(webDriver);
    }

    @Test
    public void sortByNewestTest() throws InterruptedException {
        SearchPopup searchPopup = welcomePage
                .getHeader()
                .goToSearchPopup();
        searchPopup.searchComponents("Title");
        SearchQueryPage searchResult = searchPopup.clickOnAllSearchResultsButton();
        searchResult.sortNews(ListResultQueryNewsComponentLocators.SORT_NEWEST);
    }

    @Test
    public void testingTest() {
        EcoNewsPage ecoNewsPage = new WelcomePage(webDriver).getHeader().goToEcoNewsPage();
        ecoNewsPage.scroll();
    }

    @Test
    public void ValidSearchingItemsTest() {
        String expectedResult = "Test";
        SearchPopup searchPopup = welcomePage
                .getHeader()
                .goToSearchPopup();
        searchPopup.searchComponents("Test");
        SearchQueryPage searchResult = searchPopup.clickOnAllSearchResultsButton();
        searchResult = searchResult.sortNews(ListResultQueryNewsComponentLocators.SORT_NEWEST);

        String resultText = searchResult.getTitleOfCurrentNewsByIndex(0);
        Assert.assertTrue(expectedResult.contains(resultText));
    }

    @Test
    public void searchForAbsentNewsTest() {
        String searchQuery = RandomTextWrapper.getRandomAlphabeticText(5);
        String expectedText = "We couldn't find results for '" + searchQuery + "' Please change the search.";
        SearchPopup searchPopup = welcomePage
                .getHeader()
                .goToSearchPopup();
        searchPopup.searchComponents(searchQuery);
        searchPopup.initElementsForNegativeSearch();
        String searchNotFoundText = searchPopup.getSearchNotFoundText().trim();
        Assert.assertEquals(searchNotFoundText, expectedText, "Text is not the same!");
    }

    @Test
    public void PresenceOfAlternativeNewsTest() {
        String searchQuery = RandomTextWrapper.getRandomAlphabeticText(5);
        SearchPopup searchPopup = welcomePage
                .getHeader()
                .goToSearchPopup();
                searchPopup.searchComponents(searchQuery);
                searchPopup.initElementsForNegativeSearch();
        int actualNewsQuantity = searchPopup.getAlternativeNewsQuantity();
        Assert.assertTrue(actualNewsQuantity != 0, "The block with alternative news is empty!");
    }
}

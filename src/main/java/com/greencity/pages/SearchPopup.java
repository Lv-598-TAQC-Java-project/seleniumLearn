package com.greencity.pages;

import com.greencity.elements.InputElement;
import com.greencity.elements.Link;
import com.greencity.locators.SearchPopUpLocators;
import org.openqa.selenium.WebDriver;

public class SearchPopup extends BasePopUp {
    InputElement searchInput;
    Link allQueryResults;

    public SearchPopup(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        searchInput = new InputElement(SearchPopUpLocators.SEARCH_FIELD, webDriver);
    }

    public void searchComponents(String query) {
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(query);
    }

    public SearchQueryPage clickOnAllSearchResultsButton() {
        allQueryResults = new Link(SearchPopUpLocators.ALL_NEWS, webDriver); //???
        allQueryResults.click();
        return new SearchQueryPage(webDriver);
    }
}

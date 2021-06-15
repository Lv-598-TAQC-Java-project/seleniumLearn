package com.greencity.pages;

import com.greencity.elements.InputElement;
import com.greencity.elements.LabelElement;
import com.greencity.elements.Link;
import com.greencity.locators.SearchPopUpLocators;
import com.greencity.pages.SearchQueryPage.SearchQueryPage;
import org.openqa.selenium.WebDriver;

public class SearchPopup extends BasePopUp {
    InputElement searchInput;
    Link allQueryResults;
    LabelElement nuSuchNewsText;

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

    public void initElementsForNegativeSearch() {
        nuSuchNewsText = new LabelElement(SearchPopUpLocators.SEARCH_NOT_FOUND_TEXT, webDriver);
    }

    public String getSearchNotFoundText() {
        return nuSuchNewsText.getText();
    }
}

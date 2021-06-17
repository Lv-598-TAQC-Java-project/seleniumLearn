package com.greencity.pages.SearchPopup;

import com.greencity.elements.InputElement;
import com.greencity.elements.Link;
import com.greencity.locators.SearchPopupLocators.SearchPopUpLocators;
import com.greencity.pages.BasePopUp;
import com.greencity.pages.SearchQueryPage.SearchQueryPage;
import org.openqa.selenium.WebDriver;

public class SearchPopup extends BasePopUp {
    InputElement searchInput;
    Link allQueryResults;
    ListOfAlternativeNewsComponent listOfAlternativeNewsComponent;


    public SearchPopup(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        searchInput = new InputElement(SearchPopUpLocators.SEARCH_FIELD, webDriver);
    }

    public void initElementsForNegativeSearch() {
        listOfAlternativeNewsComponent = new ListOfAlternativeNewsComponent(webDriver);
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

    public String getSearchNotFoundText() {
        return listOfAlternativeNewsComponent.getSearchNotFoundText();
    }

    public String getAlternativeSearchText() {
        return listOfAlternativeNewsComponent.getSearchAlternativeText();
    }

    public int getAlternativeNewsQuantity() {
        return listOfAlternativeNewsComponent.getAlternativeNewsQuantity();
    }


}

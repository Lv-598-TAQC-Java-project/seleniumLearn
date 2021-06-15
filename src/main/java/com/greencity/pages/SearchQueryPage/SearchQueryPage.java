package com.greencity.pages.SearchQueryPage;

import com.greencity.locators.SortByPopupComponentLocators;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;

public class SearchQueryPage extends BaseCommon {

    //    SearchQuerySortPopupComponent sort;
    ListResultQueryNewsComponent listResultQueryNewsComponent;

    public SearchQueryPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
//        sort = new SearchQuerySortPopupComponent(webDriver);
        listResultQueryNewsComponent = new ListResultQueryNewsComponent(webDriver);
    }

//    public SearchQueryPage sortBy(SortByPopupComponentLocators choice) {
//        sort.clickOnSortMenu();
//        sort.clickBySortType(choice);
//        return new SearchQueryPage(webDriver);
//    }

    public SearchQueryPage sortNews(SortByPopupComponentLocators choice) {
        listResultQueryNewsComponent.sortBy(choice);
        return new SearchQueryPage(webDriver);
    }

    public String getTitleOfCurrentNewsByIndex(int i) {
        return listResultQueryNewsComponent.getTitleByIndex(i);
    }

}

package com.greencity.pages;

import com.greencity.locators.SortByPopupComponentLocators;
import com.greencity.test.ListNewsComponent;
import org.openqa.selenium.WebDriver;

public class SearchQueryPage extends BaseCommon {

    //    SearchQuerySortPopupComponent sort;
    ListNewsComponent listNewsComponent;

    public SearchQueryPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
//        sort = new SearchQuerySortPopupComponent(webDriver);
        listNewsComponent = new ListNewsComponent(webDriver);
    }

//    public SearchQueryPage sortBy(SortByPopupComponentLocators choice) {
//        sort.clickOnSortMenu();
//        sort.clickBySortType(choice);
//        return new SearchQueryPage(webDriver);
//    }

    public SearchQueryPage sortNews(SortByPopupComponentLocators choice) {
        listNewsComponent.sortBy(choice);
        return new SearchQueryPage(webDriver);
    }

    public String getTitleOfCurrentNewsByIndex(int i) {
        return listNewsComponent.getTitleByIndex(i);
    }

}

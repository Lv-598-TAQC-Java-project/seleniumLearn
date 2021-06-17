package com.greencity.pages.SearchQueryPage;

import com.greencity.locators.SearchQueryPageLocators.ListResultQueryNewsComponentLocators;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;

public class SearchQueryPage extends BaseCommon {

    ListResultQueryNewsComponent listResultQueryNewsComponent;

    public SearchQueryPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        listResultQueryNewsComponent = new ListResultQueryNewsComponent(webDriver);
    }

    public SearchQueryPage sortNews(ListResultQueryNewsComponentLocators choice) {
        listResultQueryNewsComponent.sortBy(choice);
        return new SearchQueryPage(webDriver);
    }

    public String getTitleOfCurrentNewsByIndex(int i) {
        return listResultQueryNewsComponent.getTitleByIndex(i);
    }

}

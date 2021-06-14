package com.greencity.test;

import com.greencity.locators.SortByPopupComponentLocators;
import com.greencity.pages.BaseCommon;
import com.greencity.pages.SearchQueryPage;
import com.greencity.pages.SearchQuerySortPopupComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListNewsComponent extends BaseCommon {

    SearchQuerySortPopupComponent sort;
    List<WebElement> rootOfNews;
    List<CurrentNewsComponent> news = new ArrayList<>();
    public ListNewsComponent(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        sort = new SearchQuerySortPopupComponent(webDriver);
        rootOfNews = webDriver.findElements(ListNewsComponentLocators.LIST_NEWS.getPath());
        for (WebElement currentNewsRoot : rootOfNews) {
            news.add(new CurrentNewsComponent(webDriver, currentNewsRoot)); //????
        }
    }

    public SearchQueryPage sortBy(SortByPopupComponentLocators choice) {
        sort.clickOnSortMenu();
        sort.clickBySortType(choice);
        return new SearchQueryPage(webDriver);
    }

    public String getTitleByIndex(int i) {
        return news.get(i).getTitleText();
    }
}

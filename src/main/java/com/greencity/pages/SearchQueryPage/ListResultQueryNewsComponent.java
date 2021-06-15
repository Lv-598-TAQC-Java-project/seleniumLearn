package com.greencity.pages.SearchQueryPage;

import com.greencity.elements.DropdownElement;
import com.greencity.locators.ListResultQueryNewsComponentLocators;
import com.greencity.locators.SortByPopupComponentLocators;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListResultQueryNewsComponent extends BaseCommon {

//    SearchQuerySortPopupComponent sort;
    DropdownElement sort;
    List<WebElement> rootOfNews;
    List<CurrentResultQueryNewsComponent> news = new ArrayList<>();
    public ListResultQueryNewsComponent(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
//        sort = new SearchQuerySortPopupComponent(webDriver);
        sort = new DropdownElement(SortByPopupComponentLocators.SORT_MENU, webDriver);
        rootOfNews = webDriver.findElements(ListResultQueryNewsComponentLocators.LIST_NEWS.getPath());
        for (WebElement currentNewsRoot : rootOfNews) {
            news.add(new CurrentResultQueryNewsComponent(webDriver, currentNewsRoot)); //WebElement currentNewsRoot????
        }
    }

//    public SearchQueryPage sortBy(SortByPopupComponentLocators choice) {
//        sort.clickOnSortMenu();
//        sort.clickBySortType(choice);
//        return new SearchQueryPage(webDriver);
//    }

    public SearchQueryPage sortBy(SortByPopupComponentLocators choice) {
        sort.click();
        sort.clickOnMenuElement(choice.getPath());
        return new SearchQueryPage(webDriver);
    }

    public String getTitleByIndex(int i) {
        return news.get(i).getTitleText();
    }
}

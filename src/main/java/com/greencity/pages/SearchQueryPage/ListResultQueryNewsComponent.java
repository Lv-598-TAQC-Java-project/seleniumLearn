package com.greencity.pages.SearchQueryPage;

import com.greencity.elements.DropdownElement;
import com.greencity.locators.SearchPopupLocators.ListOfAlternativeNewsComponentLocators;
import com.greencity.locators.SearchQueryPageLocators.ListResultQueryNewsComponentLocators;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListResultQueryNewsComponent extends BaseCommon {

    DropdownElement sort;
    List<CurrentResultQueryNewsComponent> news = new ArrayList<>();
    public ListResultQueryNewsComponent(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        List<WebElement> rootOfNews = webDriver.findElements(ListResultQueryNewsComponentLocators.LIST_NEWS.getPath());;
        sort = new DropdownElement(ListResultQueryNewsComponentLocators.SORT_MENU, webDriver);
        for (WebElement currentNewsRoot : rootOfNews) {
            news.add(new CurrentResultQueryNewsComponent(webDriver, currentNewsRoot)); //WebElement currentNewsRoot????
        }
    }

    public SearchQueryPage sortBy(ListResultQueryNewsComponentLocators choice) {
        sort.click();
        sort.clickOnMenuElement(choice);
        return new SearchQueryPage(webDriver);
    }

    public String getTitleByIndex(int i) {
        return news.get(i).getTitleText();
    }
}

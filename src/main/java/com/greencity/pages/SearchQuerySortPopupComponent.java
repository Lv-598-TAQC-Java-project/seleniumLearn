package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.Link;
import com.greencity.locators.SortByPopupComponentLocators;
import org.openqa.selenium.WebDriver;

public class SearchQuerySortPopupComponent extends BasePopUp {

    private Link byNewest;
    private Link byOldest;
    private ButtonElement dropdownMenu;

    public SearchQuerySortPopupComponent(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements() {
        dropdownMenu = new ButtonElement(SortByPopupComponentLocators.SORT_MENU, webDriver);
        byNewest = new Link(SortByPopupComponentLocators.SORT_NEWEST, webDriver);
        byOldest = new Link(SortByPopupComponentLocators.SORT_OLDEST, webDriver);
    }

    public void clickOnSortMenu() {
        dropdownMenu.clickOnButton();
    }

    public void clickBySortType(SortByPopupComponentLocators locator) {
        switch (locator) {
            case SORT_NEWEST:
                byNewest.click();
                break;
            case SORT_OLDEST:
                byOldest.click();
                break;
        }
    }

}

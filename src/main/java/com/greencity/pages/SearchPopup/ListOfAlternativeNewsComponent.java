package com.greencity.pages.SearchPopup;

import com.greencity.elements.LabelElement;
import com.greencity.locators.SearchPopupLocators.ListOfAlternativeNewsComponentLocators;
import com.greencity.locators.SearchPopupLocators.SearchPopUpLocators;
import com.greencity.pages.BaseCommon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListOfAlternativeNewsComponent extends BaseCommon {
    private LabelElement noSuchNewsText;
    private LabelElement viewAlternativesText;
    private List<AlternativeCurrentNewsComponent> alternativeNews = new ArrayList<>();

    ListOfAlternativeNewsComponent(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    public void initElements() {
        noSuchNewsText = new LabelElement(ListOfAlternativeNewsComponentLocators.SEARCH_NOT_FOUND_TEXT, webDriver);
        viewAlternativesText = new LabelElement(ListOfAlternativeNewsComponentLocators.SEARCH_ALTERNATIVE_TEXT, webDriver);
        List<WebElement> rootsForAlternativeNewsComponents = webDriver.findElements(ListOfAlternativeNewsComponentLocators
                .BLOCK_ALTERNATIVE_NEWS.getPath());
        for (WebElement root : rootsForAlternativeNewsComponents) {
            alternativeNews.add(new AlternativeCurrentNewsComponent(webDriver, root));
        }
    }

    public String getSearchNotFoundText() {
        return noSuchNewsText.getText();
    }

    public String getSearchAlternativeText() {
        return viewAlternativesText.getText();
    }

    public int getAlternativeNewsQuantity() {
        return alternativeNews.size();
    }
}

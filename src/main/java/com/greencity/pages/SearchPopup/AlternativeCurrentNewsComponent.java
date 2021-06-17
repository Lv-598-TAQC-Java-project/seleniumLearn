package com.greencity.pages.SearchPopup;

import com.greencity.elements.ImageElement;
import com.greencity.elements.LabelElement;
import com.greencity.elements.Link;
import com.greencity.locators.SearchPopupLocators.AlternativeCurrentNewsComponentLocators;
import com.greencity.pages.BaseCommon;
import com.greencity.pages.CurrentEcoNewsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlternativeCurrentNewsComponent extends BaseCommon {

    private WebElement rootItem;
    private Link newsLink;
    private ImageElement imageElement;
    private LabelElement titleNewsItem;
    private LabelElement descriptionNewsItem;

    public AlternativeCurrentNewsComponent(WebDriver webDriver, WebElement rootItem) {
        super(webDriver);
        this.rootItem = rootItem;
        initElements();
    }

    private void initElements() {
        newsLink = new Link(rootItem);
        imageElement = new ImageElement(AlternativeCurrentNewsComponentLocators.IMAGE, rootItem);
        titleNewsItem = new LabelElement(AlternativeCurrentNewsComponentLocators.TITLE, rootItem);
        descriptionNewsItem = new LabelElement(AlternativeCurrentNewsComponentLocators.DESCRIPTION, rootItem);
    }

    public CurrentEcoNewsPage clickOnCurrentNewsComponent() {
        newsLink.click();
        return new CurrentEcoNewsPage(webDriver);
    }

}

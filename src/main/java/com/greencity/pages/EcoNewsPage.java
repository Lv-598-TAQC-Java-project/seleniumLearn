package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcoNewsPage extends BaseCommon {
    ///region WebElements
    private Link createNewsBtn;
    private Link filterNewsBtn;
    private Link filterAdsBtn;
    private Link filterEventsBtn;
    private Link filterInitiativesBtn;
    private Link filterEducationBtn;
    private Link tableviewBtn;
    private Link listViewBtn;
    ///endregion

    public EcoNewsPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    public void initElements() {

        filterNewsBtn = new Link(NewsPageLocator.FILTER_NEWS_BTN, this.webDriver);
        filterAdsBtn = new Link(NewsPageLocator.FILTER_ADS_BTN,this.webDriver);
        filterEventsBtn = new Link(NewsPageLocator.FILTER_EVENTS_BTN,this.webDriver);
        filterInitiativesBtn = new Link(NewsPageLocator.FILTER_INITIATIVES_BTN,this.webDriver);
        filterEducationBtn = new Link(NewsPageLocator.FILTER_EDUCATION_BTN,this.webDriver);
        tableviewBtn = new Link(NewsPageLocator.TABLE_VIEW_BTN, this.webDriver);
        listViewBtn = new Link(NewsPageLocator.LIST_VIEW_BTN,this.webDriver);

    }

    public CreateNewsPage clickOnCreateNewsBtn() {
        createNewsBtn = new Link(NewsPageLocator.CREATE_NEWS_BUTTON, this.webDriver);
        createNewsBtn.click();
        return new CreateNewsPage();
    }
    public EcoNewsPage clickOnNewsFilter(){
        filterNewsBtn.click();
        return new EcoNewsPage(webDriver);
    }
    public void clickOnEventsFilter(){
        filterEventsBtn.click();
    }
    public void clickInitiativesFilter(){
        filterInitiativesBtn.click();
    }
    public void clickOnEducationFilter(){
        filterEducationBtn.click();
    }
    public EcoNewsPage clickOnAdsFilter(){
        filterAdsBtn.click();
        return new EcoNewsPage(webDriver);
    }

//    public EcoNewsPage refresh(){
//        webDriver.navigate().refresh();
//        return new EcoNewsPage(webDriver);
//    }
    public void clickOnTableViewBtn(){
        tableviewBtn.click();
    }
    public EcoNewsPage clickOnListWiewBtn(){
        listViewBtn.click();
        return new EcoNewsPage(webDriver);
    }

    @Override
    public Header getHeader() {
        return super.getHeader();
    }
}

package com.greencity.pages;

import com.greencity.elements.Label;
import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.greencity.utils.ScrollWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
    private Label itemsLbl;

    ///endregion

    public EcoNewsPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    public void initElements() {

        filterNewsBtn = new Link(NewsPageLocator.FILTER_NEWS_BTN, this.webDriver);
        filterAdsBtn = new Link(NewsPageLocator.FILTER_ADS_BTN, this.webDriver);
        filterEventsBtn = new Link(NewsPageLocator.FILTER_EVENTS_BTN, this.webDriver);
        filterInitiativesBtn = new Link(NewsPageLocator.FILTER_INITIATIVES_BTN, this.webDriver);
        filterEducationBtn = new Link(NewsPageLocator.FILTER_EDUCATION_BTN, this.webDriver);
        tableviewBtn = new Link(NewsPageLocator.TABLE_VIEW_BTN, this.webDriver);
        listViewBtn = new Link(NewsPageLocator.LIST_VIEW_BTN,this.webDriver);

    }

    public CreateNewsPage clickOnCreateNewsBtn() {
        createNewsBtn = new Link(NewsPageLocator.CREATE_NEWS_BUTTON, this.webDriver);
        createNewsBtn.click();
        return new CreateNewsPage();
    }

    public EcoNewsPage clickOnNewsFilter() {
        filterNewsBtn.click();
       // WaitWrapper.setExplicitlyWait(webDriver,2L, ExpectedConditions.visibilityOf(itemsLbl.webElement));
        return this;
    }

    public EcoNewsPage clickOnEventsFilter() {
        filterEventsBtn.click();
        return new EcoNewsPage(webDriver);
    }

    public EcoNewsPage clickInitiativesFilter() {
        filterInitiativesBtn.click();
        return new EcoNewsPage(webDriver);
    }

    public EcoNewsPage clickOnEducationFilter() {
        filterEducationBtn.click();
        return new EcoNewsPage(webDriver);
    }

    public EcoNewsPage clickOnAdsFilter() {
        filterAdsBtn.click();
        return new EcoNewsPage(webDriver);
    }


    public void clickOnTableViewBtn() {
        tableviewBtn.click();
    }

    public EcoNewsPage clickOnListWiewBtn() {
        listViewBtn.click();
        return new EcoNewsPage(webDriver);
    }
    public String getItemsLblText(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        itemsLbl = new Label(NewsPageLocator.ITEMS_LBL,this.webDriver);
        return itemsLbl.getText();
    }
    public void scroll() {
       ScrollWrapper.scrollPageToDown(NewsPageLocator.LOAD_CIRCLE.getPath(), webDriver);
    }



   public CurrentEcoNewsPage findNews(){

        Link l=new Link(webDriver.findElement(By.cssSelector("#main-content > div > div.list-wrapper > ul > li:nth-child(1)")));
        l.click();
        return new CurrentEcoNewsPage(webDriver);

  }


    public NewsItemsContainer goToNewsItemContainer(){
        return new NewsItemsContainer(webDriver);
    }
}

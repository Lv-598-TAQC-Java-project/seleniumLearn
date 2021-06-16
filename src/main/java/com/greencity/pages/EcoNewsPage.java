package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.Label;
import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import org.openqa.selenium.By;

import com.greencity.utils.ScrollWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.greencity.locators.NewsPageLocator.ALL_NEWS;


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
    private List<CurrentEcoNewsPage> currentNews;
    private Link linkNotGood;




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
        //initPageOfNews();

        linkNotGood=new Link(NewsPageLocator.CURRENT_NEWS,this.webDriver);


    }


    public void initPageOfNews() {
       currentNews =new ArrayList<CurrentEcoNewsPage>();
        for (WebElement linkElement : webDriver.findElements(ALL_NEWS.getPath())) {
            currentNews.add(new CurrentEcoNewsPage(webDriver));

    }}


    public CreateNewsPage clickOnCreateNewsBtn() {
        createNewsBtn = new Link(NewsPageLocator.CREATE_NEWS_BUTTON, this.webDriver);
        createNewsBtn.click();
        return new CreateNewsPage();
    }

    public EcoNewsPage clickOnNewsFilter() {
        filterNewsBtn.click();
        return new EcoNewsPage(webDriver);
    }

    public void clickOnEventsFilter() {
        filterEventsBtn.click();
    }

    public void clickInitiativesFilter() {
        filterInitiativesBtn.click();
    }

    public void clickOnEducationFilter() {
        filterEducationBtn.click();
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
        itemsLbl = new Label(NewsPageLocator.ITEMS_LBL,this.webDriver);
        return itemsLbl.getText();
    }
    public void scroll() {
       ScrollWrapper.scrollPageToDown(NewsPageLocator.LOAD_CIRCLE.getPath(), webDriver);
    }



///????????????

   public CurrentEcoNewsPage findNews(){



        linkNotGood.click();

        return new CurrentEcoNewsPage(webDriver);

  }


    public NewsItemsContainer goToNewsItemContainer(){
        return new NewsItemsContainer(webDriver);
    }
}

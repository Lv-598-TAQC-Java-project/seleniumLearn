package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.Label;
import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;

import com.greencity.utils.ScrollWrapper;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.greencity.locators.NewsPageLocator.ALL_NEWS;
import static com.greencity.locators.NewsPageLocator.DISPLAYED_FILTERS;


public class EcoNewsPage extends BaseCommon {
    ///region WebElements
    private Link createNewsBtn;
    private List<FilterTagsComponent> filterTagsList;
    private By filters = DISPLAYED_FILTERS.getPath();
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
    private ButtonElement filterNewsBtnPressed;




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
       // WaitWrapper.setExplicitlyWait(webDriver,2L, ExpectedConditions.visibilityOf(itemsLbl.webElement));
        return this;
    }
    public EcoNewsPage clickOnNewsFilterPressed() {
        filterNewsBtnPressed = new ButtonElement(NewsPageLocator.FILTER_NEWS_BTN_PRESSED,webDriver);
        filterNewsBtnPressed.clickOnButton();
        // WaitWrapper.setExplicitlyWait(webDriver,2L, ExpectedConditions.visibilityOf(itemsLbl.webElement));
        return this;
    }
    public EcoNewsPage clickOnEventsFilter() {
        filterEventsBtn.click();
        return this;
    }

    public EcoNewsPage clickInitiativesFilter() {
        filterInitiativesBtn.click();
        return this;
    }

    public EcoNewsPage clickOnEducationFilter() {
        filterEducationBtn.click();
        return this;
    }

    public EcoNewsPage clickOnAdsFilter() {
        filterAdsBtn.click();
        return this;
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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        itemsLbl = new Label(NewsPageLocator.ITEMS_LBL,this.webDriver);
        return itemsLbl.getText();
    }
    public void scroll() {
       ScrollWrapper.scrollPageToDown(NewsPageLocator.LOAD_CIRCLE.getPath(), webDriver);
    }

    private List<FilterTagsComponent> getFilterTagsList(){
        filterTagsList = new ArrayList<>();
        for (WebElement current : getFilterItems()) {
            filterTagsList.add(new FilterTagsComponent(webDriver,current) );
        }
        return filterTagsList;
    }
    private List<WebElement> getFilterItems(){
        return new WaitWrapper(webDriver).setExplicitlyWait(webDriver,1,
                ExpectedConditions.presenceOfAllElementsLocatedBy(filters));
    }
    public EcoNewsPage uncheckFilters(){
        Iterator<WebElement> iterator = getFilterItems().iterator();
        while(iterator.hasNext()){
            WebElement next = iterator.next();
            if (next.isSelected()){
                next.click();
            }
        }
        return this;
    }

   public CurrentEcoNewsPage findNews(){



        linkNotGood.click();

        return new CurrentEcoNewsPage(webDriver);

  }

    public WelcomePage goToWelcomePage(){
        return new WelcomePage(webDriver);
    }
    public NewsItemsContainer goToNewsItemContainer(){
        return new NewsItemsContainer(webDriver);
    }
}

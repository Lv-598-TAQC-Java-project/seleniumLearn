package com.greencity.pages;

import com.greencity.elements.Label;
import com.greencity.locators.NewsPageLocator;
import com.greencity.utils.ScrollWrapper;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import static com.greencity.locators.NewsPageLocator.DISPLAYED_ARTICLES;


public class NewsItemsContainer {
    private WebDriver webDriver;
    private By items = DISPLAYED_ARTICLES.getPath();
    private List<NewsItemComponent> itemComponents;
    public NewsItemsContainer(WebDriver driver) {
        this.webDriver = driver;
    }
    private Label itemsLbl;
    private List<NewsItemComponent> getItemComponents() {
        itemComponents = new ArrayList<>();
        for (WebElement current : getItems()) {
            itemComponents.add(new NewsItemComponent(webDriver, current));
        }
        return itemComponents;
    }
    private List<WebElement> getItems() {
        WaitWrapper waitWrapper = new WaitWrapper(webDriver);

        return waitWrapper.setExplicitlyWait(webDriver,3,
                ExpectedConditions.presenceOfAllElementsLocatedBy(items));
    }
    public int getItemsSize() {
        return getItems().size();
    }
    public int getItemComponentsCount() {
        return getItemComponents().size();
    }
    public void scroll() {
        ScrollWrapper.scrollPageToDown(NewsPageLocator.LOAD_CIRCLE.getPath(), this.webDriver);
    }

    public NewsItemsContainer pressEndBtn()  {

        WebElement webElement = webDriver.findElement(NewsPageLocator.LOAD_CIRCLE.getPath());
        try {
        while(webElement!=null) {
            Actions actions = new Actions(webDriver);
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
            webElement = webDriver.findElement(NewsPageLocator.LOAD_CIRCLE.getPath());
        }
        } catch (NoSuchElementException e) {
            System.err.println("Все гаразд, так має бути.");
        }
        return this;

    }

    public String getItemsLblText(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        itemsLbl = new Label(NewsPageLocator.ITEMS_LBL,this.webDriver);
        return itemsLbl.getText();
    }
    public EcoNewsPage goToEcoNewsPage(){
        return new EcoNewsPage(webDriver);
    }
}

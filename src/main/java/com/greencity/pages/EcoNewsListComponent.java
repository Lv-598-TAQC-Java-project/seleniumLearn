package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EcoNewsListComponent extends BaseCommon {
    private List<NewsItemComponent> newsItemComponent;
    public EcoNewsListComponent(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }
    private Link listWrapper;
    private Link newsItem;
    public void initElements(){
        newsItem = new Link(NewsPageLocator.ITEMS_LABEL,this.webDriver);
        listWrapper = new Link(NewsPageLocator.LIST_WRAPPER,this.webDriver);
    }
    public void findElements(){
        List<WebElement> list = newsItem.webElement
                .findElements(NewsPageLocator.NEWS_ITEM.getPath());
        Iterator<WebElement> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}

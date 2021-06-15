package com.greencity.pages;

import com.greencity.locators.NewsPageLocator;
import com.greencity.utils.ScrollWrapper;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getUrl(){
        return webDriver.getCurrentUrl();
    }

    public BasePage goToUrl(String url){
        webDriver.get(url);
       return this;
    }

    public void refresh(){ webDriver.navigate().refresh(); }

}

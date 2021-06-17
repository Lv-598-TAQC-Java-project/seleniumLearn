package com.greencity.pages;

import com.greencity.locators.NewsPageLocator;
import com.greencity.utils.ScrollWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver webDriver;
     WebDriverWait wait;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 20);
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

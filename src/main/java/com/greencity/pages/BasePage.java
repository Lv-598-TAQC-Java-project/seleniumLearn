package com.greencity.pages;

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
    public void refresh(){
        webDriver.navigate().refresh();
    }
}

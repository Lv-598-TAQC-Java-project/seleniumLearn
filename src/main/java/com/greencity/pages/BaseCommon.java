package com.greencity.pages;

import org.openqa.selenium.WebDriver;

public class BaseCommon extends BasePage{

    private Header header;

    public BaseCommon(WebDriver webDriver) {
        super(webDriver);
        this.header=new Header(this.webDriver);
    }

    public Header getHeader(){
        return header;
    }

}

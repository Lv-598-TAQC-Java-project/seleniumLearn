package com.greencity.pages;

import org.openqa.selenium.WebDriver;

public class BasePopUp extends BasePage{

    public BasePopUp(WebDriver webDriver) {
        super(webDriver);
    }
    private Header header;
    public Header getHeader() {
        if (header == null) {
            header = new Header(this.webDriver);
        }
        return header;
    }
}

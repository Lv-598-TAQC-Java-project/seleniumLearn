package com.greencity.locators;

import org.openqa.selenium.By;

public enum CreateNewsLocator implements BaseLocator {
    TITLE_FIELD(By.cssSelector("textarea[formcontrolname='title']")),
    TAG_LIST(By.cssSelector("app-tag-filter>div.wrapper>ul>a")),
    TAG_NEWS_BUTTON(By.cssSelector("div.tags item-block > : nth-child(2)")),
    TAG_ADS_BUTTON(By.cssSelector("div.tags item-block > : nth-child(3)")),
    TAG_EVENTS_BUTTON(By.cssSelector("div.tags item-block > : nth-child(4)")),
    TAG_INITIATIVES_BUTTON(By.cssSelector("div.tags item-block > : nth-child(5)")),
    TAG_EDUCATION_BUTTON(By.cssSelector("div.tags item-block > : nth-child(6)")),
    SOURCE_FIELD(By.cssSelector("input[formcontrolname='source']")),
    CONTENT_FIELD(By.cssSelector("div.textarea-wrapper > textarea")),
    PUBLISH_BUTTON(By.cssSelector("div.submit-buttons > button[type='submit']"));

    private final By path;

    CreateNewsLocator(By path){
        this.path = path;
    }

    @Override
    public By getPath(){
        return path;
    }


}

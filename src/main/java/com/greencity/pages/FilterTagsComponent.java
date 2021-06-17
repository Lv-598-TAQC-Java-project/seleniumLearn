package com.greencity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterTagsComponent {

    private final WebDriver driver;
    private final WebElement newsItem;

    public FilterTagsComponent(WebDriver driver, WebElement newsItem) {
        this.driver = driver;
        this.newsItem = newsItem;

    }

}

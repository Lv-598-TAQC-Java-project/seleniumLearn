package com.greencity.pages;

import com.greencity.elements.Link;
import com.greencity.locators.CreateNewsLocator;
import com.greencity.locators.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.greencity.locators.CreateNewsLocator.TAG_LIST;

public class CreateNewsPage extends BaseCommon {

    private Link title;
    private List<Link> tags;
    private Link source;
    private Link content;
    private Link publishButton;

    public CreateNewsPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    public void initElements() {

        title = new Link(CreateNewsLocator.TITLE_FIELD, this.webDriver);
        initTagsButtons();
        source = new Link(CreateNewsLocator.SOURCE_FIELD, this.webDriver);
        content = new Link(CreateNewsLocator.CONTENT_FIELD, this.webDriver);
        publishButton = new Link(CreateNewsLocator.PUBLISH_BUTTON, this.webDriver);
    }

    public void initTagsButtons() {
        tags = new ArrayList<>();
        for (WebElement linkElement : webDriver.findElements(TAG_LIST.getPath())) {
            tags.add(new Link(linkElement));
        }
    }

    public CreateNewsPage addTitle() {
        title.sendKeys("THE CLIMATE MARCH FOREST");
        return this;
    }

    public CreateNewsPage addTwoTags() {
        List<Tag> tags = new ArrayList<>();
        tags.add(Tag.NEWS);
        tags.add(Tag.EVENTS);
        return this;
    }

    public CreateNewsPage addThreeTags(){
        List<Tag> tags = new ArrayList<>();
        tags.add(Tag.ADS);
        tags.add(Tag.INITIATIVES);
        tags.add(Tag.EDUCATION);
        return this;
    }

    public CreateNewsPage addSource() {
        source.sendKeys("https://fundaforest.eu/");
        return this;
    }

    public CreateNewsPage addContent() {
        content.sendKeys("Be the change you want to see in the world!");
        return this;
    }

    public CreateNewsPage clickOnPublishButton() {
        publishButton.click();
        return new CreateNewsPage(webDriver); //but I need EcoNewsPage (?)
    }


}

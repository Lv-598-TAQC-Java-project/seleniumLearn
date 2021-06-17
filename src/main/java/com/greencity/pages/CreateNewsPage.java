package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.InputElement;
import com.greencity.elements.Link;
import com.greencity.locators.CreateNewsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.greencity.locators.CreateNewsLocator.TAG_LIST;

public class CreateNewsPage extends BaseCommon {

    private InputElement title;
    //private List<Link> tags;
    private ButtonElement tagNews;
    private ButtonElement tagAds;
    private ButtonElement tagEvents;
    private ButtonElement tagInitiatives;
    private ButtonElement tagEducation;
    private InputElement source;
    private InputElement content;
    private ButtonElement publishButton;



    public CreateNewsPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }

    public void initElements() {

        title = new InputElement(CreateNewsLocator.TITLE_FIELD, this.webDriver);
        //initTagsButtons();
        tagNews = new ButtonElement(CreateNewsLocator.TAG_NEWS_BUTTON, this.webDriver);
        tagAds = new ButtonElement(CreateNewsLocator.TAG_ADS_BUTTON, this.webDriver);
        tagEvents = new ButtonElement(CreateNewsLocator.TAG_EVENTS_BUTTON, this.webDriver);
        tagInitiatives = new ButtonElement(CreateNewsLocator.TAG_INITIATIVES_BUTTON, this.webDriver);
        tagEducation = new ButtonElement(CreateNewsLocator.TAG_EDUCATION_BUTTON, this.webDriver);
        source = new InputElement(CreateNewsLocator.SOURCE_FIELD, this.webDriver);
        content = new InputElement(CreateNewsLocator.CONTENT_FIELD, this.webDriver);
        publishButton = new ButtonElement(CreateNewsLocator.PUBLISH_BUTTON, this.webDriver);
    }

//    public void initTagsButtons() {
//        tags = new ArrayList<>();
//        for (WebElement linkElement : webDriver.findElements(TAG_LIST.getPath())) {
//            tags.add(new Link(linkElement));
//        }
//    }

    public CreateNewsPage addTitle() throws InterruptedException {
        title.sendKeys("THE CLIMATE MARCH FOREST");
        Thread.sleep(1000);
        return this;
    }


    public CreateNewsPage addTwoTags() throws InterruptedException {
        tagNews.clickOnButton();
        tagAds.clickOnButton();
        Thread.sleep(1000);
        return this;
    }

    public CreateNewsPage addThreeTags() throws InterruptedException {
        tagEvents.clickOnButton();
        tagInitiatives.clickOnButton();
        tagEducation.clickOnButton();
        Thread.sleep(1000);
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
        publishButton.clickOnButton();
        return new CreateNewsPage(webDriver);
    }


}

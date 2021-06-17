package com.greencity.econews;

import com.greencity.pages.CreateNewsPage;
import com.greencity.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewsTest extends TestRunner {

    @BeforeMethod
    public void startForCreateNews() throws InterruptedException {
        CreateNewsPage welcomePage = new WelcomePage(webDriver)
                .getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage()
                .clickOnCreateNewsBtn();
    }

    @Test
    public void createNewsTestOne() throws InterruptedException {
        CreateNewsPage createNewsPage = new CreateNewsPage(webDriver);
        createNewsPage
                .addTitle()
                .addTwoTags()
                .addSource()
                .addContent()
                .clickOnPublishButton();
    }

    @Test
    public void createNewsTestTwo() throws InterruptedException {
        CreateNewsPage createNewsPage = new CreateNewsPage(webDriver);
        createNewsPage
                .addTitle()
                .addThreeTags()
                .addSource()
                .addContent()
                .clickOnPublishButton();
    }
}

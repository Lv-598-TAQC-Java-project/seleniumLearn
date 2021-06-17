package com.greencity.econews;

import com.greencity.elements.Label;
import com.greencity.locators.NewsPageLocator;
import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.NewsItemsContainer;
import com.greencity.pages.WelcomePage;
import com.greencity.utils.WaitWrapper;
import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;

public class EcoNewsPageFiltersTest extends TestRunner {

    @Test(priority = 1)
    public void newsFilterTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
       NewsItemsContainer newsItemsContainer = new WelcomePage(webDriver)
                .getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter()
                .goToNewsItemContainer()
                .pressEndBtn();
        String[] s = newsItemsContainer
                .getItemsLblText()
                .split(" ");
        System.out.println(Arrays.toString(s));
        int expected = Integer.parseInt(s[0]);
        int actual = newsItemsContainer
                .getItemComponentsCount();

        softAssert.assertEquals(actual, expected);
        EcoNewsPage ecoNewsPage = newsItemsContainer.goToEcoNewsPage();
        ecoNewsPage.refresh();
        ecoNewsPage.clickOnNewsFilterPressed();
        Thread.sleep(3000);
        ecoNewsPage.goToWelcomePage();

    }

    @Test(priority = 2)
    @Description("Verifies that number of news and description are the same")
    public void newTest() {
        String[] s = new WelcomePage(webDriver)
                .getHeader()
                .goToEcoNewsPage()
                .getItemsLblText()
                .split(" ");
        int expected = Integer.parseInt(s[0]);
        int actual = new WelcomePage(webDriver).getHeader().goToEcoNewsPage()
                .goToNewsItemContainer()
                .pressEndBtn()
                .getItemsSize();
        Assert.assertEquals(actual, expected);

    }
}

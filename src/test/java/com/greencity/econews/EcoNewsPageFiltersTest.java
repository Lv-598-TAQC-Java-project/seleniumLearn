package com.greencity.econews;

import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.WelcomePage;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EcoNewsPageFiltersTest extends TestRunner {

    @Test
    public void newsFilterTest() {
        EcoNewsPage ecoNewsPage = new WelcomePage(webDriver)
                .getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter();
        String[] s = ecoNewsPage
                .getItemsLblText()
                .split(" ");
        System.out.println(Arrays.toString(s));
        int expected = Integer.parseInt(s[0]);
        int actual = ecoNewsPage
                .goToNewsItemContainer()
                .pressEndBtn()
                .getItemComponentsCount();

      //  ecoNewsPage.clickOnNewsFilter();
        Assert.assertEquals(actual, expected);
    }

    @Test
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

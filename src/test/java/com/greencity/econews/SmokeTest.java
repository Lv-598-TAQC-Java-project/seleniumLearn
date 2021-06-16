package com.greencity.econews;

import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.WelcomePage;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SmokeTest extends TestRunner {
    WelcomePage welcomePage;
    EcoNewsPage ecoNewsPage;

    @Test
    public void smokeTest() {
        int actual = new WelcomePage(webDriver).getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter()
                .goToNewsItemContainer()
                .pressEndBtn()
                .getItemsSize();
        System.out.println(actual);
        String[] s = new WelcomePage(webDriver)
                .getHeader()
                .goToEcoNewsPage()
                .getItemsLblText()
                .split(" ");
        System.out.println(Arrays.toString(s));
        int expected = Integer.parseInt(s[0]);
        Assert.assertEquals(actual, expected);
    }

    @Test
    @Description("Verifies that number of news and description are the same")
    public void newTest() {
        int actual = new WelcomePage(webDriver).getHeader().goToEcoNewsPage()
                .goToNewsItemContainer()
                .pressEndBtn()
                .getItemsSize();
        String[] s = new WelcomePage(webDriver)
                .getHeader()
                .goToEcoNewsPage()
                .getItemsLblText()
                .split(" ");
        System.out.println(Arrays.toString(s));
        int expected = Integer.parseInt(s[0]);
        Assert.assertEquals(actual, expected);

    }
}




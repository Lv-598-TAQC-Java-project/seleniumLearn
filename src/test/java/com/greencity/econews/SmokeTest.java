//package com.greencity.econews;
//
//import com.greencity.pages.EcoNewsPage;
//import com.greencity.pages.WelcomePage;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.awt.*;
//
//public class SmokeTest extends TestRunner {
//    WelcomePage welcomePage;
//    EcoNewsPage ecoNewsPage;
//    @BeforeClass
//    public void start() {
//         ecoNewsPage = loadApplication().getHeader().goToEcoNewsPage();
//    }
//    @Test
//    public void smokeTest() throws  AWTException {
//    // працює через раз
//        int a = ecoNewsPage
//                .goToNewsItemContainer()
//                .pressEndBtn()
//                .getItemsSize();
//        System.out.println(a);
//
//    }
//
//    @Test
//    public void newTest() throws AWTException {
//       ecoNewsPage.scroll();
//        int actual =ecoNewsPage
//                .goToNewsItemContainer()
//                .getItemsSize();
//        System.out.println(actual);
//        String[] s=ecoNewsPage.getItemsLblText().split(" ");
//        int expected = Integer.parseInt(s[0]);
//        Assert.assertEquals(actual,expected);
//
//    }
//}
//
//
//

package com.greencity.econews;

import com.greencity.pages.CurrentEcoNewsPage;
import com.greencity.pages.WelcomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommentReplyTest extends TestRunner {
    CurrentEcoNewsPage currentPage;

    @BeforeMethod
    public void loadInitPage() {

        try {
            currentPage = new WelcomePage(webDriver)
                    .getHeader()
                    .goToSignInPage()
                    .signIn()
                    .getHeader()
                    .goToEcoNewsPage()
                    .clickOnNewsFilter().findNews();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        currentPage.goToComment();



    }

    @Test
    public void preconditionLoginTest() {
    }
}

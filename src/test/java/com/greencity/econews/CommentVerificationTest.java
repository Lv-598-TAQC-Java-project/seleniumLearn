package com.greencity.econews;

import com.greencity.pages.CurrentEcoNewsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommentVerificationTest extends TestRunner {
    CurrentEcoNewsPage  currentPage;
    @BeforeMethod
    public void loadInitPage() throws InterruptedException {

 currentPage = loadApplication()
                .getHeader()
                .goToSignInPage()
                .signIn()
                .getHeader()
                .goToEcoNewsPage()
                .clickOnNewsFilter().findNews();

        currentPage.goToComment();


    }

    @Test
    public void preconditionLoginTest() throws InterruptedException {




    }





}




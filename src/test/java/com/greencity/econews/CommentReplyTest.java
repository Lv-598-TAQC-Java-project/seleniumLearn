package com.greencity.econews;

import com.greencity.locators.CommentItemComponentLocator;
import com.greencity.pages.CommentItemComponentPage;
import com.greencity.pages.CurrentEcoNewsPage;
import com.greencity.pages.ReplyComponent;
import com.greencity.pages.WelcomePage;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommentReplyTest extends TestRunner {
    private final String replyText = "Test reply";
    CurrentEcoNewsPage currentPage;
    ReplyComponent replyComponent;

    @Test
    public void creatingCommentAndReplyToNews() {
        try {
            currentPage = new WelcomePage(webDriver)
                    .getHeader()
                    .goToSignInPage()
                    .signIn()
                    .getHeader()
                    .goToEcoNewsPage().findNews();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        currentPage.goToComment();
        replyComponent
                .getReplyComment()
                .click();
    }
}

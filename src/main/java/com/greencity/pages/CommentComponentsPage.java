package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.TextAreaElement;
import com.greencity.locators.CommentComponentsLocator;
import org.openqa.selenium.WebDriver;


public class CommentComponentsPage extends BaseCommon {


    private TextAreaElement addComment;
    private ButtonElement comment;
    private CommentItemComponentPage commentItemComp;


    public CommentComponentsPage(WebDriver webDriver) {
        super(webDriver);
        initElement();
    }


    public void initElement() {

        addComment = new TextAreaElement(CommentComponentsLocator.ADD_COMMENT, this.webDriver);
        comment = new ButtonElement(CommentComponentsLocator.COMMENT_BUTTON, this.webDriver);

    }
    public TextAreaElement getTextCommentArea(){
        if(comment==null){
            addComment = new TextAreaElement(CommentComponentsLocator.ADD_COMMENT, this.webDriver);
        }
        return addComment;


    }

    public void initcomentItemComp() {

        commentItemComp = new CommentItemComponentPage(webDriver);
    }

//    public void clickOnTextArea() {
//        addComment.click();
//
//    }



    public CommentComponentsPage typeComment(String s) {
        addComment=getTextCommentArea();
        addComment.click();
        addComment.clear();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        addComment.enterText(s);
        comment.clickOnButton();
        return this;



    }
    public CommentItemComponentPage deleleteComment(){
        commentItemComp.clickButtonDelete();
        return new CommentItemComponentPage(webDriver);
    }




}


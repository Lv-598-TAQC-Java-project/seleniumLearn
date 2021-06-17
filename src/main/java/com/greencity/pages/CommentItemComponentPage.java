package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.locators.CommentItemComponentLocator;
import com.greencity.locators.ReplyLocator;
import org.openqa.selenium.WebDriver;

public class CommentItemComponentPage extends BaseCommon {
    //private LabelElement ownerOfComment;
    //    private LabelElement dateOfCreation;
    private ButtonElement deleteButton;
    // private WebElement rootElement;
    private ButtonElement replyButton;

    public CommentItemComponentPage(WebDriver webDriver) {
        super(webDriver);
        //this.rootElement=rootElement;
        initElements();
    }

    public void initElements() {
//        ownerOfComment=new LabelElement(CommentItemComponentLocator.OWNER_OF_COMMENT,this.webDriver);
//        dateOfCreation= new LabelElement(CommentItemComponentLocator.DATE_CREATION,this.webDriver);
        deleteButton = new ButtonElement(CommentItemComponentLocator.DELETE_BUTTON, this.webDriver);
        replyButton = new ButtonElement(ReplyLocator.REPLY_REPLY_BUTTON, this.webDriver);
    }

    public DeletePopUpCommentPage clickButtonDelete() {
        deleteButton.clickOnButton();
        return new DeletePopUpCommentPage(webDriver);
    }



}

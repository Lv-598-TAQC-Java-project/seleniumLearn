package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.LabelElement;
import com.greencity.locators.CommentItemComponentLocator;
import org.openqa.selenium.WebDriver;

public class CommentItemComponentPage extends BaseCommon {
    private LabelElement ownerOfComment;
    private LabelElement dateOfCreation;
    private ButtonElement deleteButton;



    public CommentItemComponentPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }
    public void initElements(){
        ownerOfComment=new LabelElement(CommentItemComponentLocator.OWNER_OF_COMMENT,this.webDriver);
        dateOfCreation= new LabelElement(CommentItemComponentLocator.DATE_CREATION,this.webDriver);
        deleteButton=new ButtonElement(CommentItemComponentLocator.DELETE_BUTTON,this.webDriver);



    }


}
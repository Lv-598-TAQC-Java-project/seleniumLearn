package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.LabelElement;

import com.greencity.elements.TextAreaElement;
import com.greencity.locators.CommentComponentsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import static com.greencity.locators.CommentComponentsLocator.ALL_BUTTON;


public class CommentComponentsPage extends BaseCommon {

    //private LabelElement commentLabel;
    private TextAreaElement addComment;
    private ButtonElement comment;
    private List<ButtonElement> commentItemComp;


    public CommentComponentsPage(WebDriver webDriver) {
        super(webDriver);
        initElement();
    }


    public void initElement() {
       // commentLabel = new LabelElement(CommentComponentsLocator.COMMENT_LABEL, this.webDriver);
        addComment = new TextAreaElement(CommentComponentsLocator.ADD_COMMENT, this.webDriver);
        comment = new ButtonElement(CommentComponentsLocator.COMMENT_BUTTON, this.webDriver);
        initcomentItemComp();
    }

    public void initcomentItemComp(){
        commentItemComp=new ArrayList<ButtonElement>();
        for (WebElement linkElement : webDriver.findElements(ALL_BUTTON.getPath())) {
            commentItemComp.add(new ButtonElement(linkElement));

    }

//    public void goToComment(){
//       addComment.click();}


}}


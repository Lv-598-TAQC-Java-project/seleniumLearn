package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.LabelElement;
import com.greencity.locators.DeletePopUpCommentLocator;
import org.openqa.selenium.WebDriver;

public class DeletePopUpCommentPage extends BasePopUp{
     private LabelElement warningMessage;
     private ButtonElement cancel;
     private ButtonElement yesDelete;
     private ButtonElement close;

     public DeletePopUpCommentPage(WebDriver webDriver) {
          super(webDriver);
          initElements();
     }

     public void initElements(){

          warningMessage=new LabelElement(DeletePopUpCommentLocator.WARNING_MESSAGE,this.webDriver);
          cancel=new ButtonElement(DeletePopUpCommentLocator.CANCEL_BUTTON,this.webDriver);
          yesDelete=new ButtonElement(DeletePopUpCommentLocator.YES_DELETE_BUTTON,this.webDriver);
          close=new ButtonElement(DeletePopUpCommentLocator.CLOSE_BUTTON,this.webDriver);

     }



     //getText


}

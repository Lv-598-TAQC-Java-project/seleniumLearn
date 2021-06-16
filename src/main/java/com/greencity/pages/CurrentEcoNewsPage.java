package com.greencity.pages;

import com.greencity.elements.ImageElement;
import com.greencity.elements.LabelElement;
import com.greencity.elements.Link;
import com.greencity.elements.TextAreaElement;
import com.greencity.locators.CurrentEcoNewsLocator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
;
import static com.greencity.locators.CurrentEcoNewsLocator.TAGS_LIST;


public class CurrentEcoNewsPage extends BaseCommon {
    private Link backToNews;
    private List<Link> tagsList;
    private LabelElement newsTitle;
    private LabelElement creationDate;
    private LabelElement ownerOfNews;
    private ImageElement newsImage;
    private TextAreaElement descriptonNews;
    private Link source;
    private CommentComponentsPage comentComponent;


    public CurrentEcoNewsPage(WebDriver webDriver) {
        super(webDriver);
        initElements();

    }


    public void initElements() {
        backToNews = new Link(CurrentEcoNewsLocator.BACK_TO_NEWS, this.webDriver);
        initTagButton();
        newsTitle = new LabelElement(CurrentEcoNewsLocator.NEWS_TITLE, this.webDriver);
        creationDate = new LabelElement(CurrentEcoNewsLocator.CREATION_DATE, this.webDriver);
        ownerOfNews = new LabelElement(CurrentEcoNewsLocator.OWNER_OF_NEWS, this.webDriver);
        newsImage = new ImageElement(CurrentEcoNewsLocator.NEWS_IMAGE, this.webDriver);
        descriptonNews = new TextAreaElement(CurrentEcoNewsLocator.DESCRIPTION_NEWS, this.webDriver);
        source = new Link(CurrentEcoNewsLocator.LINK_SOURCE, this.webDriver);
        comentComponent = new CommentComponentsPage(webDriver);


    }

    public void initTagButton() {
        tagsList = new ArrayList<>();
        for (WebElement linkElement : webDriver.findElements(TAGS_LIST.getPath())) {
            tagsList.add(new Link(linkElement));

        }
    }
  public void goToComment(){
      Actions actions=new Actions(webDriver);
      actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
       // return new CommentComponentsPage();

  }


//        public void chooseTags(){
//           tagsList=new ArrayList<>();
//            for(WebElement linkElement: webDriver.findElements(TAGS_LIST.getPath())){
//                tagsList.add(new Link(linkElement));
//                linkElement.click();}}


    @Override
    public Header getHeader() {
        return super.getHeader();
    }


}





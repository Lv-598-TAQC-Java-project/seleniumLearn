package com.greencity.pages;

import com.greencity.locators.NewsPageLocator;
import com.greencity.utils.ScrollWrapper;
import com.greencity.utils.WaitWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import static com.greencity.locators.NewsPageLocator.DISPLAYED_ARTICLES;


public class NewsItemsContainer {
    private WebDriver webDriver;
    private By items = DISPLAYED_ARTICLES.getPath();
    private List<NewsItemComponent> itemComponents;
    public NewsItemsContainer(WebDriver driver) {
        this.webDriver = driver;
    }

    private List<NewsItemComponent> getItemComponents() {
        itemComponents = new ArrayList<>();
        for (WebElement current : getItems()) {
            itemComponents.add(new NewsItemComponent(webDriver, current));
        }
        return itemComponents;
    }
    private List<WebElement> getItems() {
        WaitWrapper waitWrapper = new WaitWrapper(webDriver);

        return waitWrapper.setExplicitlyWait(webDriver,5,
                ExpectedConditions.presenceOfAllElementsLocatedBy(items));
    }
    public int getItemsSize() {
        return getItems().size();
    }
    public int getItemComponentsCount() {
        return getItemComponents().size();
    }
    public void scroll() {
        ScrollWrapper.scrollPageToDown(NewsPageLocator.LOAD_CIRCLE.getPath(), this.webDriver);
    }

    public NewsItemsContainer pressEndBtn()  {
        boolean flag =true;
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            do {
                robot.keyPress(KeyEvent.VK_END);
                robot.delay(1000);
                robot.keyRelease(KeyEvent.VK_END);
                WebElement webElement = webDriver.findElement(NewsPageLocator.LOAD_CIRCLE.getPath());
                if(webElement == null){
                    robot.keyPress(KeyEvent.VK_END);
                    robot.delay(2000);
                    robot.keyRelease(KeyEvent.VK_END);
                    flag =false;
                    break;
                }
            }
            while (flag);
        }catch (NoSuchElementException noE){
            robot.keyPress(KeyEvent.VK_END);
            robot.delay(2000);
            robot.keyRelease(KeyEvent.VK_END);
        }

        return this;

    }



}

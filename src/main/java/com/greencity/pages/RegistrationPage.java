package com.greencity.pages;

import com.greencity.elements.ButtonElement;
import com.greencity.elements.InputElement;
import com.greencity.elements.Link;
import com.greencity.locators.NewsPageLocator;
import com.greencity.locators.RegistrationFormLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

    ///region WebElements
    private InputElement emailField;
    private InputElement userNameField;
    private InputElement passwordField;
    private InputElement confirmPasswordField;
    private ButtonElement signUpBtn;
    private Link userIsRegistered;
    private Link negativeEmail;
    private Link passwordError;
    ///endregion


    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }



    public void initElements() {

        emailField = new InputElement(RegistrationFormLocator.EMAIL, this.webDriver);
        userNameField = new InputElement(RegistrationFormLocator.USER_NAME, this.webDriver);
        passwordField = new InputElement(RegistrationFormLocator.PASSWORD_FOR_REGISTRATION, this.webDriver);
        confirmPasswordField = new InputElement(RegistrationFormLocator.PASSWORD_FOR_CONFIRMATION, this.webDriver);
        signUpBtn = new ButtonElement(RegistrationFormLocator.SIGN_UP, this.webDriver);



    }

    public RegistrationPage clickOnSubmitButton(){
        signUpBtn.clickOnButton();
        return this;
    }



    public RegistrationPage clickOnEmailField (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        emailField.click();
        return this;
    }

    public RegistrationPage enterEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage clickOnUserNameField (){
        userNameField.click();
        return this;
    }

    public RegistrationPage enterUserName(String userName){
        userNameField.sendKeys(userName);
        return this;
    }

    public RegistrationPage clickOnPasswordField (){
        passwordField.click();
        return this;
    }

    public RegistrationPage enterPassword(String password){
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        return this;
    }


    public RegistrationPage clickOnConfirmPasswordField (){
        confirmPasswordField.click();
        return this;
    }

    public RegistrationPage enterConfirmationPassword(String password){
        confirmPasswordField.sendKeys(password);
        return this;
    }


    public String getDataForAssertPasswordError(){
        passwordError = new Link(RegistrationFormLocator.PASSWORD_ERROR,this.webDriver);
        String actualResult;
        return actualResult = passwordError.getText();
    }
    public String getDataForAssertNegativeEmail(){
        negativeEmail = new Link(RegistrationFormLocator.EMAIL_ERROR,this.webDriver);
        String actualResult;
        return actualResult = negativeEmail.getText();
    }
    public String getDataUserIsRegistered(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//simple-snack-bar[@class = 'mat-simple-snackbar ng-star-inserted']")));
        userIsRegistered = new Link(RegistrationFormLocator.USER_REGISTERED,this.webDriver);
        String actualtResult;
        return actualtResult = userIsRegistered.getText();
    }


}

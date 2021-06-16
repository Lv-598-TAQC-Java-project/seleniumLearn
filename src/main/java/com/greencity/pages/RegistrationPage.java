package com.greencity.pages;

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
    private Link emailField;
    private Link userNameField;
    private Link passwordField;
    private Link confirmPasswordField;
    private Link signUpBtn;
    private Link userIsRegistered;
    private Link negativeEmail;
    private Link passwordError;
    ///endregion


    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
        initElements();
    }


    public Link getUserIsRegistered() {
        return userIsRegistered;
    }

    public void initElements() {

        emailField = new Link(RegistrationFormLocator.EMAIL, this.webDriver);
        userNameField = new Link(RegistrationFormLocator.USER_NAME, this.webDriver);
        passwordField = new Link(RegistrationFormLocator.PASSWORD_FOR_REGISTRATION, this.webDriver);
        confirmPasswordField = new Link(RegistrationFormLocator.PASSWORD_FOR_CONFIRMATION, this.webDriver);
        signUpBtn = new Link(RegistrationFormLocator.SIGN_UP, this.webDriver);



    }

    public RegistrationPage clickOnSignUp(){
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//simple-snack-bar[@class = 'mat-simple-snackbar ng-star-inserted']")));
        userIsRegistered = new Link(RegistrationFormLocator.USER_REGISTERED,this.webDriver);
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


    public void assertIsUserRegistered(){
        String expectedResult = "You have successfully registered on the site. Please confirm your email address in the email box.\n" +
                "X";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//simple-snack-bar[@class = 'mat-simple-snackbar ng-star-inserted']")));
        userIsRegistered = new Link(RegistrationFormLocator.USER_REGISTERED,this.webDriver);
        Assert.assertEquals(userIsRegistered.getText(), expectedResult);
    }

    public void assertNegativeEmail(){
        String expectedResult = "Please check that your e-mail address is indicated correctly";
        negativeEmail = new Link(RegistrationFormLocator.EMAIL_ERROR,this.webDriver);
        Assert.assertEquals(expectedResult,negativeEmail.getText());

    }

    public void assertShortPasswordRegistration(){
        String expectedResult = "Password must be at least 8 characters long";
        passwordError = new Link(RegistrationFormLocator.PASSWORD_ERROR,this.webDriver);
        Assert.assertEquals(expectedResult,passwordError.getText());
    }
    public void assertNegativePasswordRegistration(){
        String expectedResult = "Password has contain at least one character of Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
        passwordError = new Link(RegistrationFormLocator.PASSWORD_ERROR,this.webDriver);
        Assert.assertEquals(expectedResult,passwordError.getText());
    }




}

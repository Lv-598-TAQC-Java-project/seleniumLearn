package com.greencity.econews;

import com.greencity.data.RegisterModel;
import com.greencity.data.RegisterModelRepository;
import com.greencity.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestRunner {



    @Test
    public void registrationANewUserTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();


        WelcomePage welcomePage = new WelcomePage(webDriver);
        String actualResult = welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnEmailField()
                .enterEmail(registerModel.getEmail())
                .clickOnUserNameField()
                .enterUserName(registerModel.getUserName())
                .clickOnPasswordField()
                .enterPassword(registerModel.getPassword())
                .clickOnSubmitButton().getDataUserIsRegistered();
        String expectedResult = "You have successfully registered on the site. Please confirm your email address in the email box.\n" +
             "X";
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void negativeEmailRegistrationTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        WelcomePage welcomePage = new WelcomePage(webDriver);
        String actualResult = welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnEmailField()
                .enterEmail(registerModel.getNegativeEmail())
                .clickOnUserNameField()
                .enterUserName(registerModel.getUserName())
                .clickOnPasswordField()
                .enterPassword(registerModel.getPassword())
                .clickOnSubmitButton().getDataForAssertNegativeEmail();
        String expectedResult = "Please check that your e-mail address is indicated correctly";
        Assert.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void negativeShortPasswordRegistrationTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        WelcomePage welcomePage = new WelcomePage(webDriver);
        String actualResult = welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnPasswordField()
                .enterPassword(registerModel.getShortPassword())
                .clickOnSubmitButton()
                .getDataForAssertPasswordError();
        String expectedResult = "Password must be at least 8 characters long";
        Assert.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void negativePasswordRegistrationTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        WelcomePage welcomePage = new WelcomePage(webDriver);
        String actualResult = welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnPasswordField()
                .enterPassword(registerModel.getNegativePassword())
                .clickOnSubmitButton()
                .getDataForAssertPasswordError();
        String expectedResult = "Password has contain at least one character of Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
        Assert.assertEquals(expectedResult,actualResult);

    }


}

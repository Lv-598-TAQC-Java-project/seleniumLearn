package com.greencity.econews;

import com.greencity.data.RegisterModel;
import com.greencity.data.RegisterModelRepository;
import com.greencity.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestRunner {


    WebDriver driver;

    @Test
    public void registrationANewUserTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();


        WelcomePage welcomePage = loadApplication();
        String temp = welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnEmailField()
                .enterEmail(registerModel.getEmail())
                .clickOnUserNameField()
                .enterUserName(registerModel.getUserName())
                .clickOnPasswordField()
                .enterPassword(registerModel.getPassword())
                .clickOnSignUp().getUserIsRegistered().getText();


        String expectedResult = "You have successfully registered on the site. Please confirm your email address in the email box.\n" +
             "X";
        Assert.assertEquals(temp, expectedResult);
    }


    @Test
    public void negativeEmailRegistrationTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        WelcomePage welcomePage = loadApplication();
        welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnEmailField()
                .enterEmail(registerModel.getNegativeEmail())
                .clickOnUserNameField()
                .enterUserName(registerModel.getUserName())
                .clickOnPasswordField()
                .enterPassword(registerModel.getPassword())
                .clickOnSignUp()
                .assertNegativeEmail();

    }
    @Test
    public void negativeShortPasswordRegistrationTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        WelcomePage welcomePage = loadApplication();
        welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnPasswordField()
                .enterPassword(registerModel.getShortPassword())
                .clickOnSignUp()
                .assertShortPasswordRegistration();


    }
    @Test
    public void negativePasswordRegistrationTest()
    {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        WelcomePage welcomePage = loadApplication();
        welcomePage.getHeader()
                .clickOnSignUp()
                .clickOnPasswordField()
                .enterPassword(registerModel.getNegativePassword())
                .clickOnSignUp()
                .assertNegativePasswordRegistration();


    }


}

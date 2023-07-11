package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class MyAccountsTest extends BaseTest {
    String email;
    MyAccountsPage myAccountPage = new MyAccountsPage();
    RegisterPage registerPage = new RegisterPage();

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Register Account";
        String actualMessage = registerPage.getRegisterAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Returning Customer";
        String actualMessage = loginPage.getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        registerPage.enterFirstName("Khushi");
        registerPage.enterLastName("Mishra");
        registerPage.enterEmail("khushi1234@gmail.com");
        registerPage.enterPhoneNumber("0744667788");
        registerPage.enterPassword("Khushi@123");
        registerPage.enterConfirmPassword("Khushi@123");
        registerPage.selectSubscribeButton("Yes");
        registerPage.clickOnAgree();
        registerPage.clickOnContinue();

        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = registerPage.getAccountCreatedText();
        Assert.assertEquals(expectedMessage, actualMessage);
        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);

        expectedMessage = "Account Logout";
        actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        loginPage.enterEmailId("khushi1234@gmail.com");
        loginPage.enterPassword("Khushi@123");
        loginPage.clickOnLogin();
        String expectedMessage = "My Account";
        String actualMessage = homePage.getMyAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);
        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);

        expectedMessage = "Account Logout";
        actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

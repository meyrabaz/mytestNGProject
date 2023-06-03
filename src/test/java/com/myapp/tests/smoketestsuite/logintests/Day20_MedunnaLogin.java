package com.myapp.tests.smoketestsuite.logintests;

import com.myapp.pages.MedunnaHomePage;
import com.myapp.pages.MedunnaLoginPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import org.testng.annotations.Test;

public class Day20_MedunnaLogin {
    /*
        Admin can sign in
    /*
    Given
        Go to https://medunna.com/
    When
        Click on "user icon"
    And
        Click on "Sign In" option
    And
        Enter username into "Username" input
    And
        Enter password into "Password" input
    And
        Click on "Remember me" check box
    And
        Click on "Sign in" submit button
    And
        Verify user singed in
     */

    @Test
    public void signInTest(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

//        Go to https://medunna.com/
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

//        Click on "user icon"
        medunnaHomePage.userIcon.click();


//        Click on "Sign In" option
        medunnaHomePage.signInLink.click();

//        Enter username into "Username" input
        medunnaLoginPage.usernameInput.sendKeys("mark_twain");

//        Enter password into "Password" input
        medunnaLoginPage.passwordInput.sendKeys("Mark.123");

//        Click on "Remember me" check box
        medunnaLoginPage.rememberMeCheckBox.click();

//        Click on "Sign in" submit button
        medunnaLoginPage.signInSubmitButton.click();

//        Verify user singed in
        //Homework


    }


}
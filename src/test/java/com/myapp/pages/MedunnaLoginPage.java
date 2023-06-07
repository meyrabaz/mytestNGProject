package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedunnaLoginPage {

    public MedunnaLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

}
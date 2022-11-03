package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "inputEmail")
    public WebElement emailInputField;

    @FindBy(id = "inputPassword")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button")
    public WebElement submitButton;


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
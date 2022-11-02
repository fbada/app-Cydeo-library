package com.cydeo.pages;

import com.cydeo.utilitiies.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

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
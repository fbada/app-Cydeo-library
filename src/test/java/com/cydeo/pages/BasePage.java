package com.cydeo.pages;

import com.cydeo.utilitiies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
//
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement libraryDashIcon;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksDashIcon;

    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public  WebElement userDashIcon;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userPageIcon;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardPageIcon;





    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
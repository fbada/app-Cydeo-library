package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserPage {
    public UserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[@id='user_count']")
    public WebElement librarianUserCount;

    @FindBy(xpath = "//a[@id ='navbarDropdown']/span")
    public WebElement userProfile;


    @FindBy(tagName = "th")
    public List<WebElement> tableContents;
    //contents for the libararian USERS page



}
